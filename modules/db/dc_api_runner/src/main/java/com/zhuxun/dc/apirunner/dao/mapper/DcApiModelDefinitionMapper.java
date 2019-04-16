package com.zhuxun.dc.apirunner.dao.mapper;

import com.zhuxun.dc.apirunner.dao.entity.DcApiModelDefinition;
import com.zhuxun.dc.apirunner.dao.entity.DcApiModelDefinitionExample;
import com.zhuxun.dc.apirunner.dao.entity.DcApiModelDefinitionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcApiModelDefinitionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    long countByExample(DcApiModelDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int deleteByExample(DcApiModelDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int deleteByPrimaryKey(DcApiModelDefinitionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int insert(DcApiModelDefinition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int insertSelective(DcApiModelDefinition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    List<DcApiModelDefinition> selectByExample(DcApiModelDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    DcApiModelDefinition selectByPrimaryKey(DcApiModelDefinitionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") DcApiModelDefinition record, @Param("example") DcApiModelDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByExample(@Param("record") DcApiModelDefinition record, @Param("example") DcApiModelDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByPrimaryKeySelective(DcApiModelDefinition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_model_definition
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByPrimaryKey(DcApiModelDefinition record);
}