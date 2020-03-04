package com.goochou.p2b.dao;

import com.goochou.p2b.model.UserSignAward;
import com.goochou.p2b.model.UserSignAwardExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserSignAwardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int countByExample(UserSignAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int deleteByExample(UserSignAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int insert(UserSignAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int insertSelective(UserSignAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    List<UserSignAward> selectByExample(UserSignAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    UserSignAward selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserSignAward record, @Param("example") UserSignAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserSignAward record, @Param("example") UserSignAwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserSignAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_sign_award
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserSignAward record);
    
    int insertSelectiveBatch(List<UserSignAward> list);
    
    List<Map<String, Object>> queryUserSignAwardList(Map<String, Object> params);
    
    Integer queryUserSignAwardCount(Map<String, Object> params);
}