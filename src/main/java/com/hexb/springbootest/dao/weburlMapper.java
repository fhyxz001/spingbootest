package com.hexb.springbootest.dao;

import com.hexb.springbootest.model.weburl;
import com.hexb.springbootest.model.weburlExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface weburlMapper {

    List<weburl> findAll();

    int countByExample(weburlExample example);

    int deleteByExample(weburlExample example);

    int deleteByPrimaryKey(Integer webid);

    int insert(weburl record);

    int insertSelective(weburl record);

    List<weburl> selectByExample(weburlExample example);

    weburl selectByPrimaryKey(Integer webid);

    int updateByExampleSelective(@Param("record") weburl record, @Param("example") weburlExample example);

    int updateByExample(@Param("record") weburl record, @Param("example") weburlExample example);

    int updateByPrimaryKeySelective(weburl record);

    int updateByPrimaryKey(weburl record);
}