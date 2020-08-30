package com.hexb.springbootest.Service.index;

import com.hexb.springbootest.dao.webTypeMapper;
import com.hexb.springbootest.dao.weburlMapper;
import com.hexb.springbootest.model.webType;
import com.hexb.springbootest.model.weburl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：贺晓滨
 * @date ：2020/8/22 15:01
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class indexServiceImpl implements indexService {
    @Autowired
    weburlMapper Urlmapper;
    @Autowired
    webTypeMapper typeMapper;

    @Override
    public List<weburl> findAll() {
        return Urlmapper.findAll();
    }

    @Override
    public List<webType> selectAllType() {
        return typeMapper.selectAllType();
    }

    @Override
    public weburl addone(weburl form) {
        return null;
    }
}
