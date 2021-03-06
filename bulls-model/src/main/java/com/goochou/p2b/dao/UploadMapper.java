package com.goochou.p2b.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goochou.p2b.model.Upload;
import com.goochou.p2b.model.UploadExample;

public interface UploadMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int countByExample(UploadExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int deleteByExample(UploadExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int insert(Upload record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int insertSelective(Upload record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    List<Upload> selectByExample(UploadExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    Upload selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int updateByExampleSelective(@Param("record") Upload record, @Param("example") UploadExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int updateByExample(@Param("record") Upload record, @Param("example") UploadExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int updateByPrimaryKeySelective(Upload record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    int updateByPrimaryKey(Upload record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    Boolean updateAvatarUserId(@Param("userId") Integer userId, @Param("uploadId") Integer uploadId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table upload
     *
     * @mbggenerated Tue Nov 25 13:32:39 CST 2014
     */
    Boolean updateSkinUserId(Integer userId, Integer id);

    String selectPathById(@Param("id")Integer id);
}
