package com.web.Agrifood.model;

public class Category {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.id
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.title
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column category.thumbnail
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	private String thumbnail;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.id
	 * @return  the value of category.id
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.id
	 * @param id  the value for category.id
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.title
	 * @return  the value of category.title
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.title
	 * @param title  the value for category.title
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column category.thumbnail
	 * @return  the value of category.thumbnail
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column category.thumbnail
	 * @param thumbnail  the value for category.thumbnail
	 * @mbg.generated  Sat Jul 16 08:46:16 ICT 2022
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
}