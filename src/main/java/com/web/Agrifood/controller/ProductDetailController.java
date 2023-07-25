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

import com.web.Agrifood.interfaceServices.IProductDetailServices;
import com.web.Agrifood.model.ProductDetail;
import com.web.Agrifood.model.ResponseObject;

@RestController
@RequestMapping(path = "/api/")
@CrossOrigin(origins = "http://localhost:3001")
public class ProductDetailController {
	
	@Autowired
	IProductDetailServices productDetailServices;

	
	@GetMapping("product-details")
	public ResponseEntity<ResponseObject> getAll() {
		try {
			List<ProductDetail> productDetails = productDetailServices.getAllProductDetail();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", productDetails));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("product-details/parent/{id}")
	public ResponseEntity<ResponseObject> getProductDetailsByProduct(@PathVariable("id") int id) {
		try {
			List<ProductDetail> productDetails = productDetailServices.getProductDetailsByProduct(id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", productDetails));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	
	@PostMapping("product-detail")
	public ResponseEntity<ResponseObject> addProductCategory(@RequestBody ProductDetail product) {
		try {
			if (productDetailServices.newProductDetail(product) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", product));
			
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	@PutMapping("product-detail/edit")
	public ResponseEntity<ResponseObject> editProductCategory(@RequestBody ProductDetail product) {
		
		try {
			if (productDetailServices.editProductDetail(product) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", product));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@DeleteMapping("product-detail/delete/{id}")
	public ResponseEntity<ResponseObject> deleteProductCategory(@PathVariable("id") int id) {
		try {
			ProductDetail product = productDetailServices.getProducDetailtById(id);
			if (product == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "Id not found!", null));
			}
			if(productDetailServices.deleteProductDetail(id) == 0) { 
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", ""));
			}
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", ""));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
}
