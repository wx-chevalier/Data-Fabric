package com.zhuxun.dc.apirunner.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcDataTableExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public DcDataTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDataSourceIdIsNull() {
            addCriterion("data_source_id is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIsNotNull() {
            addCriterion("data_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdEqualTo(String value) {
            addCriterion("data_source_id =", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotEqualTo(String value) {
            addCriterion("data_source_id <>", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdGreaterThan(String value) {
            addCriterion("data_source_id >", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_id >=", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLessThan(String value) {
            addCriterion("data_source_id <", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLessThanOrEqualTo(String value) {
            addCriterion("data_source_id <=", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLike(String value) {
            addCriterion("data_source_id like", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotLike(String value) {
            addCriterion("data_source_id not like", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIn(List<String> values) {
            addCriterion("data_source_id in", values, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotIn(List<String> values) {
            addCriterion("data_source_id not in", values, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdBetween(String value1, String value2) {
            addCriterion("data_source_id between", value1, value2, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotBetween(String value1, String value2) {
            addCriterion("data_source_id not between", value1, value2, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameIsNull() {
            addCriterion("data_base_name is null");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameIsNotNull() {
            addCriterion("data_base_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameEqualTo(String value) {
            addCriterion("data_base_name =", value, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameNotEqualTo(String value) {
            addCriterion("data_base_name <>", value, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameGreaterThan(String value) {
            addCriterion("data_base_name >", value, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_base_name >=", value, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameLessThan(String value) {
            addCriterion("data_base_name <", value, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameLessThanOrEqualTo(String value) {
            addCriterion("data_base_name <=", value, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameLike(String value) {
            addCriterion("data_base_name like", value, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameNotLike(String value) {
            addCriterion("data_base_name not like", value, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameIn(List<String> values) {
            addCriterion("data_base_name in", values, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameNotIn(List<String> values) {
            addCriterion("data_base_name not in", values, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameBetween(String value1, String value2) {
            addCriterion("data_base_name between", value1, value2, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andDataBaseNameNotBetween(String value1, String value2) {
            addCriterion("data_base_name not between", value1, value2, "dataBaseName");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("create_datetime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("create_datetime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("create_datetime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_datetime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("create_datetime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("create_datetime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("create_datetime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("create_datetime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("create_datetime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("create_datetime not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIsNull() {
            addCriterion("modify_datetime is null");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIsNotNull() {
            addCriterion("modify_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeEqualTo(Date value) {
            addCriterion("modify_datetime =", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotEqualTo(Date value) {
            addCriterion("modify_datetime <>", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeGreaterThan(Date value) {
            addCriterion("modify_datetime >", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_datetime >=", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeLessThan(Date value) {
            addCriterion("modify_datetime <", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_datetime <=", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIn(List<Date> values) {
            addCriterion("modify_datetime in", values, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotIn(List<Date> values) {
            addCriterion("modify_datetime not in", values, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeBetween(Date value1, Date value2) {
            addCriterion("modify_datetime between", value1, value2, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_datetime not between", value1, value2, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNull() {
            addCriterion("create_userid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNotNull() {
            addCriterion("create_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridEqualTo(String value) {
            addCriterion("create_userid =", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotEqualTo(String value) {
            addCriterion("create_userid <>", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThan(String value) {
            addCriterion("create_userid >", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThanOrEqualTo(String value) {
            addCriterion("create_userid >=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThan(String value) {
            addCriterion("create_userid <", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThanOrEqualTo(String value) {
            addCriterion("create_userid <=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLike(String value) {
            addCriterion("create_userid like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotLike(String value) {
            addCriterion("create_userid not like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIn(List<String> values) {
            addCriterion("create_userid in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotIn(List<String> values) {
            addCriterion("create_userid not in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridBetween(String value1, String value2) {
            addCriterion("create_userid between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotBetween(String value1, String value2) {
            addCriterion("create_userid not between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridIsNull() {
            addCriterion("modify_userid is null");
            return (Criteria) this;
        }

        public Criteria andModifyUseridIsNotNull() {
            addCriterion("modify_userid is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUseridEqualTo(String value) {
            addCriterion("modify_userid =", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridNotEqualTo(String value) {
            addCriterion("modify_userid <>", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridGreaterThan(String value) {
            addCriterion("modify_userid >", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridGreaterThanOrEqualTo(String value) {
            addCriterion("modify_userid >=", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridLessThan(String value) {
            addCriterion("modify_userid <", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridLessThanOrEqualTo(String value) {
            addCriterion("modify_userid <=", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridLike(String value) {
            addCriterion("modify_userid like", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridNotLike(String value) {
            addCriterion("modify_userid not like", value, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridIn(List<String> values) {
            addCriterion("modify_userid in", values, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridNotIn(List<String> values) {
            addCriterion("modify_userid not in", values, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridBetween(String value1, String value2) {
            addCriterion("modify_userid between", value1, value2, "modifyUserid");
            return (Criteria) this;
        }

        public Criteria andModifyUseridNotBetween(String value1, String value2) {
            addCriterion("modify_userid not between", value1, value2, "modifyUserid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dc_data_table
     *
     * @mbg.generated do_not_delete_during_merge Wed May 30 15:12:35 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dc_data_table
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}