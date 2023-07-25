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

import com.web.Agrifood.interfaceServices.IProductServices;
import com.web.Agrifood.model.CategoriesProducts;
import com.web.Agrifood.model.Product;
import com.web.Agrifood.model.ProductWithBLOBs;
import com.web.Agrifood.model.ResponseObject;

@RestController
@RequestMapping(path = "/api/")
@CrossOrigin(origins = "http://localhost:3001")
public class ProductController {
	
	
	@Autowired
	IProductServices productServices;
	
	
	@GetMapping("products")
	public ResponseEntity<ResponseObject> getAll() {
		try {
			List<Product> products = productServices.getAllProduct();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", products));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("product/{name}")
	public ResponseEntity<ResponseObject> getIdProduct(@PathVariable("name") String name) {
		try {
			int id = productServices.getIdByName(name);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", id));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("product/id/{id}")
	public ResponseEntity<ResponseObject> getProductById(@PathVariable("id") int id) {
		try {
			Product product = productServices.getProductById(id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", product));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("products/category/{id}")
	public ResponseEntity<ResponseObject> getProductByCategory(@PathVariable("id") int id) {
		try {
			List<CategoriesProducts> products = productServices.getProductsByCategory(id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", products));
					
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping("product")
	public ResponseEntity<ResponseObject> addProduct(@RequestBody ProductWithBLOBs product) {
		
		try {
			if (productServices.newProduct(product) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			int id = productServices.getIdByName(product.getTitle());
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", id));
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ResponseObject("falil", "f!", e.getStackTrace()));
		}
	}
	@PutMapping("product/edit")
	public ResponseEntity<ResponseObject> editProduct(@RequestBody ProductWithBLOBs product) {
		
		try {
			if (productServices.editProduct(product) == 0) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", null));
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", product));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
	
	@DeleteMapping("product/delete/{id}")
	public ResponseEntity<ResponseObject> deleteProduct(@PathVariable("id") int id) {
		try {
			Product product = productServices.getProductById(id);
			if (product == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "Id not found!", null));
			}
			if(productServices.deleteProduct(id) == 0) { 
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseObject("error", "failure!", ""));
			}
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "successfully!", ""));
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}

}













