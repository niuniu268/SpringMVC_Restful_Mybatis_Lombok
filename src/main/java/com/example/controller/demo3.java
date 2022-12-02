package com.example.controller;

import com.alibaba.fastjson2.JSON;
import com.example.Service.ServiceUser;
import com.example.config.ServletConfig;
import com.example.dao.UserMapper;
import com.example.domain.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class demo3 {

    @RequestMapping("/demo3")
    @ResponseBody
    public String test(AnnotationConfigApplicationContext context){
        ServiceUser bean = context.getBean( ServiceUser.class );
        List <Users> users = bean.selectAll( );
        String s = JSON.toJSONString( users );
        return s;

    }
}
