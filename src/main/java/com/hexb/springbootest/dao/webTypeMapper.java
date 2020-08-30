package com.hexb.springbootest.dao;

import com.hexb.springbootest.model.webType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface webTypeMapper {
    List<webType> selectAllType();

    int deleteByPrimaryKey(Integer tid);

    int insert(webType record);

    int insertSelective(webType record);

    webType selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(webType record);

    int updateByPrimaryKey(webType record);
}