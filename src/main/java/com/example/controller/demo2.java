package com.example.controller;

import com.alibaba.fastjson2.JSON;
import com.example.Service.ServiceUser;
import com.example.config.Config;
import com.example.domain.Users;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "demo2", value = "/demo2")
public class demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( Config.class);
        ServiceUser bean = context.getBean( ServiceUser.class );
        List <Users> users = bean.selectAll( );
        response.setContentType( "text/json; charset=UTF-8" );
        String brand = JSON.toJSONString( users );

        PrintWriter writer = response.getWriter( );
        writer.write( brand );




/*
        request.setAttribute( "json", json );
        request.getRequestDispatcher( "/user.html" ).forward( request,response );
*/

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet( request,response );
    }
}
