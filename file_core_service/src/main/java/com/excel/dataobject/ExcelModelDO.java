package com.excel.dataobject;

import java.util.Date;

public class ExcelModelDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_model.id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_model.excel_model_name
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private String excelModelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_model.create_user_id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_model.sheet_model_list
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private String sheetModelList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_model.excel_model_detail
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private String excelModelDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_model.create_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_model.id
     *
     * @return the value of excel_model.id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_model.id
     *
     * @param id the value for excel_model.id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_model.excel_model_name
     *
     * @return the value of excel_model.excel_model_name
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public String getExcelModelName() {
        return excelModelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_model.excel_model_name
     *
     * @param excelModelName the value for excel_model.excel_model_name
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setExcelModelName(String excelModelName) {
        this.excelModelName = excelModelName == null ? null : excelModelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_model.create_user_id
     *
     * @return the value of excel_model.create_user_id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_model.create_user_id
     *
     * @param createUserId the value for excel_model.create_user_id
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_model.sheet_model_list
     *
     * @return the value of excel_model.sheet_model_list
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public String getSheetModelList() {
        return sheetModelList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_model.sheet_model_list
     *
     * @param sheetModelList the value for excel_model.sheet_model_list
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setSheetModelList(String sheetModelList) {
        this.sheetModelList = sheetModelList == null ? null : sheetModelList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_model.excel_model_detail
     *
     * @return the value of excel_model.excel_model_detail
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public String getExcelModelDetail() {
        return excelModelDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_model.excel_model_detail
     *
     * @param excelModelDetail the value for excel_model.excel_model_detail
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setExcelModelDetail(String excelModelDetail) {
        this.excelModelDetail = excelModelDetail == null ? null : excelModelDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_model.create_time
     *
     * @return the value of excel_model.create_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_model.create_time
     *
     * @param createTime the value for excel_model.create_time
     *
     * @mbg.generated Wed Dec 25 22:34:35 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}