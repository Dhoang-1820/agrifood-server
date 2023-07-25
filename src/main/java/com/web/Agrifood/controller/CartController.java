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
import com.web.Agrifood.interfaceServices.ICartServices;
import com.web.Agrifood.interfaceServices.IProductServices;
import com.web.Agrifood.model.Cart;
import com.web.Agrifood.model.ResponseObject;

@RestController
@RequestMapping(path = "/api/")
@CrossOrigin(origins = "http://localhost:3001")
public class CartController {
	
	@Autowired
	ICartServices cartServices;
	
	@Autowired
	IProductServices productServices;
	
	@GetMapping("carts")
	public ResponseEntity<ResponseObject> getAll() {
		try {
			List<Cart> carts = cartServices.getAllCarts();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", carts));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("cart/{id}")
	public ResponseEntity<ResponseObject> getCartByProductId(@PathVariable("id") int id) {
		try {
			Cart cart = cartServices.getCartByProductId(id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", cart));
					
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.noContent().build();
		}
	}  
	
	@GetMapping("cart/products")
	public ResponseEntity<Object> getProductInCart() {
		try {
			List<Cart> carts = cartServices.getAllCarts();
			JSONArray jsonArray = new JSONArray();
			carts.forEach(cart -> {
				JSONObject json = new JSONObject();
				json.put("id", cart.getId());
				json.put("product", productServices.getProductById(cart.getProductid()));
				json.put("quantity", cart.getQuantity());	
				jsonArray.add(json);
			});
//			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", jsonArray));
			return ResponseEntity.status(HttpStatus.OK).body(jsonArray);
					
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.noContent().build();
		}
	}  
	
	 
	@PostMapping("cart")
	public ResponseEntity<ResponseObject> addProduct(@RequestBody Cart cart) {
		
		try {
			if (cartServices.newCart(cart) == 1) {
				return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("error", "failure!", cart));
			}
			else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("ok", "successfully!", null));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ResponseObject("falil", "f!", e.getStackTrace()));
		}
	}
	@PutMapping("cart/edit")
	public ResponseEntity<ResponseObject> editProduct(@RequestBody Cart cart) {
		
		try {
			if (cartServices.editCart(cart) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", cart));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@DeleteMapping("cart/delete/{id}")
	public ResponseEntity<ResponseObject> deleteProduct(@PathVariable("id") int id) {
		try {
			Cart cart = cartServices.getCartById(id);
			if (cart == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "Id not found!", null));
			}
			if(cartServices.deleteCart(id) == 0) { 
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", ""));
			}
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", ""));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}

}
