package com.goochou.p2b.model;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.dividend_method
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Integer dividendMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.min_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Double minAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.max_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Double maxAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.increase_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Double increaseAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.support_hongbao
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Byte supportHongbao;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.support_rate_coupon
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Byte supportRateCoupon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.out_days
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Integer outDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.create_date
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.update_date
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.status
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.version
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.male_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Double malePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.female_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Double femalePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.feed_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Double feedPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.add_weight
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    private Double addWeight;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.dividend_method
     *
     * @return the value of product.dividend_method
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Integer getDividendMethod() {
        return dividendMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.dividend_method
     *
     * @param dividendMethod the value for product.dividend_method
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setDividendMethod(Integer dividendMethod) {
        this.dividendMethod = dividendMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.min_amount
     *
     * @return the value of product.min_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.min_amount
     *
     * @param minAmount the value for product.min_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.max_amount
     *
     * @return the value of product.max_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Double getMaxAmount() {
        return maxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.max_amount
     *
     * @param maxAmount the value for product.max_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.increase_amount
     *
     * @return the value of product.increase_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Double getIncreaseAmount() {
        return increaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.increase_amount
     *
     * @param increaseAmount the value for product.increase_amount
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setIncreaseAmount(Double increaseAmount) {
        this.increaseAmount = increaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.support_hongbao
     *
     * @return the value of product.support_hongbao
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Byte getSupportHongbao() {
        return supportHongbao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.support_hongbao
     *
     * @param supportHongbao the value for product.support_hongbao
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setSupportHongbao(Byte supportHongbao) {
        this.supportHongbao = supportHongbao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.support_rate_coupon
     *
     * @return the value of product.support_rate_coupon
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Byte getSupportRateCoupon() {
        return supportRateCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.support_rate_coupon
     *
     * @param supportRateCoupon the value for product.support_rate_coupon
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setSupportRateCoupon(Byte supportRateCoupon) {
        this.supportRateCoupon = supportRateCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.out_days
     *
     * @return the value of product.out_days
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Integer getOutDays() {
        return outDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.out_days
     *
     * @param outDays the value for product.out_days
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setOutDays(Integer outDays) {
        this.outDays = outDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.create_date
     *
     * @return the value of product.create_date
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.create_date
     *
     * @param createDate the value for product.create_date
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.update_date
     *
     * @return the value of product.update_date
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.update_date
     *
     * @param updateDate the value for product.update_date
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.status
     *
     * @return the value of product.status
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.status
     *
     * @param status the value for product.status
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.version
     *
     * @return the value of product.version
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.version
     *
     * @param version the value for product.version
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.male_price
     *
     * @return the value of product.male_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Double getMalePrice() {
        return malePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.male_price
     *
     * @param malePrice the value for product.male_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setMalePrice(Double malePrice) {
        this.malePrice = malePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.female_price
     *
     * @return the value of product.female_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Double getFemalePrice() {
        return femalePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.female_price
     *
     * @param femalePrice the value for product.female_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setFemalePrice(Double femalePrice) {
        this.femalePrice = femalePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.feed_price
     *
     * @return the value of product.feed_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Double getFeedPrice() {
        return feedPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.feed_price
     *
     * @param feedPrice the value for product.feed_price
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setFeedPrice(Double feedPrice) {
        this.feedPrice = feedPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.add_weight
     *
     * @return the value of product.add_weight
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public Double getAddWeight() {
        return addWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.add_weight
     *
     * @param addWeight the value for product.add_weight
     *
     * @mbggenerated Wed Jun 05 13:06:20 CST 2019
     */
    public void setAddWeight(Double addWeight) {
        this.addWeight = addWeight;
    }
}