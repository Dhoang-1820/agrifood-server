package com.web.Agrifood.model;

public class ProductDetail {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.id
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.product_id
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	private Integer productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.quantity
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	private Integer quantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.type
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	private String type;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.id
	 * @return  the value of product_detail.id
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.id
	 * @param id  the value for product_detail.id
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.product_id
	 * @return  the value of product_detail.product_id
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.product_id
	 * @param productId  the value for product_detail.product_id
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.quantity
	 * @return  the value of product_detail.quantity
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.quantity
	 * @param quantity  the value for product_detail.quantity
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.type
	 * @return  the value of product_detail.type
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.type
	 * @param type  the value for product_detail.type
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public void setType(String type) {
		this.type = type;
	}
}