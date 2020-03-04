package com.goochou.p2b.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VipDividendExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	protected int limitStart = -1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	protected int limitEnd = -1;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public VipDividendExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public int getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	public int getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_vip_dividend
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

		public Criteria andDividendDateIsNull() {
			addCriterion("dividend_date is null");
			return (Criteria) this;
		}

		public Criteria andDividendDateIsNotNull() {
			addCriterion("dividend_date is not null");
			return (Criteria) this;
		}

		public Criteria andDividendDateEqualTo(Date value) {
			addCriterion("dividend_date =", value, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateNotEqualTo(Date value) {
			addCriterion("dividend_date <>", value, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateGreaterThan(Date value) {
			addCriterion("dividend_date >", value, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateGreaterThanOrEqualTo(Date value) {
			addCriterion("dividend_date >=", value, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateLessThan(Date value) {
			addCriterion("dividend_date <", value, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateLessThanOrEqualTo(Date value) {
			addCriterion("dividend_date <=", value, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateIn(List<Date> values) {
			addCriterion("dividend_date in", values, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateNotIn(List<Date> values) {
			addCriterion("dividend_date not in", values, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateBetween(Date value1, Date value2) {
			addCriterion("dividend_date between", value1, value2, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendDateNotBetween(Date value1, Date value2) {
			addCriterion("dividend_date not between", value1, value2, "dividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateIsNull() {
			addCriterion("real_dividend_date is null");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateIsNotNull() {
			addCriterion("real_dividend_date is not null");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateEqualTo(Date value) {
			addCriterion("real_dividend_date =", value, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateNotEqualTo(Date value) {
			addCriterion("real_dividend_date <>", value, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateGreaterThan(Date value) {
			addCriterion("real_dividend_date >", value, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateGreaterThanOrEqualTo(Date value) {
			addCriterion("real_dividend_date >=", value, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateLessThan(Date value) {
			addCriterion("real_dividend_date <", value, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateLessThanOrEqualTo(Date value) {
			addCriterion("real_dividend_date <=", value, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateIn(List<Date> values) {
			addCriterion("real_dividend_date in", values, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateNotIn(List<Date> values) {
			addCriterion("real_dividend_date not in", values, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateBetween(Date value1, Date value2) {
			addCriterion("real_dividend_date between", value1, value2, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andRealDividendDateNotBetween(Date value1, Date value2) {
			addCriterion("real_dividend_date not between", value1, value2, "realDividendDate");
			return (Criteria) this;
		}

		public Criteria andDividendAmountIsNull() {
			addCriterion("dividend_amount is null");
			return (Criteria) this;
		}

		public Criteria andDividendAmountIsNotNull() {
			addCriterion("dividend_amount is not null");
			return (Criteria) this;
		}

		public Criteria andDividendAmountEqualTo(BigDecimal value) {
			addCriterion("dividend_amount =", value, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountNotEqualTo(BigDecimal value) {
			addCriterion("dividend_amount <>", value, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountGreaterThan(BigDecimal value) {
			addCriterion("dividend_amount >", value, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("dividend_amount >=", value, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountLessThan(BigDecimal value) {
			addCriterion("dividend_amount <", value, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("dividend_amount <=", value, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountIn(List<BigDecimal> values) {
			addCriterion("dividend_amount in", values, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountNotIn(List<BigDecimal> values) {
			addCriterion("dividend_amount not in", values, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("dividend_amount between", value1, value2, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendAmountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("dividend_amount not between", value1, value2, "dividendAmount");
			return (Criteria) this;
		}

		public Criteria andDividendScaleIsNull() {
			addCriterion("dividend_scale is null");
			return (Criteria) this;
		}

		public Criteria andDividendScaleIsNotNull() {
			addCriterion("dividend_scale is not null");
			return (Criteria) this;
		}

		public Criteria andDividendScaleEqualTo(BigDecimal value) {
			addCriterion("dividend_scale =", value, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleNotEqualTo(BigDecimal value) {
			addCriterion("dividend_scale <>", value, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleGreaterThan(BigDecimal value) {
			addCriterion("dividend_scale >", value, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("dividend_scale >=", value, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleLessThan(BigDecimal value) {
			addCriterion("dividend_scale <", value, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleLessThanOrEqualTo(BigDecimal value) {
			addCriterion("dividend_scale <=", value, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleIn(List<BigDecimal> values) {
			addCriterion("dividend_scale in", values, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleNotIn(List<BigDecimal> values) {
			addCriterion("dividend_scale not in", values, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("dividend_scale between", value1, value2, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andDividendScaleNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("dividend_scale not between", value1, value2, "dividendScale");
			return (Criteria) this;
		}

		public Criteria andCreditAmountIsNull() {
			addCriterion("credit_amount is null");
			return (Criteria) this;
		}

		public Criteria andCreditAmountIsNotNull() {
			addCriterion("credit_amount is not null");
			return (Criteria) this;
		}

		public Criteria andCreditAmountEqualTo(BigDecimal value) {
			addCriterion("credit_amount =", value, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountNotEqualTo(BigDecimal value) {
			addCriterion("credit_amount <>", value, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountGreaterThan(BigDecimal value) {
			addCriterion("credit_amount >", value, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("credit_amount >=", value, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountLessThan(BigDecimal value) {
			addCriterion("credit_amount <", value, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("credit_amount <=", value, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountIn(List<BigDecimal> values) {
			addCriterion("credit_amount in", values, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountNotIn(List<BigDecimal> values) {
			addCriterion("credit_amount not in", values, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("credit_amount between", value1, value2, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andCreditAmountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("credit_amount not between", value1, value2, "creditAmount");
			return (Criteria) this;
		}

		public Criteria andIsDividendIsNull() {
			addCriterion("is_dividend is null");
			return (Criteria) this;
		}

		public Criteria andIsDividendIsNotNull() {
			addCriterion("is_dividend is not null");
			return (Criteria) this;
		}

		public Criteria andIsDividendEqualTo(Boolean value) {
			addCriterion("is_dividend =", value, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendNotEqualTo(Boolean value) {
			addCriterion("is_dividend <>", value, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendGreaterThan(Boolean value) {
			addCriterion("is_dividend >", value, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_dividend >=", value, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendLessThan(Boolean value) {
			addCriterion("is_dividend <", value, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendLessThanOrEqualTo(Boolean value) {
			addCriterion("is_dividend <=", value, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendIn(List<Boolean> values) {
			addCriterion("is_dividend in", values, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendNotIn(List<Boolean> values) {
			addCriterion("is_dividend not in", values, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendBetween(Boolean value1, Boolean value2) {
			addCriterion("is_dividend between", value1, value2, "isDividend");
			return (Criteria) this;
		}

		public Criteria andIsDividendNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_dividend not between", value1, value2, "isDividend");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_vip_dividend
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
     * This class corresponds to the database table t_vip_dividend
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}