package com.hexb.springbootest.Controller;

import com.hexb.springbootest.Service.indexService;
import com.hexb.springbootest.model.weburl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：贺晓滨
 * @date ：2020/8/22 10:56
 * @description：测试
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("/index")
public class testController {
    @Autowired
    private indexService service;

    @RequestMapping("")
    public List<weburl> test(){
        return service.findAll();
    }
}
