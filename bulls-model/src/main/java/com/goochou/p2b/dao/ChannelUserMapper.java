package com.goochou.p2b.dao;

import com.goochou.p2b.model.ChannelUser;
import com.goochou.p2b.model.ChannelUserExample;
import com.goochou.p2b.model.vo.ChannelUserVO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ChannelUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int countByExample(ChannelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int deleteByExample(ChannelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long idx);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int insert(ChannelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int insertSelective(ChannelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    List<ChannelUser> selectByExample(ChannelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    ChannelUser selectByPrimaryKey(Long idx);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ChannelUser record, @Param("example") ChannelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ChannelUser record, @Param("example") ChannelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChannelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_channel_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChannelUser record);
    
    ChannelUserVO getChannelUser(Map<String, Object> params);
    
    List<ChannelUserVO> getChannelByAdminId(Integer adminId);
    
    List<ChannelUserVO> getChannelUserList(String channelId);
}