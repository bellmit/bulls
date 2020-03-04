package com.goochou.p2b.model.goods;

import java.util.Date;

public class GoodsOrderRefund {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.order_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.user_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.reason
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.create_date
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.update_date
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.status
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.audit_user_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private Integer auditUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_order_refund.audit_remark
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    private String auditRemark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.id
     *
     * @return the value of t_goods_order_refund.id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.id
     *
     * @param id the value for t_goods_order_refund.id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.order_id
     *
     * @return the value of t_goods_order_refund.order_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.order_id
     *
     * @param orderId the value for t_goods_order_refund.order_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.user_id
     *
     * @return the value of t_goods_order_refund.user_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.user_id
     *
     * @param userId the value for t_goods_order_refund.user_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.reason
     *
     * @return the value of t_goods_order_refund.reason
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.reason
     *
     * @param reason the value for t_goods_order_refund.reason
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.create_date
     *
     * @return the value of t_goods_order_refund.create_date
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.create_date
     *
     * @param createDate the value for t_goods_order_refund.create_date
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.update_date
     *
     * @return the value of t_goods_order_refund.update_date
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.update_date
     *
     * @param updateDate the value for t_goods_order_refund.update_date
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.status
     *
     * @return the value of t_goods_order_refund.status
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.status
     *
     * @param status the value for t_goods_order_refund.status
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.audit_user_id
     *
     * @return the value of t_goods_order_refund.audit_user_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public Integer getAuditUserId() {
        return auditUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.audit_user_id
     *
     * @param auditUserId the value for t_goods_order_refund.audit_user_id
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setAuditUserId(Integer auditUserId) {
        this.auditUserId = auditUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_order_refund.audit_remark
     *
     * @return the value of t_goods_order_refund.audit_remark
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public String getAuditRemark() {
        return auditRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_order_refund.audit_remark
     *
     * @param auditRemark the value for t_goods_order_refund.audit_remark
     *
     * @mbg.generated Tue Jun 04 15:51:19 CST 2019
     */
    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }
}