package com.goochou.p2b.dao;

import com.goochou.p2b.model.UserContract;
import com.goochou.p2b.model.UserContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserContractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int countByExample(UserContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int deleteByExample(UserContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int insert(UserContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int insertSelective(UserContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    List<UserContract> selectByExample(UserContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    UserContract selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserContract record, @Param("example") UserContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserContract record, @Param("example") UserContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_user_contract
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserContract record);
}