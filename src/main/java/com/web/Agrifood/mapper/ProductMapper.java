package com.web.Agrifood.mapper;

import com.web.Agrifood.model.Product;
import com.web.Agrifood.model.ProductExample;
import com.web.Agrifood.model.ProductWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProductMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	long countByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int deleteByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int insert(Product row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int insertSelective(Product row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	List<Product> selectByExampleWithBLOBs(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	List<Product> selectByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	Product selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Product row, @Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByExampleWithBLOBs(@Param("row") Product row, @Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByExample(@Param("row") Product row, @Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByPrimaryKeySelective(Product row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByPrimaryKeyWithBLOBs(Product row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	int updateByPrimaryKey(Product row);
}