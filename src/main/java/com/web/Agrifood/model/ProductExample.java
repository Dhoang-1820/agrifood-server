package com.web.Agrifood.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ProductExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public ProductExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andDiscountIsNull() {
			addCriterion("discount is null");
			return (Criteria) this;
		}

		public Criteria andDiscountIsNotNull() {
			addCriterion("discount is not null");
			return (Criteria) this;
		}

		public Criteria andDiscountEqualTo(Float value) {
			addCriterion("discount =", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotEqualTo(Float value) {
			addCriterion("discount <>", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountGreaterThan(Float value) {
			addCriterion("discount >", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountGreaterThanOrEqualTo(Float value) {
			addCriterion("discount >=", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountLessThan(Float value) {
			addCriterion("discount <", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountLessThanOrEqualTo(Float value) {
			addCriterion("discount <=", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountIn(List<Float> values) {
			addCriterion("discount in", values, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotIn(List<Float> values) {
			addCriterion("discount not in", values, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountBetween(Float value1, Float value2) {
			addCriterion("discount between", value1, value2, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotBetween(Float value1, Float value2) {
			addCriterion("discount not between", value1, value2, "discount");
			return (Criteria) this;
		}

		public Criteria andProductCategoryIsNull() {
			addCriterion("product_category is null");
			return (Criteria) this;
		}

		public Criteria andProductCategoryIsNotNull() {
			addCriterion("product_category is not null");
			return (Criteria) this;
		}

		public Criteria andProductCategoryEqualTo(Integer value) {
			addCriterion("product_category =", value, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryNotEqualTo(Integer value) {
			addCriterion("product_category <>", value, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryGreaterThan(Integer value) {
			addCriterion("product_category >", value, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryGreaterThanOrEqualTo(Integer value) {
			addCriterion("product_category >=", value, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryLessThan(Integer value) {
			addCriterion("product_category <", value, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryLessThanOrEqualTo(Integer value) {
			addCriterion("product_category <=", value, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryIn(List<Integer> values) {
			addCriterion("product_category in", values, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryNotIn(List<Integer> values) {
			addCriterion("product_category not in", values, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryBetween(Integer value1, Integer value2) {
			addCriterion("product_category between", value1, value2, "productCategory");
			return (Criteria) this;
		}

		public Criteria andProductCategoryNotBetween(Integer value1, Integer value2) {
			addCriterion("product_category not between", value1, value2, "productCategory");
			return (Criteria) this;
		}

		public Criteria andCreateatIsNull() {
			addCriterion("createAt is null");
			return (Criteria) this;
		}

		public Criteria andCreateatIsNotNull() {
			addCriterion("createAt is not null");
			return (Criteria) this;
		}

		public Criteria andCreateatEqualTo(Date value) {
			addCriterion("createAt =", value, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatNotEqualTo(Date value) {
			addCriterion("createAt <>", value, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatGreaterThan(Date value) {
			addCriterion("createAt >", value, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatGreaterThanOrEqualTo(Date value) {
			addCriterion("createAt >=", value, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatLessThan(Date value) {
			addCriterion("createAt <", value, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatLessThanOrEqualTo(Date value) {
			addCriterion("createAt <=", value, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatIn(List<Date> values) {
			addCriterion("createAt in", values, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatNotIn(List<Date> values) {
			addCriterion("createAt not in", values, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatBetween(Date value1, Date value2) {
			addCriterion("createAt between", value1, value2, "createat");
			return (Criteria) this;
		}

		public Criteria andCreateatNotBetween(Date value1, Date value2) {
			addCriterion("createAt not between", value1, value2, "createat");
			return (Criteria) this;
		}

		public Criteria andUpdateatIsNull() {
			addCriterion("updateAt is null");
			return (Criteria) this;
		}

		public Criteria andUpdateatIsNotNull() {
			addCriterion("updateAt is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateatEqualTo(Date value) {
			addCriterion("updateAt =", value, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatNotEqualTo(Date value) {
			addCriterion("updateAt <>", value, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatGreaterThan(Date value) {
			addCriterion("updateAt >", value, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatGreaterThanOrEqualTo(Date value) {
			addCriterion("updateAt >=", value, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatLessThan(Date value) {
			addCriterion("updateAt <", value, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatLessThanOrEqualTo(Date value) {
			addCriterion("updateAt <=", value, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatIn(List<Date> values) {
			addCriterion("updateAt in", values, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatNotIn(List<Date> values) {
			addCriterion("updateAt not in", values, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatBetween(Date value1, Date value2) {
			addCriterion("updateAt between", value1, value2, "updateat");
			return (Criteria) this;
		}

		public Criteria andUpdateatNotBetween(Date value1, Date value2) {
			addCriterion("updateAt not between", value1, value2, "updateat");
			return (Criteria) this;
		}

		public Criteria andUnitIsNull() {
			addCriterion("unit is null");
			return (Criteria) this;
		}

		public Criteria andUnitIsNotNull() {
			addCriterion("unit is not null");
			return (Criteria) this;
		}

		public Criteria andUnitEqualTo(String value) {
			addCriterion("unit =", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotEqualTo(String value) {
			addCriterion("unit <>", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThan(String value) {
			addCriterion("unit >", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThanOrEqualTo(String value) {
			addCriterion("unit >=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThan(String value) {
			addCriterion("unit <", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThanOrEqualTo(String value) {
			addCriterion("unit <=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLike(String value) {
			addCriterion("unit like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotLike(String value) {
			addCriterion("unit not like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitIn(List<String> values) {
			addCriterion("unit in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotIn(List<String> values) {
			addCriterion("unit not in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitBetween(String value1, String value2) {
			addCriterion("unit between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotBetween(String value1, String value2) {
			addCriterion("unit not between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andOriginIsNull() {
			addCriterion("origin is null");
			return (Criteria) this;
		}

		public Criteria andOriginIsNotNull() {
			addCriterion("origin is not null");
			return (Criteria) this;
		}

		public Criteria andOriginEqualTo(String value) {
			addCriterion("origin =", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginNotEqualTo(String value) {
			addCriterion("origin <>", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginGreaterThan(String value) {
			addCriterion("origin >", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginGreaterThanOrEqualTo(String value) {
			addCriterion("origin >=", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginLessThan(String value) {
			addCriterion("origin <", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginLessThanOrEqualTo(String value) {
			addCriterion("origin <=", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginLike(String value) {
			addCriterion("origin like", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginNotLike(String value) {
			addCriterion("origin not like", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginIn(List<String> values) {
			addCriterion("origin in", values, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginNotIn(List<String> values) {
			addCriterion("origin not in", values, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginBetween(String value1, String value2) {
			addCriterion("origin between", value1, value2, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginNotBetween(String value1, String value2) {
			addCriterion("origin not between", value1, value2, "origin");
			return (Criteria) this;
		}

		public Criteria andPreserveIsNull() {
			addCriterion("preserve is null");
			return (Criteria) this;
		}

		public Criteria andPreserveIsNotNull() {
			addCriterion("preserve is not null");
			return (Criteria) this;
		}

		public Criteria andPreserveEqualTo(String value) {
			addCriterion("preserve =", value, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveNotEqualTo(String value) {
			addCriterion("preserve <>", value, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveGreaterThan(String value) {
			addCriterion("preserve >", value, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveGreaterThanOrEqualTo(String value) {
			addCriterion("preserve >=", value, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveLessThan(String value) {
			addCriterion("preserve <", value, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveLessThanOrEqualTo(String value) {
			addCriterion("preserve <=", value, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveLike(String value) {
			addCriterion("preserve like", value, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveNotLike(String value) {
			addCriterion("preserve not like", value, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveIn(List<String> values) {
			addCriterion("preserve in", values, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveNotIn(List<String> values) {
			addCriterion("preserve not in", values, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveBetween(String value1, String value2) {
			addCriterion("preserve between", value1, value2, "preserve");
			return (Criteria) this;
		}

		public Criteria andPreserveNotBetween(String value1, String value2) {
			addCriterion("preserve not between", value1, value2, "preserve");
			return (Criteria) this;
		}

		public Criteria andUserManualIsNull() {
			addCriterion("user_manual is null");
			return (Criteria) this;
		}

		public Criteria andUserManualIsNotNull() {
			addCriterion("user_manual is not null");
			return (Criteria) this;
		}

		public Criteria andUserManualEqualTo(String value) {
			addCriterion("user_manual =", value, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualNotEqualTo(String value) {
			addCriterion("user_manual <>", value, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualGreaterThan(String value) {
			addCriterion("user_manual >", value, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualGreaterThanOrEqualTo(String value) {
			addCriterion("user_manual >=", value, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualLessThan(String value) {
			addCriterion("user_manual <", value, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualLessThanOrEqualTo(String value) {
			addCriterion("user_manual <=", value, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualLike(String value) {
			addCriterion("user_manual like", value, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualNotLike(String value) {
			addCriterion("user_manual not like", value, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualIn(List<String> values) {
			addCriterion("user_manual in", values, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualNotIn(List<String> values) {
			addCriterion("user_manual not in", values, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualBetween(String value1, String value2) {
			addCriterion("user_manual between", value1, value2, "userManual");
			return (Criteria) this;
		}

		public Criteria andUserManualNotBetween(String value1, String value2) {
			addCriterion("user_manual not between", value1, value2, "userManual");
			return (Criteria) this;
		}

		public Criteria andQuantityIsNull() {
			addCriterion("quantity is null");
			return (Criteria) this;
		}

		public Criteria andQuantityIsNotNull() {
			addCriterion("quantity is not null");
			return (Criteria) this;
		}

		public Criteria andQuantityEqualTo(Integer value) {
			addCriterion("quantity =", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityNotEqualTo(Integer value) {
			addCriterion("quantity <>", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityGreaterThan(Integer value) {
			addCriterion("quantity >", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
			addCriterion("quantity >=", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityLessThan(Integer value) {
			addCriterion("quantity <", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityLessThanOrEqualTo(Integer value) {
			addCriterion("quantity <=", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityIn(List<Integer> values) {
			addCriterion("quantity in", values, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityNotIn(List<Integer> values) {
			addCriterion("quantity not in", values, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityBetween(Integer value1, Integer value2) {
			addCriterion("quantity between", value1, value2, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
			addCriterion("quantity not between", value1, value2, "quantity");
			return (Criteria) this;
		}

		public Criteria andPriceIsNull() {
			addCriterion("price is null");
			return (Criteria) this;
		}

		public Criteria andPriceIsNotNull() {
			addCriterion("price is not null");
			return (Criteria) this;
		}

		public Criteria andPriceEqualTo(Float value) {
			addCriterion("price =", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotEqualTo(Float value) {
			addCriterion("price <>", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThan(Float value) {
			addCriterion("price >", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThanOrEqualTo(Float value) {
			addCriterion("price >=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThan(Float value) {
			addCriterion("price <", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThanOrEqualTo(Float value) {
			addCriterion("price <=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceIn(List<Float> values) {
			addCriterion("price in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotIn(List<Float> values) {
			addCriterion("price not in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceBetween(Float value1, Float value2) {
			addCriterion("price between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotBetween(Float value1, Float value2) {
			addCriterion("price not between", value1, value2, "price");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product
	 * @mbg.generated  Mon Aug 22 15:49:51 ICT 2022
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbg.generated do_not_delete_during_merge Thu Jul 14 09:56:16 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}