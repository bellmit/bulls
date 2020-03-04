package com.goochou.p2b.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

import com.goochou.p2b.constant.CouponTypeEnum;

public class CouponTemplate implements Serializable {

    private String status;  //优惠券状态 // 0未领取 1已领取 2已领完
    private String percent;
    private String daysRule;
    private String amountRule;
    private String rateStr;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.template_id
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private String templateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.title
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.type
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.amount
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.rate
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private BigDecimal rate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.min_amount
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Long minAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.min_days
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Integer minDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.effective_days
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Integer effectiveDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.stock_limit
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Integer stockLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.stock_balance
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Integer stockBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.create_time
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.update_time
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.version
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_template.is_deleted
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    private Integer isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.template_id
     *
     * @return the value of coupon_template.template_id
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.template_id
     *
     * @param templateId the value for coupon_template.template_id
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.title
     *
     * @return the value of coupon_template.title
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.title
     *
     * @param title the value for coupon_template.title
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.type
     *
     * @return the value of coupon_template.type
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Integer getType() {
        return type;
    }


    public String getTypeStr() {
        if (type != null) {
            return CouponTypeEnum.getValueByName(String.valueOf(type)).getDescription();
        }
        return "";
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.type
     *
     * @param type the value for coupon_template.type
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.amount
     *
     * @return the value of coupon_template.amount
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public String getAmountStr(){
    	if (amount != null) {
    		DecimalFormat df = new DecimalFormat();
	    	df.applyPattern("###.##");
	    	return df.format(amount);
		}
    	return "0";
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.amount
     *
     * @param amount the value for coupon_template.amount
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.rate
     *
     * @return the value of coupon_template.rate
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.rate
     *
     * @param rate the value for coupon_template.rate
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.min_amount
     *
     * @return the value of coupon_template.min_amount
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Long getMinAmount() {
        return minAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.min_amount
     *
     * @param minAmount the value for coupon_template.min_amount
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setMinAmount(Long minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.min_days
     *
     * @return the value of coupon_template.min_days
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Integer getMinDays() {
        return minDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.min_days
     *
     * @param minDays the value for coupon_template.min_days
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setMinDays(Integer minDays) {
        this.minDays = minDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.effective_days
     *
     * @return the value of coupon_template.effective_days
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Integer getEffectiveDays() {
        return effectiveDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.effective_days
     *
     * @param effectiveDays the value for coupon_template.effective_days
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.stock_limit
     *
     * @return the value of coupon_template.stock_limit
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Integer getStockLimit() {
        return stockLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.stock_limit
     *
     * @param stockLimit the value for coupon_template.stock_limit
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setStockLimit(Integer stockLimit) {
        this.stockLimit = stockLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.stock_balance
     *
     * @return the value of coupon_template.stock_balance
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Integer getStockBalance() {
        return stockBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.stock_balance
     *
     * @param stockBalance the value for coupon_template.stock_balance
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setStockBalance(Integer stockBalance) {
        this.stockBalance = stockBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.create_time
     *
     * @return the value of coupon_template.create_time
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.create_time
     *
     * @param createTime the value for coupon_template.create_time
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.update_time
     *
     * @return the value of coupon_template.update_time
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.update_time
     *
     * @param updateTime the value for coupon_template.update_time
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.version
     *
     * @return the value of coupon_template.version
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.version
     *
     * @param version the value for coupon_template.version
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_template.is_deleted
     *
     * @return the value of coupon_template.is_deleted
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_template.is_deleted
     *
     * @param isDeleted the value for coupon_template.is_deleted
     *
     * @mbggenerated Mon Jun 25 16:43:52 CST 2018
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CouponTemplate other = (CouponTemplate) that;
        return (this.getTemplateId() == null ? other.getTemplateId() == null : this.getTemplateId().equals(other.getTemplateId()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
                && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
                && (this.getMinAmount() == null ? other.getMinAmount() == null : this.getMinAmount().equals(other.getMinAmount()))
                && (this.getMinDays() == null ? other.getMinDays() == null : this.getMinDays().equals(other.getMinDays()))
                && (this.getEffectiveDays() == null ? other.getEffectiveDays() == null : this.getEffectiveDays().equals(other.getEffectiveDays()))
                && (this.getStockLimit() == null ? other.getStockLimit() == null : this.getStockLimit().equals(other.getStockLimit()))
                && (this.getStockBalance() == null ? other.getStockBalance() == null : this.getStockBalance().equals(other.getStockBalance()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
                && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getMinAmount() == null) ? 0 : getMinAmount().hashCode());
        result = prime * result + ((getMinDays() == null) ? 0 : getMinDays().hashCode());
        result = prime * result + ((getEffectiveDays() == null) ? 0 : getEffectiveDays().hashCode());
        result = prime * result + ((getStockLimit() == null) ? 0 : getStockLimit().hashCode());
        result = prime * result + ((getStockBalance() == null) ? 0 : getStockBalance().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_template
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", templateId=").append(templateId);
        sb.append(", title=").append(title);
        sb.append(", type=").append(type);
        sb.append(", amount=").append(amount);
        sb.append(", rate=").append(rate);
        sb.append(", minAmount=").append(minAmount);
        sb.append(", minDays=").append(minDays);
        sb.append(", effectiveDays=").append(effectiveDays);
        sb.append(", stockLimit=").append(stockLimit);
        sb.append(", stockBalance=").append(stockBalance);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", version=").append(version);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getDaysRule() {
        return daysRule;
    }

    public void setDaysRule(String daysRule) {
        this.daysRule = daysRule;
    }

    public String getAmountRule() {
        return amountRule;
    }

    public void setAmountRule(String amountRule) {
        this.amountRule = amountRule;
    }

    public String getRateStr() {
        return rateStr;
    }

    public void setRateStr(String rateStr) {
        this.rateStr = rateStr;
    }
}