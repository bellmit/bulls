package com.goochou.p2b.model;

import java.io.Serializable;
import java.util.Date;

public class UserSignConfig implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.is_invested
     *
     * @mbggenerated
     */
    private Integer isInvested;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.normal_prize
     *
     * @mbggenerated
     */
    private String normalPrize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.activity_prize
     *
     * @mbggenerated
     */
    private String activityPrize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.combo_prize
     *
     * @mbggenerated
     */
    private String comboPrize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.is_deleted
     *
     * @mbggenerated
     */
    private Integer isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sign_config.update_date
     *
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_sign_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.id
     *
     * @return the value of user_sign_config.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.id
     *
     * @param id the value for user_sign_config.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.start_time
     *
     * @return the value of user_sign_config.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.start_time
     *
     * @param startTime the value for user_sign_config.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.end_time
     *
     * @return the value of user_sign_config.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.end_time
     *
     * @param endTime the value for user_sign_config.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.is_invested
     *
     * @return the value of user_sign_config.is_invested
     *
     * @mbggenerated
     */
    public Integer getIsInvested() {
        return isInvested;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.is_invested
     *
     * @param isInvested the value for user_sign_config.is_invested
     *
     * @mbggenerated
     */
    public void setIsInvested(Integer isInvested) {
        this.isInvested = isInvested;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.normal_prize
     *
     * @return the value of user_sign_config.normal_prize
     *
     * @mbggenerated
     */
    public String getNormalPrize() {
        return normalPrize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.normal_prize
     *
     * @param normalPrize the value for user_sign_config.normal_prize
     *
     * @mbggenerated
     */
    public void setNormalPrize(String normalPrize) {
        this.normalPrize = normalPrize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.activity_prize
     *
     * @return the value of user_sign_config.activity_prize
     *
     * @mbggenerated
     */
    public String getActivityPrize() {
        return activityPrize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.activity_prize
     *
     * @param activityPrize the value for user_sign_config.activity_prize
     *
     * @mbggenerated
     */
    public void setActivityPrize(String activityPrize) {
        this.activityPrize = activityPrize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.combo_prize
     *
     * @return the value of user_sign_config.combo_prize
     *
     * @mbggenerated
     */
    public String getComboPrize() {
        return comboPrize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.combo_prize
     *
     * @param comboPrize the value for user_sign_config.combo_prize
     *
     * @mbggenerated
     */
    public void setComboPrize(String comboPrize) {
        this.comboPrize = comboPrize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.is_deleted
     *
     * @return the value of user_sign_config.is_deleted
     *
     * @mbggenerated
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.is_deleted
     *
     * @param isDeleted the value for user_sign_config.is_deleted
     *
     * @mbggenerated
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.create_date
     *
     * @return the value of user_sign_config.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.create_date
     *
     * @param createDate the value for user_sign_config.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sign_config.update_date
     *
     * @return the value of user_sign_config.update_date
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sign_config.update_date
     *
     * @param updateDate the value for user_sign_config.update_date
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_config
     *
     * @mbggenerated
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
        UserSignConfig other = (UserSignConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getIsInvested() == null ? other.getIsInvested() == null : this.getIsInvested().equals(other.getIsInvested()))
            && (this.getNormalPrize() == null ? other.getNormalPrize() == null : this.getNormalPrize().equals(other.getNormalPrize()))
            && (this.getActivityPrize() == null ? other.getActivityPrize() == null : this.getActivityPrize().equals(other.getActivityPrize()))
            && (this.getComboPrize() == null ? other.getComboPrize() == null : this.getComboPrize().equals(other.getComboPrize()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_config
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getIsInvested() == null) ? 0 : getIsInvested().hashCode());
        result = prime * result + ((getNormalPrize() == null) ? 0 : getNormalPrize().hashCode());
        result = prime * result + ((getActivityPrize() == null) ? 0 : getActivityPrize().hashCode());
        result = prime * result + ((getComboPrize() == null) ? 0 : getComboPrize().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_config
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", isInvested=").append(isInvested);
        sb.append(", normalPrize=").append(normalPrize);
        sb.append(", activityPrize=").append(activityPrize);
        sb.append(", comboPrize=").append(comboPrize);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}