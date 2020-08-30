package com.hexb.springbootest.Service.index;
import com.hexb.springbootest.model.webType;
import com.hexb.springbootest.model.weburl;
import java.util.List;

public interface indexService {
    List<weburl> findAll();
    List<webType> selectAllType();
    weburl addone(weburl form);
}
