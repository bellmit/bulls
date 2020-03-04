package com.goochou.p2b.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VipDividend implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.user_id
	 * @mbg.generated
	 */
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.dividend_date
	 * @mbg.generated
	 */
	private Date dividendDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.real_dividend_date
	 * @mbg.generated
	 */
	private Date realDividendDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.dividend_amount
	 * @mbg.generated
	 */
	private BigDecimal dividendAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.dividend_scale
	 * @mbg.generated
	 */
	private BigDecimal dividendScale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.credit_amount
	 * @mbg.generated
	 */
	private BigDecimal creditAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.is_dividend
	 * @mbg.generated
	 */
	private Boolean isDividend;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_vip_dividend.create_date
	 * @mbg.generated
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_vip_dividend
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.id
	 * @return  the value of t_vip_dividend.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.id
	 * @param id  the value for t_vip_dividend.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.user_id
	 * @return  the value of t_vip_dividend.user_id
	 * @mbg.generated
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.user_id
	 * @param userId  the value for t_vip_dividend.user_id
	 * @mbg.generated
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.dividend_date
	 * @return  the value of t_vip_dividend.dividend_date
	 * @mbg.generated
	 */
	public Date getDividendDate() {
		return dividendDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.dividend_date
	 * @param dividendDate  the value for t_vip_dividend.dividend_date
	 * @mbg.generated
	 */
	public void setDividendDate(Date dividendDate) {
		this.dividendDate = dividendDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.real_dividend_date
	 * @return  the value of t_vip_dividend.real_dividend_date
	 * @mbg.generated
	 */
	public Date getRealDividendDate() {
		return realDividendDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.real_dividend_date
	 * @param realDividendDate  the value for t_vip_dividend.real_dividend_date
	 * @mbg.generated
	 */
	public void setRealDividendDate(Date realDividendDate) {
		this.realDividendDate = realDividendDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.dividend_amount
	 * @return  the value of t_vip_dividend.dividend_amount
	 * @mbg.generated
	 */
	public BigDecimal getDividendAmount() {
		return dividendAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.dividend_amount
	 * @param dividendAmount  the value for t_vip_dividend.dividend_amount
	 * @mbg.generated
	 */
	public void setDividendAmount(BigDecimal dividendAmount) {
		this.dividendAmount = dividendAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.dividend_scale
	 * @return  the value of t_vip_dividend.dividend_scale
	 * @mbg.generated
	 */
	public BigDecimal getDividendScale() {
		return dividendScale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.dividend_scale
	 * @param dividendScale  the value for t_vip_dividend.dividend_scale
	 * @mbg.generated
	 */
	public void setDividendScale(BigDecimal dividendScale) {
		this.dividendScale = dividendScale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.credit_amount
	 * @return  the value of t_vip_dividend.credit_amount
	 * @mbg.generated
	 */
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.credit_amount
	 * @param creditAmount  the value for t_vip_dividend.credit_amount
	 * @mbg.generated
	 */
	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.is_dividend
	 * @return  the value of t_vip_dividend.is_dividend
	 * @mbg.generated
	 */
	public Boolean getIsDividend() {
		return isDividend;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.is_dividend
	 * @param isDividend  the value for t_vip_dividend.is_dividend
	 * @mbg.generated
	 */
	public void setIsDividend(Boolean isDividend) {
		this.isDividend = isDividend;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_vip_dividend.create_date
	 * @return  the value of t_vip_dividend.create_date
	 * @mbg.generated
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_vip_dividend.create_date
	 * @param createDate  the value for t_vip_dividend.create_date
	 * @mbg.generated
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}