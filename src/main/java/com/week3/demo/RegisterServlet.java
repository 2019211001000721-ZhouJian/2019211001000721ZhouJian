package com.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String Gender=request.getParameter("gender");
        String birthdate=request.getParameter("birthdate");
        PrintWriter writer=response.getWriter();
        writer.println("<br>username :"+username);
        writer.println("<br>password :"+password);
        writer.println("<br>email :"+email);
        writer.println("<br>gender :"+Gender);
        writer.println("<br>birthdate :"+birthdate);
        writer.close();
    }
}
