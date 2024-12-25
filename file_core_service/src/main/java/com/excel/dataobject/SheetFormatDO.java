package com.excel.dataobject;

import java.util.Date;

public class SheetFormatDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sheet_format.id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sheet_format.format_type
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private String formatType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sheet_format.row
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private Integer row;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sheet_format.colm
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private Integer colm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sheet_format.create_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sheet_format.update_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sheet_format.id
     *
     * @return the value of sheet_format.id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sheet_format.id
     *
     * @param id the value for sheet_format.id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sheet_format.format_type
     *
     * @return the value of sheet_format.format_type
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public String getFormatType() {
        return formatType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sheet_format.format_type
     *
     * @param formatType the value for sheet_format.format_type
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setFormatType(String formatType) {
        this.formatType = formatType == null ? null : formatType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sheet_format.row
     *
     * @return the value of sheet_format.row
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public Integer getRow() {
        return row;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sheet_format.row
     *
     * @param row the value for sheet_format.row
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setRow(Integer row) {
        this.row = row;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sheet_format.colm
     *
     * @return the value of sheet_format.colm
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public Integer getColm() {
        return colm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sheet_format.colm
     *
     * @param colm the value for sheet_format.colm
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setColm(Integer colm) {
        this.colm = colm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sheet_format.create_time
     *
     * @return the value of sheet_format.create_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sheet_format.create_time
     *
     * @param createTime the value for sheet_format.create_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sheet_format.update_time
     *
     * @return the value of sheet_format.update_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sheet_format.update_time
     *
     * @param updateTime the value for sheet_format.update_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}