package com.web.Agrifood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Agrifood.interfaceServices.IProductDetailServices;
import com.web.Agrifood.mapper.ProductDetailMapper;
import com.web.Agrifood.model.ProductDetail;
import com.web.Agrifood.model.ProductDetailExample;
@Service
public class ProductDetailServices implements IProductDetailServices {
	
	@Autowired
	ProductDetailMapper productDetailMapper;
	

	@Override
	public List<ProductDetail> getAllProductDetail() {
		ProductDetailExample example = new ProductDetailExample();
		return productDetailMapper.selectByExample(example);
	}
	
	@Override
	public List<ProductDetail> getProductDetailsByProduct(int productId) {
		ProductDetailExample example = new ProductDetailExample();
		example.createCriteria().andProductIdEqualTo(productId);
		return productDetailMapper.selectByExample(example);
	}
	
	@Override
	public int newProductDetail(ProductDetail product) {
		return productDetailMapper.insert(product);
	}

	@Override
	public int editProductDetail(ProductDetail product) {
		return productDetailMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public int deleteProductDetail(int id) {
		return productDetailMapper.deleteByPrimaryKey(id);
	}

	@Override
	public ProductDetail getProducDetailtById(int id) {
		return productDetailMapper.selectByPrimaryKey(id);
	}

}
