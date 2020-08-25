package com.hexb.springbootest.dao;

import com.hexb.springbootest.model.weburl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface weburlMapper {
    List<weburl> findAll();
}