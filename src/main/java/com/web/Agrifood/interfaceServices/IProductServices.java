package com.web.Agrifood.interfaceServices;

import java.util.List;

import com.web.Agrifood.model.CategoriesProducts;
import com.web.Agrifood.model.Product;
import com.web.Agrifood.model.ProductWithBLOBs;

public interface IProductServices {
	public List<Product>  getAllProduct();
	public List<CategoriesProducts> getProductsByCategory(int id);
	public int newProduct(ProductWithBLOBs product);
	public int editProduct(	ProductWithBLOBs product);
	public int deleteProduct(int id);
	public Product getProductById(int id);
	public int getIdByName(String name);
}
