package com.zhuxun.dc.apirunner.dao.entity;

import java.util.Date;

public class DcApiParam extends DcApiParamKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_param.api_id
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String apiId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_param.param_type
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String paramType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_param.param_model
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String paramModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_param.create_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private Date createDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_param.modify_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private Date modifyDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_param.create_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String createUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dc_api_param.modify_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    private String modifyUserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_param.api_id
     *
     * @return the value of dc_api_param.api_id
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_param.api_id
     *
     * @param apiId the value for dc_api_param.api_id
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setApiId(String apiId) {
        this.apiId = apiId == null ? null : apiId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_param.param_type
     *
     * @return the value of dc_api_param.param_type
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_param.param_type
     *
     * @param paramType the value for dc_api_param.param_type
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_param.param_model
     *
     * @return the value of dc_api_param.param_model
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getParamModel() {
        return paramModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_param.param_model
     *
     * @param paramModel the value for dc_api_param.param_model
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setParamModel(String paramModel) {
        this.paramModel = paramModel == null ? null : paramModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_param.create_datetime
     *
     * @return the value of dc_api_param.create_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_param.create_datetime
     *
     * @param createDatetime the value for dc_api_param.create_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_param.modify_datetime
     *
     * @return the value of dc_api_param.modify_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_param.modify_datetime
     *
     * @param modifyDatetime the value for dc_api_param.modify_datetime
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_param.create_userid
     *
     * @return the value of dc_api_param.create_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getCreateUserid() {
        return createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_param.create_userid
     *
     * @param createUserid the value for dc_api_param.create_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid == null ? null : createUserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dc_api_param.modify_userid
     *
     * @return the value of dc_api_param.modify_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getModifyUserid() {
        return modifyUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dc_api_param.modify_userid
     *
     * @param modifyUserid the value for dc_api_param.modify_userid
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setModifyUserid(String modifyUserid) {
        this.modifyUserid = modifyUserid == null ? null : modifyUserid.trim();
    }
}