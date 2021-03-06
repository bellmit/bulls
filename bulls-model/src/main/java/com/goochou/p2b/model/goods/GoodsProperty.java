package com.goochou.p2b.model.goods;

import java.util.Date;

public class GoodsProperty implements java.io.Serializable{
	private static final long serialVersionUID = -3990052563627623632L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property.id
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property.category_id
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property.property_name
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    private String propertyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property.create_date
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property.update_date
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property.id
     *
     * @return the value of t_goods_property.id
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property.id
     *
     * @param id the value for t_goods_property.id
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property.category_id
     *
     * @return the value of t_goods_property.category_id
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property.category_id
     *
     * @param categoryId the value for t_goods_property.category_id
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property.property_name
     *
     * @return the value of t_goods_property.property_name
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property.property_name
     *
     * @param propertyName the value for t_goods_property.property_name
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property.create_date
     *
     * @return the value of t_goods_property.create_date
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property.create_date
     *
     * @param createDate the value for t_goods_property.create_date
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property.update_date
     *
     * @return the value of t_goods_property.update_date
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property.update_date
     *
     * @param updateDate the value for t_goods_property.update_date
     *
     * @mbg.generated Wed May 15 16:25:20 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    
    //======================================自定义=======================================================
    
    /**
     * 属性对应的值
     */
    private GoodsPropertyValue goodsPropertyValue;

	public GoodsPropertyValue getGoodsPropertyValue() {
		return goodsPropertyValue;
	}

	public void setGoodsPropertyValue(GoodsPropertyValue goodsPropertyValue) {
		this.goodsPropertyValue = goodsPropertyValue;
	}
    
    
}