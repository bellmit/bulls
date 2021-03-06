package com.goochou.p2b.model;

import java.util.Date;

public class Feedback {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.user_id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.content
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.create_time
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.reply_time
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    private Date replyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.reply_user
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    private Integer replyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.reply_message_id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    private Integer replyMessageId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.id
     *
     * @return the value of feedback.id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.id
     *
     * @param id the value for feedback.id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.user_id
     *
     * @return the value of feedback.user_id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.user_id
     *
     * @param userId the value for feedback.user_id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.content
     *
     * @return the value of feedback.content
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.content
     *
     * @param content the value for feedback.content
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.create_time
     *
     * @return the value of feedback.create_time
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.create_time
     *
     * @param createTime the value for feedback.create_time
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.reply_time
     *
     * @return the value of feedback.reply_time
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public Date getReplyTime() {
        return replyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.reply_time
     *
     * @param replyTime the value for feedback.reply_time
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.reply_user
     *
     * @return the value of feedback.reply_user
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public Integer getReplyUser() {
        return replyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.reply_user
     *
     * @param replyUser the value for feedback.reply_user
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public void setReplyUser(Integer replyUser) {
        this.replyUser = replyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.reply_message_id
     *
     * @return the value of feedback.reply_message_id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public Integer getReplyMessageId() {
        return replyMessageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.reply_message_id
     *
     * @param replyMessageId the value for feedback.reply_message_id
     *
     * @mbggenerated Tue Oct 27 10:21:44 CST 2015
     */
    public void setReplyMessageId(Integer replyMessageId) {
        this.replyMessageId = replyMessageId;
    }
}