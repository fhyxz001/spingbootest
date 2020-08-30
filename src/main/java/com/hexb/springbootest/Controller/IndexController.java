package com.hexb.springbootest.Controller;

import com.hexb.springbootest.Service.index.indexService;
import com.hexb.springbootest.model.webType;
import com.hexb.springbootest.model.weburl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/")
public class IndexController {
    @Autowired
    private indexService service;

    @RequestMapping("/index")
    public List<weburl> getAll(){
        return service.findAll();
    }
    @RequestMapping("/getallType")
    public List<webType> getone(){
        return service.selectAllType();
    }
    @PostMapping("/addone")
    public weburl addone(){
        return null;
    }
}
