package com.hexb.springbootest.Service;

import com.hexb.springbootest.dao.weburlMapper;
import com.hexb.springbootest.model.weburl;
import com.hexb.springbootest.model.weburlExample;
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
    private weburlMapper mapper;
    @Override
    public List<weburl> findAll() {
        return mapper.findAll();
    }
}
