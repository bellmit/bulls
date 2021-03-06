package com.goochou.p2b.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServiceTaskManagementExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public CustomerServiceTaskManagementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
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
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
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

        public Criteria andOldUserStartNoIsNull() {
            addCriterion("old_user_start_no is null");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoIsNotNull() {
            addCriterion("old_user_start_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoEqualTo(Integer value) {
            addCriterion("old_user_start_no =", value, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoNotEqualTo(Integer value) {
            addCriterion("old_user_start_no <>", value, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoGreaterThan(Integer value) {
            addCriterion("old_user_start_no >", value, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_user_start_no >=", value, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoLessThan(Integer value) {
            addCriterion("old_user_start_no <", value, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoLessThanOrEqualTo(Integer value) {
            addCriterion("old_user_start_no <=", value, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoIn(List<Integer> values) {
            addCriterion("old_user_start_no in", values, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoNotIn(List<Integer> values) {
            addCriterion("old_user_start_no not in", values, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoBetween(Integer value1, Integer value2) {
            addCriterion("old_user_start_no between", value1, value2, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserStartNoNotBetween(Integer value1, Integer value2) {
            addCriterion("old_user_start_no not between", value1, value2, "oldUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoIsNull() {
            addCriterion("new_user_start_no is null");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoIsNotNull() {
            addCriterion("new_user_start_no is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoEqualTo(Integer value) {
            addCriterion("new_user_start_no =", value, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoNotEqualTo(Integer value) {
            addCriterion("new_user_start_no <>", value, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoGreaterThan(Integer value) {
            addCriterion("new_user_start_no >", value, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_user_start_no >=", value, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoLessThan(Integer value) {
            addCriterion("new_user_start_no <", value, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoLessThanOrEqualTo(Integer value) {
            addCriterion("new_user_start_no <=", value, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoIn(List<Integer> values) {
            addCriterion("new_user_start_no in", values, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoNotIn(List<Integer> values) {
            addCriterion("new_user_start_no not in", values, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoBetween(Integer value1, Integer value2) {
            addCriterion("new_user_start_no between", value1, value2, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andNewUserStartNoNotBetween(Integer value1, Integer value2) {
            addCriterion("new_user_start_no not between", value1, value2, "newUserStartNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoIsNull() {
            addCriterion("old_user_daily_no is null");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoIsNotNull() {
            addCriterion("old_user_daily_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoEqualTo(Integer value) {
            addCriterion("old_user_daily_no =", value, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoNotEqualTo(Integer value) {
            addCriterion("old_user_daily_no <>", value, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoGreaterThan(Integer value) {
            addCriterion("old_user_daily_no >", value, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_user_daily_no >=", value, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoLessThan(Integer value) {
            addCriterion("old_user_daily_no <", value, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoLessThanOrEqualTo(Integer value) {
            addCriterion("old_user_daily_no <=", value, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoIn(List<Integer> values) {
            addCriterion("old_user_daily_no in", values, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoNotIn(List<Integer> values) {
            addCriterion("old_user_daily_no not in", values, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoBetween(Integer value1, Integer value2) {
            addCriterion("old_user_daily_no between", value1, value2, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUserDailyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("old_user_daily_no not between", value1, value2, "oldUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoIsNull() {
            addCriterion("new_user_daily_no is null");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoIsNotNull() {
            addCriterion("new_user_daily_no is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoEqualTo(Integer value) {
            addCriterion("new_user_daily_no =", value, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoNotEqualTo(Integer value) {
            addCriterion("new_user_daily_no <>", value, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoGreaterThan(Integer value) {
            addCriterion("new_user_daily_no >", value, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_user_daily_no >=", value, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoLessThan(Integer value) {
            addCriterion("new_user_daily_no <", value, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoLessThanOrEqualTo(Integer value) {
            addCriterion("new_user_daily_no <=", value, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoIn(List<Integer> values) {
            addCriterion("new_user_daily_no in", values, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoNotIn(List<Integer> values) {
            addCriterion("new_user_daily_no not in", values, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoBetween(Integer value1, Integer value2) {
            addCriterion("new_user_daily_no between", value1, value2, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andNewUserDailyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("new_user_daily_no not between", value1, value2, "newUserDailyNo");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateIsNull() {
            addCriterion("old_update_date is null");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateIsNotNull() {
            addCriterion("old_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateEqualTo(Date value) {
            addCriterion("old_update_date =", value, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateNotEqualTo(Date value) {
            addCriterion("old_update_date <>", value, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateGreaterThan(Date value) {
            addCriterion("old_update_date >", value, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("old_update_date >=", value, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateLessThan(Date value) {
            addCriterion("old_update_date <", value, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("old_update_date <=", value, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateIn(List<Date> values) {
            addCriterion("old_update_date in", values, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateNotIn(List<Date> values) {
            addCriterion("old_update_date not in", values, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateBetween(Date value1, Date value2) {
            addCriterion("old_update_date between", value1, value2, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOldUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("old_update_date not between", value1, value2, "oldUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateIsNull() {
            addCriterion("new_update_date is null");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateIsNotNull() {
            addCriterion("new_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateEqualTo(Date value) {
            addCriterion("new_update_date =", value, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateNotEqualTo(Date value) {
            addCriterion("new_update_date <>", value, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateGreaterThan(Date value) {
            addCriterion("new_update_date >", value, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("new_update_date >=", value, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateLessThan(Date value) {
            addCriterion("new_update_date <", value, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("new_update_date <=", value, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateIn(List<Date> values) {
            addCriterion("new_update_date in", values, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateNotIn(List<Date> values) {
            addCriterion("new_update_date not in", values, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateBetween(Date value1, Date value2) {
            addCriterion("new_update_date between", value1, value2, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andNewUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("new_update_date not between", value1, value2, "newUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPollingCountIsNull() {
            addCriterion("polling_count is null");
            return (Criteria) this;
        }

        public Criteria andPollingCountIsNotNull() {
            addCriterion("polling_count is not null");
            return (Criteria) this;
        }

        public Criteria andPollingCountEqualTo(Integer value) {
            addCriterion("polling_count =", value, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountNotEqualTo(Integer value) {
            addCriterion("polling_count <>", value, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountGreaterThan(Integer value) {
            addCriterion("polling_count >", value, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("polling_count >=", value, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountLessThan(Integer value) {
            addCriterion("polling_count <", value, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountLessThanOrEqualTo(Integer value) {
            addCriterion("polling_count <=", value, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountIn(List<Integer> values) {
            addCriterion("polling_count in", values, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountNotIn(List<Integer> values) {
            addCriterion("polling_count not in", values, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountBetween(Integer value1, Integer value2) {
            addCriterion("polling_count between", value1, value2, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andPollingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("polling_count not between", value1, value2, "pollingCount");
            return (Criteria) this;
        }

        public Criteria andIspollingIsNull() {
            addCriterion("isPolling is null");
            return (Criteria) this;
        }

        public Criteria andIspollingIsNotNull() {
            addCriterion("isPolling is not null");
            return (Criteria) this;
        }

        public Criteria andIspollingEqualTo(Integer value) {
            addCriterion("isPolling =", value, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingNotEqualTo(Integer value) {
            addCriterion("isPolling <>", value, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingGreaterThan(Integer value) {
            addCriterion("isPolling >", value, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPolling >=", value, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingLessThan(Integer value) {
            addCriterion("isPolling <", value, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingLessThanOrEqualTo(Integer value) {
            addCriterion("isPolling <=", value, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingIn(List<Integer> values) {
            addCriterion("isPolling in", values, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingNotIn(List<Integer> values) {
            addCriterion("isPolling not in", values, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingBetween(Integer value1, Integer value2) {
            addCriterion("isPolling between", value1, value2, "ispolling");
            return (Criteria) this;
        }

        public Criteria andIspollingNotBetween(Integer value1, Integer value2) {
            addCriterion("isPolling not between", value1, value2, "ispolling");
            return (Criteria) this;
        }

        public Criteria andInitNoIsNull() {
            addCriterion("init_no is null");
            return (Criteria) this;
        }

        public Criteria andInitNoIsNotNull() {
            addCriterion("init_no is not null");
            return (Criteria) this;
        }

        public Criteria andInitNoEqualTo(Integer value) {
            addCriterion("init_no =", value, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoNotEqualTo(Integer value) {
            addCriterion("init_no <>", value, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoGreaterThan(Integer value) {
            addCriterion("init_no >", value, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("init_no >=", value, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoLessThan(Integer value) {
            addCriterion("init_no <", value, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoLessThanOrEqualTo(Integer value) {
            addCriterion("init_no <=", value, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoIn(List<Integer> values) {
            addCriterion("init_no in", values, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoNotIn(List<Integer> values) {
            addCriterion("init_no not in", values, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoBetween(Integer value1, Integer value2) {
            addCriterion("init_no between", value1, value2, "initNo");
            return (Criteria) this;
        }

        public Criteria andInitNoNotBetween(Integer value1, Integer value2) {
            addCriterion("init_no not between", value1, value2, "initNo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_service_task_management
     *
     * @mbggenerated do_not_delete_during_merge Tue Nov 17 19:58:46 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_service_task_management
     *
     * @mbggenerated Tue Nov 17 19:58:46 CST 2015
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