package com.web.Agrifood.interfaceServices;

import java.util.List;

import com.web.Agrifood.model.ProductDetail;
import com.web.Agrifood.model.ProductImages;

public interface IProductImagesServices {
	public List<ProductImages> getAllProductImages();
	public int newProductImages(ProductImages product);
	public int editProductImages(ProductImages product);
	public int deleteProductImages(int id);
	public List<ProductImages> getProductImagestByProductId(int id);
}
