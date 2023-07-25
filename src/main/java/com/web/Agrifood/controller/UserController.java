package com.web.Agrifood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.web.Agrifood.interfaceServices.IUserServices;
import com.web.Agrifood.model.Cart;
import com.web.Agrifood.model.ResponseObject;
import com.web.Agrifood.model.User;

@RestController
@RequestMapping(path = "/api/")
@CrossOrigin(origins = "http://localhost:3001")
public class UserController {

	@Autowired
	IUserServices userServices;
	
	@GetMapping("users")
	public ResponseEntity<ResponseObject> getAll() {
		try {
			List<User> users = userServices.getAllUsers();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", users));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("user/{id}")
	public ResponseEntity<ResponseObject> getUserById(@PathVariable("id") int id) {
		try {
			User user = userServices.getUserById(id);
			if (user == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("Not found", "Id not found!", null));
			}
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", user));
					
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.noContent().build();
		}
	}  
	
		 
	@PostMapping("user")
	public ResponseEntity<ResponseObject> addUser(@RequestBody User user) {
		
		try {
			if (userServices.newUser(user) == 1) {
				return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", user));
			}
			else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("fail", "failure!", null));
			}
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ResponseObject("fail", "failure", e.getStackTrace()));
		}
	}
	
	@PutMapping("user/edit")
	public ResponseEntity<ResponseObject> editProduct(@RequestBody User user) {
		
		try {
			System.out.println(user.getFullname());
			if (userServices.editUser(user) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", user));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.noContent().build();
		}
	}
	
	@DeleteMapping("user/delete/{id}")
	public ResponseEntity<ResponseObject> deleteProduct(@PathVariable("id") int id) {
		try {
			User user = userServices.getUserById(id);
			if (user == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("Not found", "Id not found!", null));
			}
			if(userServices.deleteUser(id) == 0) { 
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", ""));
			}
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", ""));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
}
