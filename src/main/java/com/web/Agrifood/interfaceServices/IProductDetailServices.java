package com.web.Agrifood.interfaceServices;

import java.util.List;

import com.web.Agrifood.model.ProductDetail;

public interface IProductDetailServices {
	public List<ProductDetail> getAllProductDetail();
	public List<ProductDetail> getProductDetailsByProduct(int productId);
	public int newProductDetail(ProductDetail product);
	public int editProductDetail(	ProductDetail product);
	public int deleteProductDetail(int id);
	public ProductDetail getProducDetailtById(int id);
}
