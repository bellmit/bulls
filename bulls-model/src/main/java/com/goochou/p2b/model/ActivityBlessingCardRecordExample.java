package com.goochou.p2b.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityBlessingCardRecordExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	protected int limitStart = -1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	protected int limitEnd = -1;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public ActivityBlessingCardRecordExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public int getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_blessing_card_record
	 * @mbg.generated
	 */
	public int getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table activity_blessing_card_record
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

		public Criteria andCardNoIsNull() {
			addCriterion("card_no is null");
			return (Criteria) this;
		}

		public Criteria andCardNoIsNotNull() {
			addCriterion("card_no is not null");
			return (Criteria) this;
		}

		public Criteria andCardNoEqualTo(String value) {
			addCriterion("card_no =", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoNotEqualTo(String value) {
			addCriterion("card_no <>", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoGreaterThan(String value) {
			addCriterion("card_no >", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoGreaterThanOrEqualTo(String value) {
			addCriterion("card_no >=", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoLessThan(String value) {
			addCriterion("card_no <", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoLessThanOrEqualTo(String value) {
			addCriterion("card_no <=", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoLike(String value) {
			addCriterion("card_no like", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoNotLike(String value) {
			addCriterion("card_no not like", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoIn(List<String> values) {
			addCriterion("card_no in", values, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoNotIn(List<String> values) {
			addCriterion("card_no not in", values, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoBetween(String value1, String value2) {
			addCriterion("card_no between", value1, value2, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoNotBetween(String value1, String value2) {
			addCriterion("card_no not between", value1, value2, "cardNo");
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

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andIsUsedIsNull() {
			addCriterion("is_used is null");
			return (Criteria) this;
		}

		public Criteria andIsUsedIsNotNull() {
			addCriterion("is_used is not null");
			return (Criteria) this;
		}

		public Criteria andIsUsedEqualTo(Boolean value) {
			addCriterion("is_used =", value, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedNotEqualTo(Boolean value) {
			addCriterion("is_used <>", value, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedGreaterThan(Boolean value) {
			addCriterion("is_used >", value, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_used >=", value, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedLessThan(Boolean value) {
			addCriterion("is_used <", value, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedLessThanOrEqualTo(Boolean value) {
			addCriterion("is_used <=", value, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedIn(List<Boolean> values) {
			addCriterion("is_used in", values, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedNotIn(List<Boolean> values) {
			addCriterion("is_used not in", values, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedBetween(Boolean value1, Boolean value2) {
			addCriterion("is_used between", value1, value2, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsUsedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_used not between", value1, value2, "isUsed");
			return (Criteria) this;
		}

		public Criteria andIsTransferIsNull() {
			addCriterion("is_transfer is null");
			return (Criteria) this;
		}

		public Criteria andIsTransferIsNotNull() {
			addCriterion("is_transfer is not null");
			return (Criteria) this;
		}

		public Criteria andIsTransferEqualTo(Boolean value) {
			addCriterion("is_transfer =", value, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferNotEqualTo(Boolean value) {
			addCriterion("is_transfer <>", value, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferGreaterThan(Boolean value) {
			addCriterion("is_transfer >", value, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_transfer >=", value, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferLessThan(Boolean value) {
			addCriterion("is_transfer <", value, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferLessThanOrEqualTo(Boolean value) {
			addCriterion("is_transfer <=", value, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferIn(List<Boolean> values) {
			addCriterion("is_transfer in", values, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferNotIn(List<Boolean> values) {
			addCriterion("is_transfer not in", values, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferBetween(Boolean value1, Boolean value2) {
			addCriterion("is_transfer between", value1, value2, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsTransferNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_transfer not between", value1, value2, "isTransfer");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedIsNull() {
			addCriterion("is_unfinished is null");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedIsNotNull() {
			addCriterion("is_unfinished is not null");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedEqualTo(Boolean value) {
			addCriterion("is_unfinished =", value, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedNotEqualTo(Boolean value) {
			addCriterion("is_unfinished <>", value, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedGreaterThan(Boolean value) {
			addCriterion("is_unfinished >", value, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_unfinished >=", value, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedLessThan(Boolean value) {
			addCriterion("is_unfinished <", value, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedLessThanOrEqualTo(Boolean value) {
			addCriterion("is_unfinished <=", value, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedIn(List<Boolean> values) {
			addCriterion("is_unfinished in", values, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedNotIn(List<Boolean> values) {
			addCriterion("is_unfinished not in", values, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedBetween(Boolean value1, Boolean value2) {
			addCriterion("is_unfinished between", value1, value2, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andIsUnfinishedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_unfinished not between", value1, value2, "isUnfinished");
			return (Criteria) this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(Double value) {
			addCriterion("amount =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(Double value) {
			addCriterion("amount <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(Double value) {
			addCriterion("amount >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(Double value) {
			addCriterion("amount >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(Double value) {
			addCriterion("amount <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(Double value) {
			addCriterion("amount <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<Double> values) {
			addCriterion("amount in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<Double> values) {
			addCriterion("amount not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(Double value1, Double value2) {
			addCriterion("amount between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(Double value1, Double value2) {
			addCriterion("amount not between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andIsDoubleIsNull() {
			addCriterion("is_double is null");
			return (Criteria) this;
		}

		public Criteria andIsDoubleIsNotNull() {
			addCriterion("is_double is not null");
			return (Criteria) this;
		}

		public Criteria andIsDoubleEqualTo(Boolean value) {
			addCriterion("is_double =", value, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleNotEqualTo(Boolean value) {
			addCriterion("is_double <>", value, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleGreaterThan(Boolean value) {
			addCriterion("is_double >", value, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_double >=", value, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleLessThan(Boolean value) {
			addCriterion("is_double <", value, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleLessThanOrEqualTo(Boolean value) {
			addCriterion("is_double <=", value, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleIn(List<Boolean> values) {
			addCriterion("is_double in", values, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleNotIn(List<Boolean> values) {
			addCriterion("is_double not in", values, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleBetween(Boolean value1, Boolean value2) {
			addCriterion("is_double between", value1, value2, "isDouble");
			return (Criteria) this;
		}

		public Criteria andIsDoubleNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_double not between", value1, value2, "isDouble");
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

		public Criteria andUseDateIsNull() {
			addCriterion("use_date is null");
			return (Criteria) this;
		}

		public Criteria andUseDateIsNotNull() {
			addCriterion("use_date is not null");
			return (Criteria) this;
		}

		public Criteria andUseDateEqualTo(Date value) {
			addCriterion("use_date =", value, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateNotEqualTo(Date value) {
			addCriterion("use_date <>", value, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateGreaterThan(Date value) {
			addCriterion("use_date >", value, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateGreaterThanOrEqualTo(Date value) {
			addCriterion("use_date >=", value, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateLessThan(Date value) {
			addCriterion("use_date <", value, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateLessThanOrEqualTo(Date value) {
			addCriterion("use_date <=", value, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateIn(List<Date> values) {
			addCriterion("use_date in", values, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateNotIn(List<Date> values) {
			addCriterion("use_date not in", values, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateBetween(Date value1, Date value2) {
			addCriterion("use_date between", value1, value2, "useDate");
			return (Criteria) this;
		}

		public Criteria andUseDateNotBetween(Date value1, Date value2) {
			addCriterion("use_date not between", value1, value2, "useDate");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdIsNull() {
			addCriterion("chance_record_id is null");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdIsNotNull() {
			addCriterion("chance_record_id is not null");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdEqualTo(Integer value) {
			addCriterion("chance_record_id =", value, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdNotEqualTo(Integer value) {
			addCriterion("chance_record_id <>", value, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdGreaterThan(Integer value) {
			addCriterion("chance_record_id >", value, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("chance_record_id >=", value, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdLessThan(Integer value) {
			addCriterion("chance_record_id <", value, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdLessThanOrEqualTo(Integer value) {
			addCriterion("chance_record_id <=", value, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdIn(List<Integer> values) {
			addCriterion("chance_record_id in", values, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdNotIn(List<Integer> values) {
			addCriterion("chance_record_id not in", values, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdBetween(Integer value1, Integer value2) {
			addCriterion("chance_record_id between", value1, value2, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andChanceRecordIdNotBetween(Integer value1, Integer value2) {
			addCriterion("chance_record_id not between", value1, value2, "chanceRecordId");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(Integer value) {
			addCriterion("parent_id =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(Integer value) {
			addCriterion("parent_id <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(Integer value) {
			addCriterion("parent_id >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("parent_id >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(Integer value) {
			addCriterion("parent_id <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(Integer value) {
			addCriterion("parent_id <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<Integer> values) {
			addCriterion("parent_id in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<Integer> values) {
			addCriterion("parent_id not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(Integer value1, Integer value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andIsFanIsNull() {
			addCriterion("is_fan is null");
			return (Criteria) this;
		}

		public Criteria andIsFanIsNotNull() {
			addCriterion("is_fan is not null");
			return (Criteria) this;
		}

		public Criteria andIsFanEqualTo(Boolean value) {
			addCriterion("is_fan =", value, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanNotEqualTo(Boolean value) {
			addCriterion("is_fan <>", value, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanGreaterThan(Boolean value) {
			addCriterion("is_fan >", value, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_fan >=", value, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanLessThan(Boolean value) {
			addCriterion("is_fan <", value, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanLessThanOrEqualTo(Boolean value) {
			addCriterion("is_fan <=", value, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanIn(List<Boolean> values) {
			addCriterion("is_fan in", values, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanNotIn(List<Boolean> values) {
			addCriterion("is_fan not in", values, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanBetween(Boolean value1, Boolean value2) {
			addCriterion("is_fan between", value1, value2, "isFan");
			return (Criteria) this;
		}

		public Criteria andIsFanNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_fan not between", value1, value2, "isFan");
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

		public Criteria andVersionEqualTo(Integer value) {
			addCriterion("version =", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotEqualTo(Integer value) {
			addCriterion("version <>", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThan(Integer value) {
			addCriterion("version >", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
			addCriterion("version >=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThan(Integer value) {
			addCriterion("version <", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThanOrEqualTo(Integer value) {
			addCriterion("version <=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionIn(List<Integer> values) {
			addCriterion("version in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotIn(List<Integer> values) {
			addCriterion("version not in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionBetween(Integer value1, Integer value2) {
			addCriterion("version between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotBetween(Integer value1, Integer value2) {
			addCriterion("version not between", value1, value2, "version");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table activity_blessing_card_record
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
     * This class corresponds to the database table activity_blessing_card_record
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}