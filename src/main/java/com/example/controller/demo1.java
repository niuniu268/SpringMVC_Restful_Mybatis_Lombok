package com.example.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(name = "demo1", value = "/demo1")
public class demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> lists = new ArrayList <String>(  );
        String s = "aaa";
        String s1 = "bbb";
        String s2 = "ccc";

        boolean all = Collections.addAll( lists, s, s1, s2 );

        request.setAttribute( "lists", lists );

        request.getRequestDispatcher( "/hello.jsp" ).forward( request,response );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet( request, response );
    }
}
