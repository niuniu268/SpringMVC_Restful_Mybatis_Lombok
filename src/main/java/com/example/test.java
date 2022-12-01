package com.example;

import com.example.Service.ServiceUser;
import com.example.config.Config;
import com.example.dao.UserMapper;
import com.example.domain.Users;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( Config.class);
        ServiceUser bean = context.getBean( ServiceUser.class );
        List <Users> users = bean.selectAll( );
        System.out.println(users );

    }
}
