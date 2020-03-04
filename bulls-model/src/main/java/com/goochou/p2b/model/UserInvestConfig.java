package com.goochou.p2b.model;

import java.io.Serializable;
import java.util.Date;

public class UserInvestConfig implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.project_type
     *
     * @mbggenerated
     */
    private Integer projectType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.max_amount
     *
     * @mbggenerated
     */
    private Double maxAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.need_invest_amount
     *
     * @mbggenerated
     */
    private Double needInvestAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.invest_amount
     *
     * @mbggenerated
     */
    private Double investAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.limit_days
     *
     * @mbggenerated
     */
    private Integer limitDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.hb_amount
     *
     * @mbggenerated
     */
    private Double hbAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.cannel_config
     *
     * @mbggenerated
     */
    private Integer cannelConfig;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_invest_config.version
     *
     * @mbggenerated
     */
    private Integer version;
    
    private Double annualized;

    public Double getAnnualized() {
		return annualized;
	}

	public void setAnnualized(Double annualized) {
		this.annualized = annualized;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_invest_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.id
     *
     * @return the value of user_invest_config.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.id
     *
     * @param id the value for user_invest_config.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.user_id
     *
     * @return the value of user_invest_config.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.user_id
     *
     * @param userId the value for user_invest_config.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.project_type
     *
     * @return the value of user_invest_config.project_type
     *
     * @mbggenerated
     */
    public Integer getProjectType() {
        return projectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.project_type
     *
     * @param projectType the value for user_invest_config.project_type
     *
     * @mbggenerated
     */
    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.max_amount
     *
     * @return the value of user_invest_config.max_amount
     *
     * @mbggenerated
     */
    public Double getMaxAmount() {
        return maxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.max_amount
     *
     * @param maxAmount the value for user_invest_config.max_amount
     *
     * @mbggenerated
     */
    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.need_invest_amount
     *
     * @return the value of user_invest_config.need_invest_amount
     *
     * @mbggenerated
     */
    public Double getNeedInvestAmount() {
        return needInvestAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.need_invest_amount
     *
     * @param needInvestAmount the value for user_invest_config.need_invest_amount
     *
     * @mbggenerated
     */
    public void setNeedInvestAmount(Double needInvestAmount) {
        this.needInvestAmount = needInvestAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.invest_amount
     *
     * @return the value of user_invest_config.invest_amount
     *
     * @mbggenerated
     */
    public Double getInvestAmount() {
        return investAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.invest_amount
     *
     * @param investAmount the value for user_invest_config.invest_amount
     *
     * @mbggenerated
     */
    public void setInvestAmount(Double investAmount) {
        this.investAmount = investAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.limit_days
     *
     * @return the value of user_invest_config.limit_days
     *
     * @mbggenerated
     */
    public Integer getLimitDays() {
        return limitDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.limit_days
     *
     * @param limitDays the value for user_invest_config.limit_days
     *
     * @mbggenerated
     */
    public void setLimitDays(Integer limitDays) {
        this.limitDays = limitDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.hb_amount
     *
     * @return the value of user_invest_config.hb_amount
     *
     * @mbggenerated
     */
    public Double getHbAmount() {
        return hbAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.hb_amount
     *
     * @param hbAmount the value for user_invest_config.hb_amount
     *
     * @mbggenerated
     */
    public void setHbAmount(Double hbAmount) {
        this.hbAmount = hbAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.status
     *
     * @return the value of user_invest_config.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.status
     *
     * @param status the value for user_invest_config.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.create_time
     *
     * @return the value of user_invest_config.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.create_time
     *
     * @param createTime the value for user_invest_config.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.update_time
     *
     * @return the value of user_invest_config.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.update_time
     *
     * @param updateTime the value for user_invest_config.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.cannel_config
     *
     * @return the value of user_invest_config.cannel_config
     *
     * @mbggenerated
     */
    public Integer getCannelConfig() {
        return cannelConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.cannel_config
     *
     * @param cannelConfig the value for user_invest_config.cannel_config
     *
     * @mbggenerated
     */
    public void setCannelConfig(Integer cannelConfig) {
        this.cannelConfig = cannelConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_invest_config.version
     *
     * @return the value of user_invest_config.version
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_invest_config.version
     *
     * @param version the value for user_invest_config.version
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_invest_config
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
        UserInvestConfig other = (UserInvestConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProjectType() == null ? other.getProjectType() == null : this.getProjectType().equals(other.getProjectType()))
            && (this.getMaxAmount() == null ? other.getMaxAmount() == null : this.getMaxAmount().equals(other.getMaxAmount()))
            && (this.getNeedInvestAmount() == null ? other.getNeedInvestAmount() == null : this.getNeedInvestAmount().equals(other.getNeedInvestAmount()))
            && (this.getInvestAmount() == null ? other.getInvestAmount() == null : this.getInvestAmount().equals(other.getInvestAmount()))
            && (this.getLimitDays() == null ? other.getLimitDays() == null : this.getLimitDays().equals(other.getLimitDays()))
            && (this.getHbAmount() == null ? other.getHbAmount() == null : this.getHbAmount().equals(other.getHbAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCannelConfig() == null ? other.getCannelConfig() == null : this.getCannelConfig().equals(other.getCannelConfig()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_invest_config
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getProjectType() == null) ? 0 : getProjectType().hashCode());
        result = prime * result + ((getMaxAmount() == null) ? 0 : getMaxAmount().hashCode());
        result = prime * result + ((getNeedInvestAmount() == null) ? 0 : getNeedInvestAmount().hashCode());
        result = prime * result + ((getInvestAmount() == null) ? 0 : getInvestAmount().hashCode());
        result = prime * result + ((getLimitDays() == null) ? 0 : getLimitDays().hashCode());
        result = prime * result + ((getHbAmount() == null) ? 0 : getHbAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCannelConfig() == null) ? 0 : getCannelConfig().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_invest_config
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
        sb.append(", userId=").append(userId);
        sb.append(", projectType=").append(projectType);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", needInvestAmount=").append(needInvestAmount);
        sb.append(", investAmount=").append(investAmount);
        sb.append(", limitDays=").append(limitDays);
        sb.append(", hbAmount=").append(hbAmount);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", cannelConfig=").append(cannelConfig);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}