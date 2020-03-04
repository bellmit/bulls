package com.goochou.p2b.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceTokenExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table device_token
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table device_token
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table device_token
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table device_token
	 * @mbg.generated
	 */
	protected int limitStart = -1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table device_token
	 * @mbg.generated
	 */
	protected int limitEnd = -1;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public DeviceTokenExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public int getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_token
	 * @mbg.generated
	 */
	public int getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table device_token
	 * @mbg.generated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
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

		public Criteria andTokenIsNull() {
			addCriterion("token is null");
			return (Criteria) this;
		}

		public Criteria andTokenIsNotNull() {
			addCriterion("token is not null");
			return (Criteria) this;
		}

		public Criteria andTokenEqualTo(String value) {
			addCriterion("token =", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotEqualTo(String value) {
			addCriterion("token <>", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenGreaterThan(String value) {
			addCriterion("token >", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenGreaterThanOrEqualTo(String value) {
			addCriterion("token >=", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLessThan(String value) {
			addCriterion("token <", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLessThanOrEqualTo(String value) {
			addCriterion("token <=", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLike(String value) {
			addCriterion("token like", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotLike(String value) {
			addCriterion("token not like", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenIn(List<String> values) {
			addCriterion("token in", values, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotIn(List<String> values) {
			addCriterion("token not in", values, "token");
			return (Criteria) this;
		}

		public Criteria andTokenBetween(String value1, String value2) {
			addCriterion("token between", value1, value2, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotBetween(String value1, String value2) {
			addCriterion("token not between", value1, value2, "token");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andClientIsNull() {
			addCriterion("client is null");
			return (Criteria) this;
		}

		public Criteria andClientIsNotNull() {
			addCriterion("client is not null");
			return (Criteria) this;
		}

		public Criteria andClientEqualTo(String value) {
			addCriterion("client =", value, "client");
			return (Criteria) this;
		}

		public Criteria andClientNotEqualTo(String value) {
			addCriterion("client <>", value, "client");
			return (Criteria) this;
		}

		public Criteria andClientGreaterThan(String value) {
			addCriterion("client >", value, "client");
			return (Criteria) this;
		}

		public Criteria andClientGreaterThanOrEqualTo(String value) {
			addCriterion("client >=", value, "client");
			return (Criteria) this;
		}

		public Criteria andClientLessThan(String value) {
			addCriterion("client <", value, "client");
			return (Criteria) this;
		}

		public Criteria andClientLessThanOrEqualTo(String value) {
			addCriterion("client <=", value, "client");
			return (Criteria) this;
		}

		public Criteria andClientLike(String value) {
			addCriterion("client like", value, "client");
			return (Criteria) this;
		}

		public Criteria andClientNotLike(String value) {
			addCriterion("client not like", value, "client");
			return (Criteria) this;
		}

		public Criteria andClientIn(List<String> values) {
			addCriterion("client in", values, "client");
			return (Criteria) this;
		}

		public Criteria andClientNotIn(List<String> values) {
			addCriterion("client not in", values, "client");
			return (Criteria) this;
		}

		public Criteria andClientBetween(String value1, String value2) {
			addCriterion("client between", value1, value2, "client");
			return (Criteria) this;
		}

		public Criteria andClientNotBetween(String value1, String value2) {
			addCriterion("client not between", value1, value2, "client");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (Criteria) this;
		}

		public Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andMobileVersionIsNull() {
			addCriterion("mobile_version is null");
			return (Criteria) this;
		}

		public Criteria andMobileVersionIsNotNull() {
			addCriterion("mobile_version is not null");
			return (Criteria) this;
		}

		public Criteria andMobileVersionEqualTo(String value) {
			addCriterion("mobile_version =", value, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionNotEqualTo(String value) {
			addCriterion("mobile_version <>", value, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionGreaterThan(String value) {
			addCriterion("mobile_version >", value, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionGreaterThanOrEqualTo(String value) {
			addCriterion("mobile_version >=", value, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionLessThan(String value) {
			addCriterion("mobile_version <", value, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionLessThanOrEqualTo(String value) {
			addCriterion("mobile_version <=", value, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionLike(String value) {
			addCriterion("mobile_version like", value, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionNotLike(String value) {
			addCriterion("mobile_version not like", value, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionIn(List<String> values) {
			addCriterion("mobile_version in", values, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionNotIn(List<String> values) {
			addCriterion("mobile_version not in", values, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionBetween(String value1, String value2) {
			addCriterion("mobile_version between", value1, value2, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileVersionNotBetween(String value1, String value2) {
			addCriterion("mobile_version not between", value1, value2, "mobileVersion");
			return (Criteria) this;
		}

		public Criteria andMobileModelIsNull() {
			addCriterion("mobile_model is null");
			return (Criteria) this;
		}

		public Criteria andMobileModelIsNotNull() {
			addCriterion("mobile_model is not null");
			return (Criteria) this;
		}

		public Criteria andMobileModelEqualTo(String value) {
			addCriterion("mobile_model =", value, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelNotEqualTo(String value) {
			addCriterion("mobile_model <>", value, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelGreaterThan(String value) {
			addCriterion("mobile_model >", value, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelGreaterThanOrEqualTo(String value) {
			addCriterion("mobile_model >=", value, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelLessThan(String value) {
			addCriterion("mobile_model <", value, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelLessThanOrEqualTo(String value) {
			addCriterion("mobile_model <=", value, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelLike(String value) {
			addCriterion("mobile_model like", value, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelNotLike(String value) {
			addCriterion("mobile_model not like", value, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelIn(List<String> values) {
			addCriterion("mobile_model in", values, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelNotIn(List<String> values) {
			addCriterion("mobile_model not in", values, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelBetween(String value1, String value2) {
			addCriterion("mobile_model between", value1, value2, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andMobileModelNotBetween(String value1, String value2) {
			addCriterion("mobile_model not between", value1, value2, "mobileModel");
			return (Criteria) this;
		}

		public Criteria andAppNameIsNull() {
			addCriterion("app_name is null");
			return (Criteria) this;
		}

		public Criteria andAppNameIsNotNull() {
			addCriterion("app_name is not null");
			return (Criteria) this;
		}

		public Criteria andAppNameEqualTo(String value) {
			addCriterion("app_name =", value, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameNotEqualTo(String value) {
			addCriterion("app_name <>", value, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameGreaterThan(String value) {
			addCriterion("app_name >", value, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameGreaterThanOrEqualTo(String value) {
			addCriterion("app_name >=", value, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameLessThan(String value) {
			addCriterion("app_name <", value, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameLessThanOrEqualTo(String value) {
			addCriterion("app_name <=", value, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameLike(String value) {
			addCriterion("app_name like", value, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameNotLike(String value) {
			addCriterion("app_name not like", value, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameIn(List<String> values) {
			addCriterion("app_name in", values, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameNotIn(List<String> values) {
			addCriterion("app_name not in", values, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameBetween(String value1, String value2) {
			addCriterion("app_name between", value1, value2, "appName");
			return (Criteria) this;
		}

		public Criteria andAppNameNotBetween(String value1, String value2) {
			addCriterion("app_name not between", value1, value2, "appName");
			return (Criteria) this;
		}

		public Criteria andVersionIsNull() {
			addCriterion("version is null");
			return (Criteria) this;
		}

		public Criteria andVersionIsNotNull() {
			addCriterion("version is not null");
			return (Criteria) this;
		}

		public Criteria andVersionEqualTo(String value) {
			addCriterion("version =", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotEqualTo(String value) {
			addCriterion("version <>", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThan(String value) {
			addCriterion("version >", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThanOrEqualTo(String value) {
			addCriterion("version >=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThan(String value) {
			addCriterion("version <", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThanOrEqualTo(String value) {
			addCriterion("version <=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLike(String value) {
			addCriterion("version like", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotLike(String value) {
			addCriterion("version not like", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionIn(List<String> values) {
			addCriterion("version in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotIn(List<String> values) {
			addCriterion("version not in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionBetween(String value1, String value2) {
			addCriterion("version between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotBetween(String value1, String value2) {
			addCriterion("version not between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andUuidIsNull() {
			addCriterion("uuid is null");
			return (Criteria) this;
		}

		public Criteria andUuidIsNotNull() {
			addCriterion("uuid is not null");
			return (Criteria) this;
		}

		public Criteria andUuidEqualTo(String value) {
			addCriterion("uuid =", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotEqualTo(String value) {
			addCriterion("uuid <>", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidGreaterThan(String value) {
			addCriterion("uuid >", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidGreaterThanOrEqualTo(String value) {
			addCriterion("uuid >=", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLessThan(String value) {
			addCriterion("uuid <", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLessThanOrEqualTo(String value) {
			addCriterion("uuid <=", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLike(String value) {
			addCriterion("uuid like", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotLike(String value) {
			addCriterion("uuid not like", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidIn(List<String> values) {
			addCriterion("uuid in", values, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotIn(List<String> values) {
			addCriterion("uuid not in", values, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidBetween(String value1, String value2) {
			addCriterion("uuid between", value1, value2, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotBetween(String value1, String value2) {
			addCriterion("uuid not between", value1, value2, "uuid");
			return (Criteria) this;
		}

		public Criteria andDataSourceIsNull() {
			addCriterion("data_source is null");
			return (Criteria) this;
		}

		public Criteria andDataSourceIsNotNull() {
			addCriterion("data_source is not null");
			return (Criteria) this;
		}

		public Criteria andDataSourceEqualTo(String value) {
			addCriterion("data_source =", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceNotEqualTo(String value) {
			addCriterion("data_source <>", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceGreaterThan(String value) {
			addCriterion("data_source >", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
			addCriterion("data_source >=", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceLessThan(String value) {
			addCriterion("data_source <", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceLessThanOrEqualTo(String value) {
			addCriterion("data_source <=", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceLike(String value) {
			addCriterion("data_source like", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceNotLike(String value) {
			addCriterion("data_source not like", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceIn(List<String> values) {
			addCriterion("data_source in", values, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceNotIn(List<String> values) {
			addCriterion("data_source not in", values, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceBetween(String value1, String value2) {
			addCriterion("data_source between", value1, value2, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceNotBetween(String value1, String value2) {
			addCriterion("data_source not between", value1, value2, "dataSource");
			return (Criteria) this;
		}

		public Criteria andIsUninstallIsNull() {
			addCriterion("is_uninstall is null");
			return (Criteria) this;
		}

		public Criteria andIsUninstallIsNotNull() {
			addCriterion("is_uninstall is not null");
			return (Criteria) this;
		}

		public Criteria andIsUninstallEqualTo(Boolean value) {
			addCriterion("is_uninstall =", value, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallNotEqualTo(Boolean value) {
			addCriterion("is_uninstall <>", value, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallGreaterThan(Boolean value) {
			addCriterion("is_uninstall >", value, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_uninstall >=", value, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallLessThan(Boolean value) {
			addCriterion("is_uninstall <", value, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallLessThanOrEqualTo(Boolean value) {
			addCriterion("is_uninstall <=", value, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallIn(List<Boolean> values) {
			addCriterion("is_uninstall in", values, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallNotIn(List<Boolean> values) {
			addCriterion("is_uninstall not in", values, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallBetween(Boolean value1, Boolean value2) {
			addCriterion("is_uninstall between", value1, value2, "isUninstall");
			return (Criteria) this;
		}

		public Criteria andIsUninstallNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_uninstall not between", value1, value2, "isUninstall");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table device_token
	 * @mbg.generated
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
     * This class corresponds to the database table device_token
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}