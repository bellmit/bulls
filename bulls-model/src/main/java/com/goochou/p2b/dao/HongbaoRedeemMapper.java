package com.goochou.p2b.dao;

import com.goochou.p2b.model.HongbaoRedeem;
import com.goochou.p2b.model.HongbaoRedeemExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface HongbaoRedeemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int countByExample(HongbaoRedeemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int deleteByExample(HongbaoRedeemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int insert(HongbaoRedeem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int insertSelective(HongbaoRedeem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    List<HongbaoRedeem> selectByExample(HongbaoRedeemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    HongbaoRedeem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int updateByExampleSelective(@Param("record") HongbaoRedeem record, @Param("example") HongbaoRedeemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int updateByExample(@Param("record") HongbaoRedeem record, @Param("example") HongbaoRedeemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int updateByPrimaryKeySelective(HongbaoRedeem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hongbao_redeem
     *
     * @mbggenerated Mon Jun 27 11:50:37 CST 2016
     */
    int updateByPrimaryKey(HongbaoRedeem record);


    List<Map<String,Object>> query(Map<String, Object> map);

    Integer queryCount(Map<String, Object> map);

    HongbaoRedeem queryUserUse(Map<String, Object> map);

    HongbaoRedeem queryRedeemCode(@Param("redeemCode") String redeemCode);

    Integer queryByRedeemCodeUse(@Param("redeemId")Integer redeemId);

    /**
     * @Description(描述):查询兑换码对应的红包模版，和个数
     * @author 王信
     * @date 2016/6/27
     * @params
     **/
    List<Map<String,Object>> queryRedeemCodeHongbaoList(@Param("redeemId")Integer redeemId);

}