package com.goochou.p2b.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExcludeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public UserExcludeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
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

        public Criteria andExcludeDateIsNull() {
            addCriterion("exclude_date is null");
            return (Criteria) this;
        }

        public Criteria andExcludeDateIsNotNull() {
            addCriterion("exclude_date is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeDateEqualTo(Date value) {
            addCriterion("exclude_date =", value, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateNotEqualTo(Date value) {
            addCriterion("exclude_date <>", value, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateGreaterThan(Date value) {
            addCriterion("exclude_date >", value, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exclude_date >=", value, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateLessThan(Date value) {
            addCriterion("exclude_date <", value, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateLessThanOrEqualTo(Date value) {
            addCriterion("exclude_date <=", value, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateIn(List<Date> values) {
            addCriterion("exclude_date in", values, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateNotIn(List<Date> values) {
            addCriterion("exclude_date not in", values, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateBetween(Date value1, Date value2) {
            addCriterion("exclude_date between", value1, value2, "excludeDate");
            return (Criteria) this;
        }

        public Criteria andExcludeDateNotBetween(Date value1, Date value2) {
            addCriterion("exclude_date not between", value1, value2, "excludeDate");
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

        public Criteria andExcludeReasonIsNull() {
            addCriterion("exclude_reason is null");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonIsNotNull() {
            addCriterion("exclude_reason is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonEqualTo(String value) {
            addCriterion("exclude_reason =", value, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonNotEqualTo(String value) {
            addCriterion("exclude_reason <>", value, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonGreaterThan(String value) {
            addCriterion("exclude_reason >", value, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("exclude_reason >=", value, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonLessThan(String value) {
            addCriterion("exclude_reason <", value, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonLessThanOrEqualTo(String value) {
            addCriterion("exclude_reason <=", value, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonLike(String value) {
            addCriterion("exclude_reason like", value, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonNotLike(String value) {
            addCriterion("exclude_reason not like", value, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonIn(List<String> values) {
            addCriterion("exclude_reason in", values, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonNotIn(List<String> values) {
            addCriterion("exclude_reason not in", values, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonBetween(String value1, String value2) {
            addCriterion("exclude_reason between", value1, value2, "excludeReason");
            return (Criteria) this;
        }

        public Criteria andExcludeReasonNotBetween(String value1, String value2) {
            addCriterion("exclude_reason not between", value1, value2, "excludeReason");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_exclude
     *
     * @mbggenerated do_not_delete_during_merge Tue Nov 17 13:33:40 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_exclude
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}