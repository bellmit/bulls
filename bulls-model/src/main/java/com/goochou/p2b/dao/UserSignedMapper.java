package com.goochou.p2b.dao;

import com.goochou.p2b.model.UserSigned;
import com.goochou.p2b.model.UserSignedExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserSignedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int countByExample(UserSignedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int deleteByExample(UserSignedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int insert(UserSigned record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int insertSelective(UserSigned record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    List<UserSigned> selectByExample(UserSignedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    UserSigned selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserSigned record, @Param("example") UserSignedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int updateByExample(@Param("record") UserSigned record, @Param("example") UserSignedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int updateByPrimaryKeySelective(UserSigned record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_signed
     *
     * @mbggenerated Fri May 10 15:01:47 CST 2019
     */
    int updateByPrimaryKey(UserSigned record);

    /**
     * @param userId
     * @param date
     * @return
     * @Title: UserSignedMapper.java
     * @Package com.goochou.p2b.dao
     * @Description(描述):验证用户是否签到
     * @author 王信
     * @date 2016年3月16日 下午1:41:02
     * @version V1.0
     */
    public int checkSigned(@Param("userId") Integer userId, @Param("date") Date date);

    /**
     * 查询当月签到次数
     *
     * @return
     */
    public Integer getMonthSignedCount(Integer userId);

    /**
     * 查询每月签到情况
     *
     * @param userId
     * @param date
     * @return
     */
    public List<String> getMonthSigned(@Param("userId") Integer userId, @Param("date") Date date);

    /**
     * 查询每日签到人数
     *
     * @return
     */
    public Integer getDailySignedCount(Date date);

    /**
     * @return
     * @Title: UserSignedService.java
     * @Package com.goochou.p2b.service
     * @Description(描述):查询所有前一日签到的用户id的集合
     * @author 王信
     * @date 2016年3月15日 下午7:05:32
     * @version V1.0
     */
    public List<Map<String, Object>> selectSignedAgainList(Map<String, Object> params);

    /**
     * @return
     * @Title: UserSignedService.java
     * @Package com.goochou.p2b.service
     * @Description(描述):查询昨日和今日所有的签到用户以及昨日的amount 平均收益
     * @author 王信
     * @date 2016年3月15日 下午7:05:32
     * @version V1.0
     */
    public Map<String, Object> selectSignedAgainYesterday(@Param("userId") Integer userId);

    /**
     * @return
     * @Title: UserSignedService.java
     * @Package com.goochou.p2b.service
     * @Description(描述):查询用户累计签到和累计收益 3.0.0版本
     * @author 王信
     * @date 2016年3月16日 下午2:43:06
     * @version V1.0
     */
    public Map<String, Object> selectSignedAwardDetail(@Param("userId") Integer userId);

    //Description(描述):查询用户签到的所有记录
    public List<Map<String, Object>> selectSignedAwardDetailList(Map<String, Object> map);

    public List<Map<String, Object>> selectAllUserSigned(Map<String, Object> map);

    public Integer selectAllUserSignedCount(Map<String, Object> map);

    /**
     * @Description: 查询用户所有的签到次数, 有可能存在没有派发奖励的无效次数
     * @date 2016/10/24
     * @author 王信
     */
    Integer getAllSignedCount(@Param("userId") Integer userId);
}
