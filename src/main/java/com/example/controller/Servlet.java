package com.example.controller;

import com.alibaba.fastjson2.JSON;
import com.example.Service.ServiceUser;
import com.example.config.Config;
import com.example.domain.Users;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet("/servlet/*")
public class Servlet extends baseServlet{
    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( Config.class);
        ServiceUser bean = context.getBean( ServiceUser.class );
        List <Users> users = bean.selectAll( );
        resp.setContentType( "text/json; charset=UTF-8" );
        String s = JSON.toJSONString( users );

        PrintWriter writer = resp.getWriter( );
        writer.write( s );
    }
}
