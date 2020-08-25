package com.hexb.springbootest.dao;

import com.hexb.springbootest.model.webType;

public interface webTypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(webType record);

    int insertSelective(webType record);

    webType selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(webType record);

    int updateByPrimaryKey(webType record);
}