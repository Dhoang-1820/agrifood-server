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

import com.web.Agrifood.interfaceServices.IProductImagesServices;
import com.web.Agrifood.model.ProductImages;
import com.web.Agrifood.model.ResponseObject;

@RestController
@RequestMapping(path = "/api/")
@CrossOrigin(origins = "http://localhost:3001")
public class ProductImagesController {
	
	@Autowired
	IProductImagesServices productImagesServices;
	
	@GetMapping("product-images")
	public ResponseEntity<ResponseObject> getAll() {
		try {
			List<ProductImages> productImages = productImagesServices.getAllProductImages();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", productImages));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("product-images/productId/{id}")
	public ResponseEntity<ResponseObject> getImagesByProductId(@PathVariable("id") int id) {
		try {
			List<ProductImages> productImages = productImagesServices.getProductImagestByProductId(id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", productImages));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping("product-image")
	public ResponseEntity<ResponseObject> addProductCategory(@RequestBody ProductImages product) {
		try {
			if (productImagesServices.newProductImages(product) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", product));
			
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	@PutMapping("product-image/edit")
	public ResponseEntity<ResponseObject> editProductCategory(@RequestBody ProductImages product) {
		
		try {
			if (productImagesServices.editProductImages(product) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", product));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@DeleteMapping("product-image/delete/{id}")
	public ResponseEntity<ResponseObject> deleteProductCategory(@PathVariable("id") int id) {
		try {
			
			if(productImagesServices.deleteProductImages(id) == 0) { 
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", ""));
			} 
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", ""));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
}
