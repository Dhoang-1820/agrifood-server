package com.web.Agrifood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Agrifood.interfaceServices.IProductImagesServices;
import com.web.Agrifood.mapper.ProductImagesMapper;
import com.web.Agrifood.model.ProductDetail;
import com.web.Agrifood.model.ProductImages;
import com.web.Agrifood.model.ProductImagesExample;
@Service
public class ProductImagesServices implements IProductImagesServices {

	@Autowired
	ProductImagesMapper productImagesMapper;
	
	@Override
	public List<ProductImages> getAllProductImages() {
		ProductImagesExample example =  new ProductImagesExample();
		return productImagesMapper.selectByExample(example);
	}
	
	
	@Override
	public int newProductImages(ProductImages product) {
		return productImagesMapper.insert(product);
	}

	@Override
	public int editProductImages(ProductImages product) {
		return productImagesMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public int deleteProductImages(int id) {
		return productImagesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<ProductImages> getProductImagestByProductId(int id) {
		ProductImagesExample example = new ProductImagesExample();
		example.createCriteria().andProductIdEqualTo(id);
		return productImagesMapper.selectByExample(example);
	}

}
