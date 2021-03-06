package com.goochou.p2b.model;

import java.util.Date;

public class GoodsPicture implements java.io.Serializable{
	private static final long serialVersionUID = -3653745573272710700L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_picture.id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_picture.goods_id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_picture.type
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_picture.name
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_picture.upload_id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    private Integer uploadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_picture.create_date
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_picture.status
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_picture.id
     *
     * @return the value of t_goods_picture.id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_picture.id
     *
     * @param id the value for t_goods_picture.id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_picture.goods_id
     *
     * @return the value of t_goods_picture.goods_id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_picture.goods_id
     *
     * @param goodsId the value for t_goods_picture.goods_id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_picture.type
     *
     * @return the value of t_goods_picture.type
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_picture.type
     *
     * @param type the value for t_goods_picture.type
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_picture.name
     *
     * @return the value of t_goods_picture.name
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_picture.name
     *
     * @param name the value for t_goods_picture.name
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_picture.upload_id
     *
     * @return the value of t_goods_picture.upload_id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public Integer getUploadId() {
        return uploadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_picture.upload_id
     *
     * @param uploadId the value for t_goods_picture.upload_id
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_picture.create_date
     *
     * @return the value of t_goods_picture.create_date
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_picture.create_date
     *
     * @param createDate the value for t_goods_picture.create_date
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_picture.status
     *
     * @return the value of t_goods_picture.status
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_picture.status
     *
     * @param status the value for t_goods_picture.status
     *
     * @mbg.generated Wed May 15 10:24:35 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    ///////////////////////////////////
    
    
    
    // -------
    private String picturePath; // 图片路径地址

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
    
    private Upload upload;

	public Upload getUpload() {
		return upload;
	}

	public void setUpload(Upload upload) {
		this.upload = upload;
	}

	@Override
	public String toString() {
		return "GoodsPicture [id=" + id + ", goodsId=" + goodsId + ", type=" + type + ", name=" + name + ", uploadId="
				+ uploadId + ", createDate=" + createDate + ", status=" + status + ", picturePath=" + picturePath
				+ ", upload=" + upload + "]";
	}

	
}