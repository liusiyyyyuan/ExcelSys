package com.excel.dao;

import com.excel.dataobject.IndexSheetDO;

public interface IndexSheetDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_sheet
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_sheet
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int insert(IndexSheetDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_sheet
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int insertSelective(IndexSheetDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_sheet
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    IndexSheetDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_sheet
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int updateByPrimaryKeySelective(IndexSheetDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_sheet
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    int updateByPrimaryKey(IndexSheetDO record);
}