package com.web.Agrifood.interfaceServices;

import java.util.List;

import com.web.Agrifood.model.ProductCategory;

public interface IProductCategoryServices {
	public List<ProductCategory> getAllProductCategory();
	public int newProductCategory(ProductCategory productCategory);
	public int editProductCategory(ProductCategory productCategory);
	public int deleteProductCategory(int id);
	public ProductCategory getProductCategoryById(int id);
}
