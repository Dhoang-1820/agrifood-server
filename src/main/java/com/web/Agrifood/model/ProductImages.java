package com.web.Agrifood.model;

public class ProductImages {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_images.id
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_images.product_id
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	private Integer productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_images.image
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	private String image;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_images.id
	 * @return  the value of product_images.id
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_images.id
	 * @param id  the value for product_images.id
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_images.product_id
	 * @return  the value of product_images.product_id
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_images.product_id
	 * @param productId  the value for product_images.product_id
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_images.image
	 * @return  the value of product_images.image
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	public String getImage() {
		return image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_images.image
	 * @param image  the value for product_images.image
	 * @mbg.generated  Sun Aug 14 15:40:28 ICT 2022
	 */
	public void setImage(String image) {
		this.image = image;
	}
}