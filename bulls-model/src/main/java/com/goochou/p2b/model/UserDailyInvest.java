package com.goochou.p2b.model;

import java.util.Date;

public class UserDailyInvest {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_daily_invest.id
     *
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_daily_invest.user_id
     *
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_daily_invest.amount
     *
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    private Double amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_daily_invest.interest
     *
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    private Double interest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_daily_invest.time
     *
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_daily_invest.id
     *
     * @return the value of user_daily_invest.id
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_daily_invest.id
     *
     * @param id the value for user_daily_invest.id
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_daily_invest.user_id
     *
     * @return the value of user_daily_invest.user_id
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_daily_invest.user_id
     *
     * @param userId the value for user_daily_invest.user_id
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_daily_invest.amount
     *
     * @return the value of user_daily_invest.amount
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_daily_invest.amount
     *
     * @param amount the value for user_daily_invest.amount
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_daily_invest.interest
     *
     * @return the value of user_daily_invest.interest
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public Double getInterest() {
        return interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_daily_invest.interest
     *
     * @param interest the value for user_daily_invest.interest
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public void setInterest(Double interest) {
        this.interest = interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_daily_invest.time
     *
     * @return the value of user_daily_invest.time
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_daily_invest.time
     *
     * @param time the value for user_daily_invest.time
     * @mbggenerated Tue Sep 13 09:56:30 CST 2016
     */
    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserDailyInvest [id=" + id + ", userId=" + userId + ", amount=" + amount + ", interest=" + interest + ", time=" + time + "]";
    }

}