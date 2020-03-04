package com.goochou.p2b.dao;

import com.goochou.p2b.model.LotteryGift;
import com.goochou.p2b.model.LotteryGiftExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LotteryGiftMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int countByExample(LotteryGiftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int deleteByExample(LotteryGiftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int insert(LotteryGift record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int insertSelective(LotteryGift record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    List<LotteryGift> selectByExample(LotteryGiftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    LotteryGift selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int updateByExampleSelective(@Param("record") LotteryGift record, @Param("example") LotteryGiftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int updateByExample(@Param("record") LotteryGift record, @Param("example") LotteryGiftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int updateByPrimaryKeySelective(LotteryGift record);

    int updateByPrimaryKeySelectiveAndVersion(LotteryGift record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lottery_gift
     *
     * @mbggenerated Wed Apr 20 18:31:32 CST 2016
     */
    int updateByPrimaryKey(LotteryGift record);

    /**
     * 获取活动对应的奖品
     *
     * @param
     * @author 刘源
     * @date 2016/4/21
     */
    List<LotteryGift> getActivityGiftItems(@Param("activityId") Integer activityId);

    /**
     * 全民理财福布斯领奖活动，获取用户可以领奖奖品列表
     *
     * @param map
     * @author 刘源
     * @date 2016/5/6
     */
    List<LotteryGift> queryGiftOnActivity(Map<String, Object> map);

    /**
     * 获取活动对应的奖品
     *
     * @param activityId
     * @return
     */
    List<LotteryGift> getActivityLeftGiftItems(@Param("activityId") Integer activityId, @Param("type") Integer type);

    /**
     * 根据主键id和版本号查询奖品剩余数量
     * @param id 主键id
     * @param version 版本号
     * @return 剩余奖品数量
     */
    int findLeftNumByIdAndVersion(@Param("id") int id, @Param("version") int version);

    /**
     * 根据主键id和版本号扣减剩余数量
     * @param id 主键id
     * @param version 版本号
     * @return int
     */
    int updateByIdAndVersion(@Param("id") int id, @Param("version") int version);

}