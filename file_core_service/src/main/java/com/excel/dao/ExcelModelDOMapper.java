package com.excel.dao;

import com.excel.dataobject.ExcelModelDO;

public interface ExcelModelDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_model
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_model
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int insert(ExcelModelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_model
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int insertSelective(ExcelModelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_model
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    ExcelModelDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_model
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int updateByPrimaryKeySelective(ExcelModelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_model
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int updateByPrimaryKey(ExcelModelDO record);
}