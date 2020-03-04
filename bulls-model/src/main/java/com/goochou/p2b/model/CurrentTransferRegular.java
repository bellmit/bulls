package com.goochou.p2b.model;

import java.io.Serializable;
import java.util.Date;
import com.goochou.p2b.utils.MoneyUtil;

public class CurrentTransferRegular implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column current_transfer_regular_activity.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column current_transfer_regular_activity.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column current_transfer_regular_activity.amount
     *
     * @mbg.generated
     */
    private Double amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column current_transfer_regular_activity.invest_amount
     *
     * @mbg.generated
     */
    private Double investAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column current_transfer_regular_activity.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column current_transfer_regular_activity.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table current_transfer_regular_activity
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column current_transfer_regular_activity.id
     *
     * @return the value of current_transfer_regular_activity.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column current_transfer_regular_activity.id
     *
     * @param id the value for current_transfer_regular_activity.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column current_transfer_regular_activity.user_id
     *
     * @return the value of current_transfer_regular_activity.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column current_transfer_regular_activity.user_id
     *
     * @param userId the value for current_transfer_regular_activity.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column current_transfer_regular_activity.amount
     *
     * @return the value of current_transfer_regular_activity.amount
     *
     * @mbg.generated
     */
    public Double getAmount() {
        return amount;
    }
    
    public double getBalance(){
    	return MoneyUtil.sub(amount, investAmount);
    }
    
    /**
     * 
     * <p>可投余额</p> 
     * @return
     * @author: lxfeng  
     * @date: Created on 2018-4-24 下午7:20:51
     */
    public String getBalanceStr(){
    	if (amount != null && investAmount != null) {
    		return MoneyUtil.insertComma(String.valueOf(getBalance()));
		}
    	return "0.00";
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column current_transfer_regular_activity.amount
     *
     * @param amount the value for current_transfer_regular_activity.amount
     *
     * @mbg.generated
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column current_transfer_regular_activity.invest_amount
     *
     * @return the value of current_transfer_regular_activity.invest_amount
     *
     * @mbg.generated
     */
    public Double getInvestAmount() {
        return investAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column current_transfer_regular_activity.invest_amount
     *
     * @param investAmount the value for current_transfer_regular_activity.invest_amount
     *
     * @mbg.generated
     */
    public void setInvestAmount(Double investAmount) {
        this.investAmount = investAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column current_transfer_regular_activity.update_date
     *
     * @return the value of current_transfer_regular_activity.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column current_transfer_regular_activity.update_date
     *
     * @param updateDate the value for current_transfer_regular_activity.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column current_transfer_regular_activity.version
     *
     * @return the value of current_transfer_regular_activity.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column current_transfer_regular_activity.version
     *
     * @param version the value for current_transfer_regular_activity.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table current_transfer_regular_activity
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
        CurrentTransferRegular other = (CurrentTransferRegular) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getInvestAmount() == null ? other.getInvestAmount() == null : this.getInvestAmount().equals(other.getInvestAmount()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table current_transfer_regular_activity
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getInvestAmount() == null) ? 0 : getInvestAmount().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table current_transfer_regular_activity
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", amount=").append(amount);
        sb.append(", investAmount=").append(investAmount);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}