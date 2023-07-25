package com.web.Agrifood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Agrifood.interfaceServices.IProductCategoryServices;
import com.web.Agrifood.mapper.ProductCategoryMapper;
import com.web.Agrifood.model.ProductCategory;
import com.web.Agrifood.model.ProductCategoryExample;

@Service
public class ProductCategoryServices implements IProductCategoryServices {
	
	@Autowired
	ProductCategoryMapper productCategoryMapper;
	
	
	@Override
	public List<ProductCategory> getAllProductCategory() {
		ProductCategoryExample example = new ProductCategoryExample();
		return productCategoryMapper.selectByExample(example);
	}

	@Override
	public int newProductCategory(ProductCategory productCategory) {
		return productCategoryMapper.insert(productCategory);
	}

	@Override
	public int editProductCategory(ProductCategory productCategory) {
		return productCategoryMapper.updateByPrimaryKeySelective(productCategory);
	}

	@Override
	public int deleteProductCategory(int id) {
		return productCategoryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public ProductCategory getProductCategoryById(int id) {
		return productCategoryMapper.selectByPrimaryKey(id);
	}

}
