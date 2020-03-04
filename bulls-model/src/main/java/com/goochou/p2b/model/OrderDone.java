package com.goochou.p2b.model;

import java.util.Date;

public class OrderDone {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_done.id
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_done.order_no
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_done.order_type
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    private String orderType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_done.order_status
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    private String orderStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_done.send
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    private Integer send;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_done.create_date
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_done.update_date
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_done.id
     *
     * @return the value of order_done.id
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_done.id
     *
     * @param id the value for order_done.id
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_done.order_no
     *
     * @return the value of order_done.order_no
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_done.order_no
     *
     * @param orderNo the value for order_done.order_no
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_done.order_type
     *
     * @return the value of order_done.order_type
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_done.order_type
     *
     * @param orderType the value for order_done.order_type
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_done.order_status
     *
     * @return the value of order_done.order_status
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_done.order_status
     *
     * @param orderStatus the value for order_done.order_status
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_done.send
     *
     * @return the value of order_done.send
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public Integer getSend() {
        return send;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_done.send
     *
     * @param send the value for order_done.send
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public void setSend(Integer send) {
        this.send = send;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_done.create_date
     *
     * @return the value of order_done.create_date
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_done.create_date
     *
     * @param createDate the value for order_done.create_date
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_done.update_date
     *
     * @return the value of order_done.update_date
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_done.update_date
     *
     * @param updateDate the value for order_done.update_date
     *
     * @mbggenerated Wed Jun 19 17:23:44 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}