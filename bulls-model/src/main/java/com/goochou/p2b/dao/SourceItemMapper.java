package com.goochou.p2b.dao;

import com.goochou.p2b.model.SourceItem;
import com.goochou.p2b.model.SourceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SourceItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int countByExample(SourceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int deleteByExample(SourceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int insert(SourceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int insertSelective(SourceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    List<SourceItem> selectByExample(SourceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    SourceItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int updateByExampleSelective(@Param("record") SourceItem record, @Param("example") SourceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int updateByExample(@Param("record") SourceItem record, @Param("example") SourceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int updateByPrimaryKeySelective(SourceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table source_item
     *
     * @mbggenerated Tue Dec 01 11:43:42 CST 2015
     */
    int updateByPrimaryKey(SourceItem record);
}