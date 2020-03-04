package com.goochou.p2b.model;

import java.util.Date;

public class ProjectAward {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_award.id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_award.user_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_award.project_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_award.award_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    private Integer awardId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_award.time
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_award.id
     *
     * @return the value of project_award.id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_award.id
     *
     * @param id the value for project_award.id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_award.user_id
     *
     * @return the value of project_award.user_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_award.user_id
     *
     * @param userId the value for project_award.user_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_award.project_id
     *
     * @return the value of project_award.project_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_award.project_id
     *
     * @param projectId the value for project_award.project_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_award.award_id
     *
     * @return the value of project_award.award_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public Integer getAwardId() {
        return awardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_award.award_id
     *
     * @param awardId the value for project_award.award_id
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_award.time
     *
     * @return the value of project_award.time
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_award.time
     *
     * @param time the value for project_award.time
     *
     * @mbggenerated Wed Mar 25 20:03:07 CST 2015
     */
    public void setTime(Date time) {
        this.time = time;
    }
}