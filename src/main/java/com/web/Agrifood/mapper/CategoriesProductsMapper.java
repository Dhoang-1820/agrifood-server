package com.web.Agrifood.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.Agrifood.model.CategoriesProducts;

@Mapper
public interface CategoriesProductsMapper {
	List<CategoriesProducts> selectCommon(int id);
}
