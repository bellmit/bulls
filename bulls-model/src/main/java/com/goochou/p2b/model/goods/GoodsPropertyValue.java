package com.goochou.p2b.model.goods;

import java.util.Date;

public class GoodsPropertyValue {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property_value.id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property_value.property_id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    private Integer propertyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property_value.goods_id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property_value.property_value
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    private String propertyValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property_value.create_date
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_property_value.update_date
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property_value.id
     *
     * @return the value of t_goods_property_value.id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property_value.id
     *
     * @param id the value for t_goods_property_value.id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property_value.property_id
     *
     * @return the value of t_goods_property_value.property_id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property_value.property_id
     *
     * @param propertyId the value for t_goods_property_value.property_id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property_value.goods_id
     *
     * @return the value of t_goods_property_value.goods_id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property_value.goods_id
     *
     * @param goodsId the value for t_goods_property_value.goods_id
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property_value.property_value
     *
     * @return the value of t_goods_property_value.property_value
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property_value.property_value
     *
     * @param propertyValue the value for t_goods_property_value.property_value
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property_value.create_date
     *
     * @return the value of t_goods_property_value.create_date
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property_value.create_date
     *
     * @param createDate the value for t_goods_property_value.create_date
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_property_value.update_date
     *
     * @return the value of t_goods_property_value.update_date
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_property_value.update_date
     *
     * @param updateDate the value for t_goods_property_value.update_date
     *
     * @mbg.generated Fri May 24 10:02:34 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    
    //---------------------------------------自定义-----------------------------------------------------------
    
    /**
     * 商品
     */
	private Goods goods;

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	// 属性
	private GoodsProperty goodsProperty;

	public GoodsProperty getGoodsProperty() {
		return goodsProperty;
	}

	public void setGoodsProperty(GoodsProperty goodsProperty) {
		this.goodsProperty = goodsProperty;
	}
    
    
}