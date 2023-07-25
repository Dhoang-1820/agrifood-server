package com.web.Agrifood.mapper;

import com.web.Agrifood.model.Order;
import com.web.Agrifood.model.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    int insert(Order row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    int insertSelective(Order row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    int updateByExampleSelective(@Param("row") Order row, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    int updateByExample(@Param("row") Order row, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    int updateByPrimaryKeySelective(Order row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    int updateByPrimaryKey(Order row);
}