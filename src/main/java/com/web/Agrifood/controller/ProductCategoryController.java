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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.Agrifood.interfaceServices.IProductCategoryServices;
import com.web.Agrifood.model.ProductCategory;
import com.web.Agrifood.model.ResponseObject;

@RestController
@RequestMapping(path = "/api/")
@CrossOrigin(origins = "http://localhost:3001")
public class ProductCategoryController {	
	
	@Autowired
	IProductCategoryServices productCategoryServices;
	
	@GetMapping("products-categories")
	public ResponseEntity<ResponseObject> getAll() {
		try {
			List<ProductCategory> productCategories = productCategoryServices.getAllProductCategory();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", productCategories));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("/products-category")
	public ResponseEntity<ResponseObject> getCategoryById(@RequestParam("id") int id) {
		try {
			ProductCategory productCategory = productCategoryServices.getProductCategoryById(id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", productCategory)); 
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping("products-category")
	public ResponseEntity<ResponseObject> addProductCategory(@RequestBody ProductCategory productCategory) {
		try {
			if (productCategoryServices.newProductCategory(productCategory) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", productCategory));
			
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PutMapping("products-category/edit")
	public ResponseEntity<ResponseObject> editProductCategory(@RequestBody ProductCategory productCategory) {
		
		try {
			if (productCategoryServices.editProductCategory(productCategory) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", productCategory));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@DeleteMapping("product-category/delete/{id}")
	public ResponseEntity<ResponseObject> deleteProductCategory(@PathVariable("id") int id) {
		try {
			ProductCategory productCategory = productCategoryServices.getProductCategoryById(id);
			if (productCategory == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "Id not found!", null));
			}
			if(productCategoryServices.deleteProductCategory(id) == 0) { 
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", ""));
			}
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", ""));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
}

















