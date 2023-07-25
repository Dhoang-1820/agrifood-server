package com.web.Agrifood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Agrifood.interfaceServices.ICategoryServices;
import com.web.Agrifood.interfaceServices.IStorageServices;
import com.web.Agrifood.mapper.CategoryMapper;
import com.web.Agrifood.model.Category;
import com.web.Agrifood.model.CategoryExample;

@Service
public class CategoryServices implements ICategoryServices {
	
	@Autowired
	IStorageServices iStorageServices;
	
	@Autowired 
	CategoryMapper categoryMapper;
	
	@Override
	public List<Category> getAllCategory() {
		CategoryExample example = new CategoryExample();
		List<Category> categories = categoryMapper.selectByExample(example);
		return categories;
	}
	
	@Override
	public int newCategory(Category category) {
		return categoryMapper.insert(category);
	}

	@Override
	public int editCategory(Category category) {
		return categoryMapper.updateByPrimaryKeySelective(category);
	}
	
	@Override
	public int deleteCategory(int id) {
		return categoryMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public Category getCategoryById(int id) {
		Category category = categoryMapper.selectByPrimaryKey(id);
		return category;
	}
	
}












