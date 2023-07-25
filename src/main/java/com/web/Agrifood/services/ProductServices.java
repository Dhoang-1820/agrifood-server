package com.web.Agrifood.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Agrifood.interfaceServices.IProductServices;
import com.web.Agrifood.mapper.CategoriesProductsMapper;
import com.web.Agrifood.mapper.ProductCategoryMapper;
import com.web.Agrifood.mapper.ProductMapper;
import com.web.Agrifood.model.CategoriesProducts;
import com.web.Agrifood.model.Product;
import com.web.Agrifood.model.ProductCategory;
import com.web.Agrifood.model.ProductCategoryExample;
import com.web.Agrifood.model.ProductExample;
import com.web.Agrifood.model.ProductWithBLOBs;

@Service
public class ProductServices implements IProductServices {
	
	@Autowired
	ProductMapper productMapper;
	
	@Autowired
	CategoriesProductsMapper categoriesProductsMapper;

	@Override
	public List<Product> getAllProduct() {
		ProductExample example = new ProductExample();
		return productMapper.selectByExampleWithBLOBs(example);
	}
	
	@Override
	public List<CategoriesProducts> getProductsByCategory(int id) {
		return categoriesProductsMapper.selectCommon(id);
		
	}
	
	@Override
	public int newProduct(ProductWithBLOBs product) {
		return productMapper.insert(product);
	}

	@Override
	public int editProduct(ProductWithBLOBs product) {
		return productMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public int deleteProduct(int id) {
		return productMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Product getProductById(int id) {
		return productMapper.selectByPrimaryKey(id);
	}
	@Override
	public int getIdByName(String name) {
		ProductExample example = new ProductExample();
		example.createCriteria().andTitleEqualTo(name);
		List<Product> product = productMapper.selectByExampleWithBLOBs(example);
		return product.get(0).getId();
	}

}
