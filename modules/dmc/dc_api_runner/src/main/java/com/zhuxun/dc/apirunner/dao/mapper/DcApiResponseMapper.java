package com.zhuxun.dc.apirunner.dao.mapper;

import com.zhuxun.dc.apirunner.dao.entity.DcApiResponse;
import com.zhuxun.dc.apirunner.dao.entity.DcApiResponseExample;
import com.zhuxun.dc.apirunner.dao.entity.DcApiResponseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcApiResponseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    long countByExample(DcApiResponseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int deleteByExample(DcApiResponseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int deleteByPrimaryKey(DcApiResponseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int insert(DcApiResponse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int insertSelective(DcApiResponse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    List<DcApiResponse> selectByExample(DcApiResponseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    DcApiResponse selectByPrimaryKey(DcApiResponseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") DcApiResponse record, @Param("example") DcApiResponseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByExample(@Param("record") DcApiResponse record, @Param("example") DcApiResponseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByPrimaryKeySelective(DcApiResponse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_api_response
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByPrimaryKey(DcApiResponse record);
}