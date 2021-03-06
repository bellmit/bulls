package com.goochou.p2b.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityDetailSendHongbaoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	protected int limitStart = -1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	protected int limitEnd = -1;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public ActivityDetailSendHongbaoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public int getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
	 */
	public int getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
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

		public Criteria andActivityDetailIdIsNull() {
			addCriterion("activity_detail_id is null");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdIsNotNull() {
			addCriterion("activity_detail_id is not null");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdEqualTo(Integer value) {
			addCriterion("activity_detail_id =", value, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdNotEqualTo(Integer value) {
			addCriterion("activity_detail_id <>", value, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdGreaterThan(Integer value) {
			addCriterion("activity_detail_id >", value, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("activity_detail_id >=", value, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdLessThan(Integer value) {
			addCriterion("activity_detail_id <", value, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdLessThanOrEqualTo(Integer value) {
			addCriterion("activity_detail_id <=", value, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdIn(List<Integer> values) {
			addCriterion("activity_detail_id in", values, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdNotIn(List<Integer> values) {
			addCriterion("activity_detail_id not in", values, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdBetween(Integer value1, Integer value2) {
			addCriterion("activity_detail_id between", value1, value2, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andActivityDetailIdNotBetween(Integer value1, Integer value2) {
			addCriterion("activity_detail_id not between", value1, value2, "activityDetailId");
			return (Criteria) this;
		}

		public Criteria andTargetTypeIsNull() {
			addCriterion("target_type is null");
			return (Criteria) this;
		}

		public Criteria andTargetTypeIsNotNull() {
			addCriterion("target_type is not null");
			return (Criteria) this;
		}

		public Criteria andTargetTypeEqualTo(Integer value) {
			addCriterion("target_type =", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeNotEqualTo(Integer value) {
			addCriterion("target_type <>", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeGreaterThan(Integer value) {
			addCriterion("target_type >", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("target_type >=", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeLessThan(Integer value) {
			addCriterion("target_type <", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeLessThanOrEqualTo(Integer value) {
			addCriterion("target_type <=", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeIn(List<Integer> values) {
			addCriterion("target_type in", values, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeNotIn(List<Integer> values) {
			addCriterion("target_type not in", values, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeBetween(Integer value1, Integer value2) {
			addCriterion("target_type between", value1, value2, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("target_type not between", value1, value2, "targetType");
			return (Criteria) this;
		}

		public Criteria andCntIsNull() {
			addCriterion("cnt is null");
			return (Criteria) this;
		}

		public Criteria andCntIsNotNull() {
			addCriterion("cnt is not null");
			return (Criteria) this;
		}

		public Criteria andCntEqualTo(Integer value) {
			addCriterion("cnt =", value, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntNotEqualTo(Integer value) {
			addCriterion("cnt <>", value, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntGreaterThan(Integer value) {
			addCriterion("cnt >", value, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntGreaterThanOrEqualTo(Integer value) {
			addCriterion("cnt >=", value, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntLessThan(Integer value) {
			addCriterion("cnt <", value, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntLessThanOrEqualTo(Integer value) {
			addCriterion("cnt <=", value, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntIn(List<Integer> values) {
			addCriterion("cnt in", values, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntNotIn(List<Integer> values) {
			addCriterion("cnt not in", values, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntBetween(Integer value1, Integer value2) {
			addCriterion("cnt between", value1, value2, "cnt");
			return (Criteria) this;
		}

		public Criteria andCntNotBetween(Integer value1, Integer value2) {
			addCriterion("cnt not between", value1, value2, "cnt");
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

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(BigDecimal value) {
			addCriterion("amount =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(BigDecimal value) {
			addCriterion("amount <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(BigDecimal value) {
			addCriterion("amount >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("amount >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(BigDecimal value) {
			addCriterion("amount <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("amount <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<BigDecimal> values) {
			addCriterion("amount in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<BigDecimal> values) {
			addCriterion("amount not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("amount between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("amount not between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountIsNull() {
			addCriterion("random_amount is null");
			return (Criteria) this;
		}

		public Criteria andRandomAmountIsNotNull() {
			addCriterion("random_amount is not null");
			return (Criteria) this;
		}

		public Criteria andRandomAmountEqualTo(BigDecimal value) {
			addCriterion("random_amount =", value, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountNotEqualTo(BigDecimal value) {
			addCriterion("random_amount <>", value, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountGreaterThan(BigDecimal value) {
			addCriterion("random_amount >", value, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("random_amount >=", value, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountLessThan(BigDecimal value) {
			addCriterion("random_amount <", value, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("random_amount <=", value, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountIn(List<BigDecimal> values) {
			addCriterion("random_amount in", values, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountNotIn(List<BigDecimal> values) {
			addCriterion("random_amount not in", values, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("random_amount between", value1, value2, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andRandomAmountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("random_amount not between", value1, value2, "randomAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountIsNull() {
			addCriterion("limit_amount is null");
			return (Criteria) this;
		}

		public Criteria andLimitAmountIsNotNull() {
			addCriterion("limit_amount is not null");
			return (Criteria) this;
		}

		public Criteria andLimitAmountEqualTo(Integer value) {
			addCriterion("limit_amount =", value, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountNotEqualTo(Integer value) {
			addCriterion("limit_amount <>", value, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountGreaterThan(Integer value) {
			addCriterion("limit_amount >", value, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountGreaterThanOrEqualTo(Integer value) {
			addCriterion("limit_amount >=", value, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountLessThan(Integer value) {
			addCriterion("limit_amount <", value, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountLessThanOrEqualTo(Integer value) {
			addCriterion("limit_amount <=", value, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountIn(List<Integer> values) {
			addCriterion("limit_amount in", values, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountNotIn(List<Integer> values) {
			addCriterion("limit_amount not in", values, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountBetween(Integer value1, Integer value2) {
			addCriterion("limit_amount between", value1, value2, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitAmountNotBetween(Integer value1, Integer value2) {
			addCriterion("limit_amount not between", value1, value2, "limitAmount");
			return (Criteria) this;
		}

		public Criteria andLimitDayIsNull() {
			addCriterion("limit_day is null");
			return (Criteria) this;
		}

		public Criteria andLimitDayIsNotNull() {
			addCriterion("limit_day is not null");
			return (Criteria) this;
		}

		public Criteria andLimitDayEqualTo(Integer value) {
			addCriterion("limit_day =", value, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayNotEqualTo(Integer value) {
			addCriterion("limit_day <>", value, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayGreaterThan(Integer value) {
			addCriterion("limit_day >", value, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayGreaterThanOrEqualTo(Integer value) {
			addCriterion("limit_day >=", value, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayLessThan(Integer value) {
			addCriterion("limit_day <", value, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayLessThanOrEqualTo(Integer value) {
			addCriterion("limit_day <=", value, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayIn(List<Integer> values) {
			addCriterion("limit_day in", values, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayNotIn(List<Integer> values) {
			addCriterion("limit_day not in", values, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayBetween(Integer value1, Integer value2) {
			addCriterion("limit_day between", value1, value2, "limitDay");
			return (Criteria) this;
		}

		public Criteria andLimitDayNotBetween(Integer value1, Integer value2) {
			addCriterion("limit_day not between", value1, value2, "limitDay");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(Date value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(Date value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(Date value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(Date value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Date value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<Date> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<Date> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(Date value1, Date value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(Date value1, Date value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNull() {
			addCriterion("end_time is null");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNotNull() {
			addCriterion("end_time is not null");
			return (Criteria) this;
		}

		public Criteria andEndTimeEqualTo(Date value) {
			addCriterion("end_time =", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotEqualTo(Date value) {
			addCriterion("end_time <>", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThan(Date value) {
			addCriterion("end_time >", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("end_time >=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThan(Date value) {
			addCriterion("end_time <", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThanOrEqualTo(Date value) {
			addCriterion("end_time <=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIn(List<Date> values) {
			addCriterion("end_time in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotIn(List<Date> values) {
			addCriterion("end_time not in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeBetween(Date value1, Date value2) {
			addCriterion("end_time between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotBetween(Date value1, Date value2) {
			addCriterion("end_time not between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysIsNull() {
			addCriterion("effective_days is null");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysIsNotNull() {
			addCriterion("effective_days is not null");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysEqualTo(Integer value) {
			addCriterion("effective_days =", value, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysNotEqualTo(Integer value) {
			addCriterion("effective_days <>", value, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysGreaterThan(Integer value) {
			addCriterion("effective_days >", value, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysGreaterThanOrEqualTo(Integer value) {
			addCriterion("effective_days >=", value, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysLessThan(Integer value) {
			addCriterion("effective_days <", value, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysLessThanOrEqualTo(Integer value) {
			addCriterion("effective_days <=", value, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysIn(List<Integer> values) {
			addCriterion("effective_days in", values, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysNotIn(List<Integer> values) {
			addCriterion("effective_days not in", values, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysBetween(Integer value1, Integer value2) {
			addCriterion("effective_days between", value1, value2, "effectiveDays");
			return (Criteria) this;
		}

		public Criteria andEffectiveDaysNotBetween(Integer value1, Integer value2) {
			addCriterion("effective_days not between", value1, value2, "effectiveDays");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table activity_detail_send_hongbao
	 * @mbg.generated  Thu Jun 20 14:04:46 CST 2019
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
     * This class corresponds to the database table activity_detail_send_hongbao
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 18 17:13:13 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}