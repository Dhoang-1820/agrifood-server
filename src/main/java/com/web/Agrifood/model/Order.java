package com.web.Agrifood.model;

import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.userId
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.date
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.total_price
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    private Float totalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.statusId
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    private Integer statusid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.userId
     *
     * @return the value of order.userId
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.userId
     *
     * @param userid the value for order.userId
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.date
     *
     * @return the value of order.date
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.date
     *
     * @param date the value for order.date
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.total_price
     *
     * @return the value of order.total_price
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public Float getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.total_price
     *
     * @param totalPrice the value for order.total_price
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.statusId
     *
     * @return the value of order.statusId
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public Integer getStatusid() {
        return statusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.statusId
     *
     * @param statusid the value for order.statusId
     *
     * @mbg.generated Thu Jul 14 09:56:16 ICT 2022
     */
    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }
}