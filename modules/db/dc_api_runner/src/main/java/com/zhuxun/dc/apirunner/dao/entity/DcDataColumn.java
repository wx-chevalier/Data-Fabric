package com.zhuxun.dc.apirunner.dao.entity;

import java.util.Date;

public class DcDataColumn extends DcDataColumnKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_data_column.column_type
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String columnType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_data_column.column_comment
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String columnComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_data_column.create_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private Date createDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_data_column.modify_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private Date modifyDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_data_column.create_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String createUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_data_column.modify_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String modifyUserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_data_column.column_type
     *
     * @return the value of dc_data_column.column_type
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_data_column.column_type
     *
     * @param columnType the value for dc_data_column.column_type
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_data_column.column_comment
     *
     * @return the value of dc_data_column.column_comment
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getColumnComment() {
        return columnComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_data_column.column_comment
     *
     * @param columnComment the value for dc_data_column.column_comment
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment == null ? null : columnComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_data_column.create_datetime
     *
     * @return the value of dc_data_column.create_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_data_column.create_datetime
     *
     * @param createDatetime the value for dc_data_column.create_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_data_column.modify_datetime
     *
     * @return the value of dc_data_column.modify_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_data_column.modify_datetime
     *
     * @param modifyDatetime the value for dc_data_column.modify_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_data_column.create_userid
     *
     * @return the value of dc_data_column.create_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getCreateUserid() {
        return createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_data_column.create_userid
     *
     * @param createUserid the value for dc_data_column.create_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid == null ? null : createUserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_data_column.modify_userid
     *
     * @return the value of dc_data_column.modify_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getModifyUserid() {
        return modifyUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_data_column.modify_userid
     *
     * @param modifyUserid the value for dc_data_column.modify_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setModifyUserid(String modifyUserid) {
        this.modifyUserid = modifyUserid == null ? null : modifyUserid.trim();
    }
}