package com.week3.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
    public LifeCycleServlet(){

        System.out.println("i am in constructor -->LifeCycleServlet() ");
    }

    @Override
    public void init(){

        System.out.println("i am init()");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("i am in service()-->doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
    @Override
    public void destroy() {

        System.out.println("i am in destroy()");
    }
}