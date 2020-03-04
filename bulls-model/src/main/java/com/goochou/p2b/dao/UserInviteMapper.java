package com.goochou.p2b.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.goochou.p2b.model.UserInvite;
import com.goochou.p2b.model.UserInviteDetail;
import com.goochou.p2b.model.UserInviteExample;
import com.goochou.p2b.model.vo.InvitedUserDetailVO;

public interface UserInviteMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int countByExample(UserInviteExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int deleteByExample(UserInviteExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int insert(UserInvite record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int insertSelective(UserInvite record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    List<UserInvite> selectByExample(UserInviteExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    UserInvite selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int updateByExampleSelective(@Param("record") UserInvite record, @Param("example") UserInviteExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int updateByExample(@Param("record") UserInvite record, @Param("example") UserInviteExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int updateByPrimaryKeySelective(UserInvite record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table user_invite
     *
     * @mbggenerated Wed Oct 28 10:59:26 CST 2015
     */
    int updateByPrimaryKey(UserInvite record);

    /**
     * 查询用户的邀请list
     *
     * @param userId
     * @return
     */
    public List<Map<String, Object>> getInviteList(Integer userId);

    public Integer getInviteListCount(Integer userId);

    public List<Map<String, Object>> inviteReport(Map<String, Object> map);

    public Integer inviteReportCount(Map<String, Object> map);

    public List<Map<String, Object>> getInviteDetail(Integer userId);
    public Integer getInviteDetailCount(Integer userId);


    /**
     * 查询邀请的用户在投金额>=200的人数总数
     *
     * @param userId
     * @return
     */
    public Integer getInviteCount(Integer userId);

    /**
     * @param keywords
     * @return
     * @Title: UserInviteService.java
     * @Package com.goochou.p2b.service
     * @Description:
     * @author 王信
     * @date 2016年1月20日 下午2:08:08
     */
    public List<Map<String, Object>> userInviteDetail(Map<String, Object> map);

    /**
     * 统计总的佣金
     * month:佣金结算月
     */
    public Double getMyCommission(@Param("userId") Integer userId, @Param("status") Integer status, @Param("month") Date month);

    /**
     * App统计用户邀请详情信息 待结算 已结算 总额 按照用户分组
     */
    public List<Map<String, Object>> listDetail(Map<String, Object> map);

    /**
     * App统计用户邀请详情信息 待结算 已结算 总额 按照用户分组
     */
    public Integer listDetailCount(Integer userId);

    /**
     * 每月20号结算佣金
     */
    public List<UserInviteDetail> getUnsettlement();

    public List<Map<String, Object>> getUnsettlementGroupByUser();


    List<Map<String,Object>> selectInvestmentAward(Map<String, Object> map);

    Integer countInvestmentAward(Map<String, Object> map);


    /**
     * @Description: 邀请人奖励排行榜
     * @date  2016/10/8
     * @author 王信
     */
    List<Map<String,Object>> selectInviteAmountList(Map<String, Object> map);
    
    /**
     * 查询邀请的好友注册最多的用户
     * @param map
     * @return
     */
    Map<String, Object> selectInvitedCountTopOne(Map<String, Object> map);
    
    /**
     * 查询邀请的好友获得奖励最多
     * @param map
     * @return
     */
    Map<String, Object> selectInvitedAmountTopOne(Map<String, Object> map);
    
    /**
     * 查询被邀请人详细内容
     * @param map
     * @return
     */
    List<InvitedUserDetailVO> getInvitedUserDetail(Map<String, Object> map);
    
    Map<String, Object> sumAwardAmount(Map<String, Object> map);


    Map<String, Object> getInviteUserCount(Integer userId);

    Double getInviteUserAmount(Integer userId);
    
    List<Map<String, Object>> getUserInviteFriendsPageList(Map<String, Object> map);
}