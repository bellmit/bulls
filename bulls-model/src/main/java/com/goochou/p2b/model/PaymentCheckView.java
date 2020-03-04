package com.goochou.p2b.model;

import java.io.Serializable;
import java.util.Date;

public class PaymentCheckView implements Serializable {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.order_no
     * @mbg.generated
     */
    private String orderNo;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.recharge_lose_warning
     * @mbg.generated
     */
    private Long rechargeLoseWarning;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.check_lose_warning
     * @mbg.generated
     */
    private Long checkLoseWarning;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.recharge_create_date
     * @mbg.generated
     */
    private Date rechargeCreateDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.check_create_date
     * @mbg.generated
     */
    private Date checkCreateDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.create_date
     * @mbg.generated
     */
    private Date createDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.create_date_warning
     * @mbg.generated
     */
    private Long createDateWarning;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.recharge_update_date
     * @mbg.generated
     */
    private Date rechargeUpdateDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.check_update_date
     * @mbg.generated
     */
    private Date checkUpdateDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.update_date
     * @mbg.generated
     */
    private Date updateDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.update_date_warning
     * @mbg.generated
     */
    private Long updateDateWarning;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.recharge_amount
     * @mbg.generated
     */
    private Double rechargeAmount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.check_amount
     * @mbg.generated
     */
    private Double checkAmount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.amount
     * @mbg.generated
     */
    private Double amount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.amount_warning
     * @mbg.generated
     */
    private Long amountWarning;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.recharge_pay_channel
     * @mbg.generated
     */
    private String rechargePayChannel;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.check_pay_channel
     * @mbg.generated
     */
    private String checkPayChannel;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.pay_channel
     * @mbg.generated
     */
    private String payChannel;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.pay_channel_warning
     * @mbg.generated
     */
    private Long payChannelWarning;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.recharge_status
     * @mbg.generated
     */
    private Integer rechargeStatus;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.check_status
     * @mbg.generated
     */
    private Integer checkStatus;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.status
     * @mbg.generated
     */
    private Integer status;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.status_warning
     * @mbg.generated
     */
    private Long statusWarning;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.fee
     * @mbg.generated
     */
    private Double fee;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.refund_amount
     * @mbg.generated
     */
    private Double refundAmount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.refund_status
     * @mbg.generated
     */
    private Integer refundStatus;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.refund_fee
     * @mbg.generated
     */
    private Double refundFee;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column payment_check_view.warning_tag
     * @mbg.generated
     */
    private Long warningTag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table payment_check_view
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.order_no
     * @return  the value of payment_check_view.order_no
     * @mbg.generated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.order_no
     * @param orderNo  the value for payment_check_view.order_no
     * @mbg.generated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.recharge_lose_warning
     * @return  the value of payment_check_view.recharge_lose_warning
     * @mbg.generated
     */
    public Long getRechargeLoseWarning() {
        return rechargeLoseWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.recharge_lose_warning
     * @param rechargeLoseWarning  the value for payment_check_view.recharge_lose_warning
     * @mbg.generated
     */
    public void setRechargeLoseWarning(Long rechargeLoseWarning) {
        this.rechargeLoseWarning = rechargeLoseWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.check_lose_warning
     * @return  the value of payment_check_view.check_lose_warning
     * @mbg.generated
     */
    public Long getCheckLoseWarning() {
        return checkLoseWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.check_lose_warning
     * @param checkLoseWarning  the value for payment_check_view.check_lose_warning
     * @mbg.generated
     */
    public void setCheckLoseWarning(Long checkLoseWarning) {
        this.checkLoseWarning = checkLoseWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.recharge_create_date
     * @return  the value of payment_check_view.recharge_create_date
     * @mbg.generated
     */
    public Date getRechargeCreateDate() {
        return rechargeCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.recharge_create_date
     * @param rechargeCreateDate  the value for payment_check_view.recharge_create_date
     * @mbg.generated
     */
    public void setRechargeCreateDate(Date rechargeCreateDate) {
        this.rechargeCreateDate = rechargeCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.check_create_date
     * @return  the value of payment_check_view.check_create_date
     * @mbg.generated
     */
    public Date getCheckCreateDate() {
        return checkCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.check_create_date
     * @param checkCreateDate  the value for payment_check_view.check_create_date
     * @mbg.generated
     */
    public void setCheckCreateDate(Date checkCreateDate) {
        this.checkCreateDate = checkCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.create_date
     * @return  the value of payment_check_view.create_date
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.create_date
     * @param createDate  the value for payment_check_view.create_date
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.create_date_warning
     * @return  the value of payment_check_view.create_date_warning
     * @mbg.generated
     */
    public Long getCreateDateWarning() {
        return createDateWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.create_date_warning
     * @param createDateWarning  the value for payment_check_view.create_date_warning
     * @mbg.generated
     */
    public void setCreateDateWarning(Long createDateWarning) {
        this.createDateWarning = createDateWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.recharge_update_date
     * @return  the value of payment_check_view.recharge_update_date
     * @mbg.generated
     */
    public Date getRechargeUpdateDate() {
        return rechargeUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.recharge_update_date
     * @param rechargeUpdateDate  the value for payment_check_view.recharge_update_date
     * @mbg.generated
     */
    public void setRechargeUpdateDate(Date rechargeUpdateDate) {
        this.rechargeUpdateDate = rechargeUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.check_update_date
     * @return  the value of payment_check_view.check_update_date
     * @mbg.generated
     */
    public Date getCheckUpdateDate() {
        return checkUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.check_update_date
     * @param checkUpdateDate  the value for payment_check_view.check_update_date
     * @mbg.generated
     */
    public void setCheckUpdateDate(Date checkUpdateDate) {
        this.checkUpdateDate = checkUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.update_date
     * @return  the value of payment_check_view.update_date
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.update_date
     * @param updateDate  the value for payment_check_view.update_date
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.update_date_warning
     * @return  the value of payment_check_view.update_date_warning
     * @mbg.generated
     */
    public Long getUpdateDateWarning() {
        return updateDateWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.update_date_warning
     * @param updateDateWarning  the value for payment_check_view.update_date_warning
     * @mbg.generated
     */
    public void setUpdateDateWarning(Long updateDateWarning) {
        this.updateDateWarning = updateDateWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.recharge_amount
     * @return  the value of payment_check_view.recharge_amount
     * @mbg.generated
     */
    public Double getRechargeAmount() {
        return rechargeAmount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.recharge_amount
     * @param rechargeAmount  the value for payment_check_view.recharge_amount
     * @mbg.generated
     */
    public void setRechargeAmount(Double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.check_amount
     * @return  the value of payment_check_view.check_amount
     * @mbg.generated
     */
    public Double getCheckAmount() {
        return checkAmount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.check_amount
     * @param checkAmount  the value for payment_check_view.check_amount
     * @mbg.generated
     */
    public void setCheckAmount(Double checkAmount) {
        this.checkAmount = checkAmount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.amount
     * @return  the value of payment_check_view.amount
     * @mbg.generated
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.amount
     * @param amount  the value for payment_check_view.amount
     * @mbg.generated
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.amount_warning
     * @return  the value of payment_check_view.amount_warning
     * @mbg.generated
     */
    public Long getAmountWarning() {
        return amountWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.amount_warning
     * @param amountWarning  the value for payment_check_view.amount_warning
     * @mbg.generated
     */
    public void setAmountWarning(Long amountWarning) {
        this.amountWarning = amountWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.recharge_pay_channel
     * @return  the value of payment_check_view.recharge_pay_channel
     * @mbg.generated
     */
    public String getRechargePayChannel() {
        return rechargePayChannel;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.recharge_pay_channel
     * @param rechargePayChannel  the value for payment_check_view.recharge_pay_channel
     * @mbg.generated
     */
    public void setRechargePayChannel(String rechargePayChannel) {
        this.rechargePayChannel = rechargePayChannel;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.check_pay_channel
     * @return  the value of payment_check_view.check_pay_channel
     * @mbg.generated
     */
    public String getCheckPayChannel() {
        return checkPayChannel;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.check_pay_channel
     * @param checkPayChannel  the value for payment_check_view.check_pay_channel
     * @mbg.generated
     */
    public void setCheckPayChannel(String checkPayChannel) {
        this.checkPayChannel = checkPayChannel;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.pay_channel
     * @return  the value of payment_check_view.pay_channel
     * @mbg.generated
     */
    public String getPayChannel() {
        return payChannel;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.pay_channel
     * @param payChannel  the value for payment_check_view.pay_channel
     * @mbg.generated
     */
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.pay_channel_warning
     * @return  the value of payment_check_view.pay_channel_warning
     * @mbg.generated
     */
    public Long getPayChannelWarning() {
        return payChannelWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.pay_channel_warning
     * @param payChannelWarning  the value for payment_check_view.pay_channel_warning
     * @mbg.generated
     */
    public void setPayChannelWarning(Long payChannelWarning) {
        this.payChannelWarning = payChannelWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.recharge_status
     * @return  the value of payment_check_view.recharge_status
     * @mbg.generated
     */
    public Integer getRechargeStatus() {
        return rechargeStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.recharge_status
     * @param rechargeStatus  the value for payment_check_view.recharge_status
     * @mbg.generated
     */
    public void setRechargeStatus(Integer rechargeStatus) {
        this.rechargeStatus = rechargeStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.check_status
     * @return  the value of payment_check_view.check_status
     * @mbg.generated
     */
    public Integer getCheckStatus() {
        return checkStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.check_status
     * @param checkStatus  the value for payment_check_view.check_status
     * @mbg.generated
     */
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.status
     * @return  the value of payment_check_view.status
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.status
     * @param status  the value for payment_check_view.status
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.status_warning
     * @return  the value of payment_check_view.status_warning
     * @mbg.generated
     */
    public Long getStatusWarning() {
        return statusWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.status_warning
     * @param statusWarning  the value for payment_check_view.status_warning
     * @mbg.generated
     */
    public void setStatusWarning(Long statusWarning) {
        this.statusWarning = statusWarning;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.fee
     * @return  the value of payment_check_view.fee
     * @mbg.generated
     */
    public Double getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.fee
     * @param fee  the value for payment_check_view.fee
     * @mbg.generated
     */
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.refund_amount
     * @return  the value of payment_check_view.refund_amount
     * @mbg.generated
     */
    public Double getRefundAmount() {
        return refundAmount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.refund_amount
     * @param refundAmount  the value for payment_check_view.refund_amount
     * @mbg.generated
     */
    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.refund_status
     * @return  the value of payment_check_view.refund_status
     * @mbg.generated
     */
    public Integer getRefundStatus() {
        return refundStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.refund_status
     * @param refundStatus  the value for payment_check_view.refund_status
     * @mbg.generated
     */
    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.refund_fee
     * @return  the value of payment_check_view.refund_fee
     * @mbg.generated
     */
    public Double getRefundFee() {
        return refundFee;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.refund_fee
     * @param refundFee  the value for payment_check_view.refund_fee
     * @mbg.generated
     */
    public void setRefundFee(Double refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column payment_check_view.warning_tag
     * @return  the value of payment_check_view.warning_tag
     * @mbg.generated
     */
    public Long getWarningTag() {
        return warningTag;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column payment_check_view.warning_tag
     * @param warningTag  the value for payment_check_view.warning_tag
     * @mbg.generated
     */
    public void setWarningTag(Long warningTag) {
        this.warningTag = warningTag;
    }
}