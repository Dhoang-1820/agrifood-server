package com.web.Agrifood.interfaceServices;

import java.util.List;

import com.web.Agrifood.model.Category;

public interface ICategoryServices {
	public List<Category> getAllCategory();
	public int newCategory(Category category);
	public int editCategory(Category category);
	public int deleteCategory(int id);
	public Category getCategoryById(int id);
}
