package com.goochou.p2b.model;

import java.util.Date;

public class UserSigned {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_signed.id
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_signed.user_id
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_signed.time
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_signed.client
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    private String client;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_signed.id
     *
     * @return the value of user_signed.id
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_signed.id
     *
     * @param id the value for user_signed.id
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_signed.user_id
     *
     * @return the value of user_signed.user_id
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_signed.user_id
     *
     * @param userId the value for user_signed.user_id
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_signed.time
     *
     * @return the value of user_signed.time
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_signed.time
     *
     * @param time the value for user_signed.time
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_signed.client
     *
     * @return the value of user_signed.client
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    public String getClient() {
        return client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_signed.client
     *
     * @param client the value for user_signed.client
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    public void setClient(String client) {
        this.client = client;
    }
}