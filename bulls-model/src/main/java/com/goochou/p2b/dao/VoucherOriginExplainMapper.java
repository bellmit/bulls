package com.goochou.p2b.dao;

import com.goochou.p2b.model.VoucherOriginExplain;
import com.goochou.p2b.model.VoucherOriginExplainExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VoucherOriginExplainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int countByExample(VoucherOriginExplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int deleteByExample(VoucherOriginExplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int insert(VoucherOriginExplain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int insertSelective(VoucherOriginExplain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    List<VoucherOriginExplain> selectByExample(VoucherOriginExplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    VoucherOriginExplain selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int updateByExampleSelective(@Param("record") VoucherOriginExplain record, @Param("example") VoucherOriginExplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int updateByExample(@Param("record") VoucherOriginExplain record, @Param("example") VoucherOriginExplainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int updateByPrimaryKeySelective(VoucherOriginExplain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher_origin_explain
     *
     * @mbggenerated Fri Feb 26 10:54:16 CST 2016
     */
    int updateByPrimaryKey(VoucherOriginExplain record);

    /**
     * 根据title查询福利来源
     * @author 刘源
     * @date 2016年3月3日
     * @parameter  
     * @return
     */
	public VoucherOriginExplain queryByTitle(String string);
}