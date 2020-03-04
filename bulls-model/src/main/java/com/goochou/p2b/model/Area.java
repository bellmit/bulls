package com.goochou.p2b.model;

import java.io.Serializable;
import java.util.Date;

public class Area implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.parent_code
     *
     * @mbg.generated
     */
    private String parentCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.source_code
     *
     * @mbg.generated
     */
    private String sourceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_area
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.id
     *
     * @return the value of t_area.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.id
     *
     * @param id the value for t_area.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.code
     *
     * @return the value of t_area.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.code
     *
     * @param code the value for t_area.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.name
     *
     * @return the value of t_area.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.name
     *
     * @param name the value for t_area.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.state
     *
     * @return the value of t_area.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.state
     *
     * @param state the value for t_area.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.create_time
     *
     * @return the value of t_area.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.create_time
     *
     * @param createTime the value for t_area.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.update_time
     *
     * @return the value of t_area.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.update_time
     *
     * @param updateTime the value for t_area.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.parent_code
     *
     * @return the value of t_area.parent_code
     *
     * @mbg.generated
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.parent_code
     *
     * @param parentCode the value for t_area.parent_code
     *
     * @mbg.generated
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.source_code
     *
     * @return the value of t_area.source_code
     *
     * @mbg.generated
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.source_code
     *
     * @param sourceCode the value for t_area.source_code
     *
     * @mbg.generated
     */
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }
}