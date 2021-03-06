package com.goochou.p2b.model;

import java.util.ArrayList;
import java.util.List;

public class TmDictExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public TmDictExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
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
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
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

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTKeyIsNull() {
            addCriterion("t_key is null");
            return (Criteria) this;
        }

        public Criteria andTKeyIsNotNull() {
            addCriterion("t_key is not null");
            return (Criteria) this;
        }

        public Criteria andTKeyEqualTo(String value) {
            addCriterion("t_key =", value, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyNotEqualTo(String value) {
            addCriterion("t_key <>", value, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyGreaterThan(String value) {
            addCriterion("t_key >", value, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyGreaterThanOrEqualTo(String value) {
            addCriterion("t_key >=", value, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyLessThan(String value) {
            addCriterion("t_key <", value, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyLessThanOrEqualTo(String value) {
            addCriterion("t_key <=", value, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyLike(String value) {
            addCriterion("t_key like", value, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyNotLike(String value) {
            addCriterion("t_key not like", value, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyIn(List<String> values) {
            addCriterion("t_key in", values, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyNotIn(List<String> values) {
            addCriterion("t_key not in", values, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyBetween(String value1, String value2) {
            addCriterion("t_key between", value1, value2, "tKey");
            return (Criteria) this;
        }

        public Criteria andTKeyNotBetween(String value1, String value2) {
            addCriterion("t_key not between", value1, value2, "tKey");
            return (Criteria) this;
        }

        public Criteria andTValueIsNull() {
            addCriterion("t_value is null");
            return (Criteria) this;
        }

        public Criteria andTValueIsNotNull() {
            addCriterion("t_value is not null");
            return (Criteria) this;
        }

        public Criteria andTValueEqualTo(String value) {
            addCriterion("t_value =", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueNotEqualTo(String value) {
            addCriterion("t_value <>", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueGreaterThan(String value) {
            addCriterion("t_value >", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueGreaterThanOrEqualTo(String value) {
            addCriterion("t_value >=", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueLessThan(String value) {
            addCriterion("t_value <", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueLessThanOrEqualTo(String value) {
            addCriterion("t_value <=", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueLike(String value) {
            addCriterion("t_value like", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueNotLike(String value) {
            addCriterion("t_value not like", value, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueIn(List<String> values) {
            addCriterion("t_value in", values, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueNotIn(List<String> values) {
            addCriterion("t_value not in", values, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueBetween(String value1, String value2) {
            addCriterion("t_value between", value1, value2, "tValue");
            return (Criteria) this;
        }

        public Criteria andTValueNotBetween(String value1, String value2) {
            addCriterion("t_value not between", value1, value2, "tValue");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andTSortIsNull() {
            addCriterion("t_sort is null");
            return (Criteria) this;
        }

        public Criteria andTSortIsNotNull() {
            addCriterion("t_sort is not null");
            return (Criteria) this;
        }

        public Criteria andTSortEqualTo(Integer value) {
            addCriterion("t_sort =", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotEqualTo(Integer value) {
            addCriterion("t_sort <>", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortGreaterThan(Integer value) {
            addCriterion("t_sort >", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_sort >=", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortLessThan(Integer value) {
            addCriterion("t_sort <", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortLessThanOrEqualTo(Integer value) {
            addCriterion("t_sort <=", value, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortIn(List<Integer> values) {
            addCriterion("t_sort in", values, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotIn(List<Integer> values) {
            addCriterion("t_sort not in", values, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortBetween(Integer value1, Integer value2) {
            addCriterion("t_sort between", value1, value2, "tSort");
            return (Criteria) this;
        }

        public Criteria andTSortNotBetween(Integer value1, Integer value2) {
            addCriterion("t_sort not between", value1, value2, "tSort");
            return (Criteria) this;
        }

        public Criteria andTpIsNull() {
            addCriterion("tp is null");
            return (Criteria) this;
        }

        public Criteria andTpIsNotNull() {
            addCriterion("tp is not null");
            return (Criteria) this;
        }

        public Criteria andTpEqualTo(String value) {
            addCriterion("tp =", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotEqualTo(String value) {
            addCriterion("tp <>", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThan(String value) {
            addCriterion("tp >", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThanOrEqualTo(String value) {
            addCriterion("tp >=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThan(String value) {
            addCriterion("tp <", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThanOrEqualTo(String value) {
            addCriterion("tp <=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLike(String value) {
            addCriterion("tp like", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotLike(String value) {
            addCriterion("tp not like", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpIn(List<String> values) {
            addCriterion("tp in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotIn(List<String> values) {
            addCriterion("tp not in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpBetween(String value1, String value2) {
            addCriterion("tp between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotBetween(String value1, String value2) {
            addCriterion("tp not between", value1, value2, "tp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tm_dict
     *
     * @mbggenerated do_not_delete_during_merge Tue Feb 27 10:35:43 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tm_dict
     *
     * @mbggenerated Tue Feb 27 10:35:43 CST 2018
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