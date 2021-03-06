package com.goochou.p2b.dao;

import com.goochou.p2b.model.Award;
import com.goochou.p2b.model.AwardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int countByExample(AwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int deleteByExample(AwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int insert(Award record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int insertSelective(Award record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    List<Award> selectByExample(AwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    Award selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int updateByExampleSelective(@Param("record") Award record, @Param("example") AwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int updateByExample(@Param("record") Award record, @Param("example") AwardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int updateByPrimaryKeySelective(Award record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table award
     *
     * @mbggenerated Wed Jul 01 14:19:28 CST 2015
     */
    int updateByPrimaryKey(Award record);
}