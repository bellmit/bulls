package com.goochou.p2b.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServiceContactUserLinkExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public CustomerServiceContactUserLinkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
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
     * This method corresponds to the database table customer_service_contact_user_link
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
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
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
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_contact_user_link
     *
     * @mbggenerated Tue Nov 17 13:33:40 CST 2015
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_service_contact_user_link
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateIsNull() {
            addCriterion("service_task_date is null");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateIsNotNull() {
            addCriterion("service_task_date is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateEqualTo(Date value) {
            addCriterion("service_task_date =", value, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateNotEqualTo(Date value) {
            addCriterion("service_task_date <>", value, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateGreaterThan(Date value) {
            addCriterion("service_task_date >", value, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateGreaterThanOrEqualTo(Date value) {
            addCriterion("service_task_date >=", value, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateLessThan(Date value) {
            addCriterion("service_task_date <", value, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateLessThanOrEqualTo(Date value) {
            addCriterion("service_task_date <=", value, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateIn(List<Date> values) {
            addCriterion("service_task_date in", values, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateNotIn(List<Date> values) {
            addCriterion("service_task_date not in", values, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateBetween(Date value1, Date value2) {
            addCriterion("service_task_date between", value1, value2, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andServiceTaskDateNotBetween(Date value1, Date value2) {
            addCriterion("service_task_date not between", value1, value2, "serviceTaskDate");
            return (Criteria) this;
        }

        public Criteria andContactCountIsNull() {
            addCriterion("contact_count is null");
            return (Criteria) this;
        }

        public Criteria andContactCountIsNotNull() {
            addCriterion("contact_count is not null");
            return (Criteria) this;
        }

        public Criteria andContactCountEqualTo(Integer value) {
            addCriterion("contact_count =", value, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountNotEqualTo(Integer value) {
            addCriterion("contact_count <>", value, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountGreaterThan(Integer value) {
            addCriterion("contact_count >", value, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_count >=", value, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountLessThan(Integer value) {
            addCriterion("contact_count <", value, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountLessThanOrEqualTo(Integer value) {
            addCriterion("contact_count <=", value, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountIn(List<Integer> values) {
            addCriterion("contact_count in", values, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountNotIn(List<Integer> values) {
            addCriterion("contact_count not in", values, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountBetween(Integer value1, Integer value2) {
            addCriterion("contact_count between", value1, value2, "contactCount");
            return (Criteria) this;
        }

        public Criteria andContactCountNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_count not between", value1, value2, "contactCount");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeIsNull() {
            addCriterion("actual_contact_time is null");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeIsNotNull() {
            addCriterion("actual_contact_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeEqualTo(Date value) {
            addCriterion("actual_contact_time =", value, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeNotEqualTo(Date value) {
            addCriterion("actual_contact_time <>", value, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeGreaterThan(Date value) {
            addCriterion("actual_contact_time >", value, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("actual_contact_time >=", value, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeLessThan(Date value) {
            addCriterion("actual_contact_time <", value, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeLessThanOrEqualTo(Date value) {
            addCriterion("actual_contact_time <=", value, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeIn(List<Date> values) {
            addCriterion("actual_contact_time in", values, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeNotIn(List<Date> values) {
            addCriterion("actual_contact_time not in", values, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeBetween(Date value1, Date value2) {
            addCriterion("actual_contact_time between", value1, value2, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andActualContactTimeNotBetween(Date value1, Date value2) {
            addCriterion("actual_contact_time not between", value1, value2, "actualContactTime");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteIsNull() {
            addCriterion("connection_note is null");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteIsNotNull() {
            addCriterion("connection_note is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteEqualTo(String value) {
            addCriterion("connection_note =", value, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteNotEqualTo(String value) {
            addCriterion("connection_note <>", value, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteGreaterThan(String value) {
            addCriterion("connection_note >", value, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteGreaterThanOrEqualTo(String value) {
            addCriterion("connection_note >=", value, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteLessThan(String value) {
            addCriterion("connection_note <", value, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteLessThanOrEqualTo(String value) {
            addCriterion("connection_note <=", value, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteLike(String value) {
            addCriterion("connection_note like", value, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteNotLike(String value) {
            addCriterion("connection_note not like", value, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteIn(List<String> values) {
            addCriterion("connection_note in", values, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteNotIn(List<String> values) {
            addCriterion("connection_note not in", values, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteBetween(String value1, String value2) {
            addCriterion("connection_note between", value1, value2, "connectionNote");
            return (Criteria) this;
        }

        public Criteria andConnectionNoteNotBetween(String value1, String value2) {
            addCriterion("connection_note not between", value1, value2, "connectionNote");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_service_contact_user_link
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
     * This class corresponds to the database table customer_service_contact_user_link
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