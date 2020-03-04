package com.goochou.p2b.model.vo;

import java.io.Serializable;
import java.util.Date;

public class ChannelUserVO implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.idx
     *
     * @mbggenerated
     */
    private Long idx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.channel_id
     *
     * @mbggenerated
     */
    private String channelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.is_deleted
     *
     * @mbggenerated
     */
    private Integer isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.operate_id
     *
     * @mbggenerated
     */
    private String operateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.operate_name
     *
     * @mbggenerated
     */
    private String operateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_channel_user.update_date
     *
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;
    
    
    private String customerId;
    
    
    /**
     * 角色, sign : 签署, audit: 审核
     */
    private String role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.idx
     *
     * @return the value of ts_channel_user.idx
     *
     * @mbggenerated
     */
    public Long getIdx() {
        return idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.idx
     *
     * @param idx the value for ts_channel_user.idx
     *
     * @mbggenerated
     */
    public void setIdx(Long idx) {
        this.idx = idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.id
     *
     * @return the value of ts_channel_user.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.id
     *
     * @param id the value for ts_channel_user.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.channel_id
     *
     * @return the value of ts_channel_user.channel_id
     *
     * @mbggenerated
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.channel_id
     *
     * @param channelId the value for ts_channel_user.channel_id
     *
     * @mbggenerated
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.phone
     *
     * @return the value of ts_channel_user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.phone
     *
     * @param phone the value for ts_channel_user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.password
     *
     * @return the value of ts_channel_user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.password
     *
     * @param password the value for ts_channel_user.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.is_deleted
     *
     * @return the value of ts_channel_user.is_deleted
     *
     * @mbggenerated
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.is_deleted
     *
     * @param isDeleted the value for ts_channel_user.is_deleted
     *
     * @mbggenerated
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.operate_id
     *
     * @return the value of ts_channel_user.operate_id
     *
     * @mbggenerated
     */
    public String getOperateId() {
        return operateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.operate_id
     *
     * @param operateId the value for ts_channel_user.operate_id
     *
     * @mbggenerated
     */
    public void setOperateId(String operateId) {
        this.operateId = operateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.operate_name
     *
     * @return the value of ts_channel_user.operate_name
     *
     * @mbggenerated
     */
    public String getOperateName() {
        return operateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.operate_name
     *
     * @param operateName the value for ts_channel_user.operate_name
     *
     * @mbggenerated
     */
    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.create_date
     *
     * @return the value of ts_channel_user.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.create_date
     *
     * @param createDate the value for ts_channel_user.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_channel_user.update_date
     *
     * @return the value of ts_channel_user.update_date
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_channel_user.update_date
     *
     * @param updateDate the value for ts_channel_user.update_date
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
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
        ChannelUserVO other = (ChannelUserVO) that;
        return (this.getIdx() == null ? other.getIdx() == null : this.getIdx().equals(other.getIdx()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getOperateId() == null ? other.getOperateId() == null : this.getOperateId().equals(other.getOperateId()))
            && (this.getOperateName() == null ? other.getOperateName() == null : this.getOperateName().equals(other.getOperateName()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdx() == null) ? 0 : getIdx().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getOperateId() == null) ? 0 : getOperateId().hashCode());
        result = prime * result + ((getOperateName() == null) ? 0 : getOperateName().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }

    @Override
	public String toString() {
		return "ChannelUserVO [idx=" + idx + ", id=" + id + ", channelId="
				+ channelId + ", phone=" + phone + ", password=" + password
				+ ", isDeleted=" + isDeleted + ", operateId=" + operateId
				+ ", operateName=" + operateName + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", customerId=" + customerId
				+ ", role=" + role + "]";
	}
}