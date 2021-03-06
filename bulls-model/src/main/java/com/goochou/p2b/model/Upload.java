package com.goochou.p2b.model;

import java.util.Date;

import com.goochou.p2b.constant.client.ClientConstants;

public class Upload implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5198411299796462023L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upload.id
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upload.name
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upload.path
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    private String path;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upload.status
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upload.create_time
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upload.create_user
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upload.delete_time
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    private Date deleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upload.delete_user
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    private Integer deleteUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upload.id
     *
     * @return the value of upload.id
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upload.id
     *
     * @param id the value for upload.id
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upload.name
     *
     * @return the value of upload.name
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upload.name
     *
     * @param name the value for upload.name
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upload.path
     *
     * @return the value of upload.path
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upload.path
     *
     * @param path the value for upload.path
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public void setPath(String path) {
        this.path = path;
        //自定义
        this.cdnPath=picUrl+path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upload.status
     *
     * @return the value of upload.status
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upload.status
     *
     * @param status the value for upload.status
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upload.create_time
     *
     * @return the value of upload.create_time
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upload.create_time
     *
     * @param createTime the value for upload.create_time
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upload.create_user
     *
     * @return the value of upload.create_user
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upload.create_user
     *
     * @param createUser the value for upload.create_user
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upload.delete_time
     *
     * @return the value of upload.delete_time
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upload.delete_time
     *
     * @param deleteTime the value for upload.delete_time
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upload.delete_user
     *
     * @return the value of upload.delete_user
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public Integer getDeleteUser() {
        return deleteUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upload.delete_user
     *
     * @param deleteUser the value for upload.delete_user
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    public void setDeleteUser(Integer deleteUser) {
        this.deleteUser = deleteUser;
    }
    
    private final static String picUrl = ClientConstants.ALIBABA_PATH + "upload/";
    
	/**
	 * 图片真实完整路径
	 */
	private String cdnPath;
    
	public String getCdnPath() {
		return picUrl+path;
	}

}