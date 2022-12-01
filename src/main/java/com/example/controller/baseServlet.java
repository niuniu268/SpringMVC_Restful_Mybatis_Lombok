package com.example.controller;

import com.alibaba.druid.sql.visitor.functions.Substring;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class baseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI( );

        int i = uri.lastIndexOf( "/" );
        String substring = uri.substring( i+1 );
        System.out.println(substring );

        Class <? extends baseServlet> aClass = this.getClass( );
        try {
            Method method = aClass.getMethod( substring, HttpServletRequest.class, HttpServletResponse.class );
            Object invoke = method.invoke( this, req, resp );


        } catch (NoSuchMethodException e) {
            throw new RuntimeException( e );
        } catch (InvocationTargetException e) {
            throw new RuntimeException( e );
        } catch (IllegalAccessException e) {
            throw new RuntimeException( e );
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost( req, resp );
    }
}
