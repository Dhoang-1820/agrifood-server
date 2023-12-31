package com.web.Agrifood.mapper;

import com.web.Agrifood.model.ProductDetail;
import com.web.Agrifood.model.ProductDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProductDetailMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	long countByExample(ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int deleteByExample(ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int insert(ProductDetail row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int insertSelective(ProductDetail row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	List<ProductDetail> selectByExample(ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	ProductDetail selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") ProductDetail row, @Param("example") ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByExample(@Param("row") ProductDetail row, @Param("example") ProductDetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByPrimaryKeySelective(ProductDetail row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_detail
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByPrimaryKey(ProductDetail row);
}