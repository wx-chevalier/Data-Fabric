package com.zhuxun.dc.apirunner.dao.mapper;

import com.zhuxun.dc.apirunner.dao.entity.DcDataSource;
import com.zhuxun.dc.apirunner.dao.entity.DcDataSourceExample;
import com.zhuxun.dc.apirunner.dao.entity.DcDataSourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcDataSourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    long countByExample(DcDataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int deleteByExample(DcDataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int deleteByPrimaryKey(DcDataSourceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int insert(DcDataSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int insertSelective(DcDataSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    List<DcDataSource> selectByExample(DcDataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    DcDataSource selectByPrimaryKey(DcDataSourceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") DcDataSource record, @Param("example") DcDataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByExample(@Param("record") DcDataSource record, @Param("example") DcDataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByPrimaryKeySelective(DcDataSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dc_data_source
     *
     * @mbg.generated Wed May 30 15:12:35 CST 2018
     */
    int updateByPrimaryKey(DcDataSource record);
}