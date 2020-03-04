package com.goochou.p2b.model;

import java.util.Date;

public class Capital {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column capital.id
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column capital.investment_id
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    private Integer investmentId;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column capital.amount
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    private Double amount;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to
     * the database column capital.time
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column capital.id
     * 
     * @return the value of capital.id
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column capital.id
     * 
     * @param id
     *            the value for capital.id
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column capital.investment_id
     * 
     * @return the value of capital.investment_id
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    public Integer getInvestmentId() {
        return investmentId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column capital.investment_id
     * 
     * @param investmentId
     *            the value for capital.investment_id
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    public void setInvestmentId(Integer investmentId) {
        this.investmentId = investmentId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column capital.amount
     * 
     * @return the value of capital.amount
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column capital.amount
     * 
     * @param amount
     *            the value for capital.amount
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the
     * value of the database column capital.time
     * 
     * @return the value of capital.time
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the
     * value of the database column capital.time
     * 
     * @param time
     *            the value for capital.time
     * 
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    public void setTime(Date time) {
        this.time = time;
    }

    // -------
    private Investment investment;

    public Investment getInvestment() {
        return investment;
    }

    public void setInvestment(Investment investment) {
        this.investment = investment;
    }
}