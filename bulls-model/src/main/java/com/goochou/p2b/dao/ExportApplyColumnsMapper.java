package com.goochou.p2b.dao;

import com.goochou.p2b.model.ExportApplyColumns;
import com.goochou.p2b.model.ExportApplyColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportApplyColumnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    long countByExample(ExportApplyColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    int deleteByExample(ExportApplyColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    int insert(ExportApplyColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    int insertSelective(ExportApplyColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    List<ExportApplyColumns> selectByExample(ExportApplyColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    ExportApplyColumns selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ExportApplyColumns record, @Param("example") ExportApplyColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ExportApplyColumns record, @Param("example") ExportApplyColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ExportApplyColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table export_apply_columns
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ExportApplyColumns record);
}