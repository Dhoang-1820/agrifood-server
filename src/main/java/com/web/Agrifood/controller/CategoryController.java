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

import com.web.Agrifood.interfaceServices.ICategoryServices;
import com.web.Agrifood.interfaceServices.IStorageServices;
import com.web.Agrifood.model.Category;
import com.web.Agrifood.model.ResponseObject;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:3001")
public class CategoryController {
	public static final String API = "http://localhost:8080/api/uploadfiles/files/" ;
	
	@Autowired
	IStorageServices storageServices;
	
	@Autowired
	ICategoryServices categoryServices;
	
	@GetMapping("/categories")
	public ResponseEntity<ResponseObject> getAll() {
		try {
			List<Category> categories = categoryServices.getAllCategory();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", categories));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
		
	}
	
	@GetMapping("/category/id/{id}")
	public ResponseEntity<ResponseObject> getCategoryById(@PathVariable("id") int id) {
		try {
			Category category = categoryServices.getCategoryById(id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", category)); 
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping("/category")
	public ResponseEntity<ResponseObject> addCategory(@RequestBody Category category) {
		
		try {
			if (categoryServices.newCategory(category) == 1) {
				return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", category));
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", category));
			}
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PutMapping("/category/edit")
	public ResponseEntity<ResponseObject> editCategory(@RequestBody Category category) {
		try {
			Category categoryResponse = categoryServices.getCategoryById(category.getId());
			
			if (categoryServices.editCategory(category) == 1) {
				return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", categoryResponse));
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "Id not found!", null));
			}
			
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@DeleteMapping("/category/delete/{id}")
	public ResponseEntity<ResponseObject> deleteCategory(@PathVariable("id") int id) {
		try {
			Category category = categoryServices.getCategoryById(id);
			if (category == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "Id not found!", null));
			}
			if (categoryServices.deleteCategory(id) == 1) {	
				return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", category));
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", category));
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", e));
		}
	}
	
}

















