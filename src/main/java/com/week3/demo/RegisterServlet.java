package com.week3.demo;

import com.week5.demo.LoginServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(
        urlPatterns = {"/Register"},loadOnStartup=1
)

public class RegisterServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
//        String driver=getServletConfig().getServletContext().getInitParameter("driver");
//        String url=getServletConfig().getServletContext().getInitParameter("url");
//        String username=getServletConfig().getServletContext().getInitParameter("username");
//        String password=getServletConfig().getServletContext().getInitParameter("password");
//        try {
//            Class.forName(driver);
//            con= DriverManager.getConnection(url,username,password);
//            System.out.println("init()-->"+con);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
        con= (Connection) getServletContext().getAttribute("con");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/register.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username=request.getParameter("username");
        String password=request.getParameter("password");
        String Email=request.getParameter("email");
        String Gender=request.getParameter("gender");
        String Date=request.getParameter("birthdate");

        String sql1="insert into usertable values(?,?,?,?,?)";
        PreparedStatement pstmt= null;
        try {
            pstmt = con.prepareStatement(sql1);
            pstmt.setString(1,Username);
            pstmt.setString(2,password);
            pstmt.setString(3,Email);
            pstmt.setString(4,Gender);
            pstmt.setString(5,Date);
            pstmt.executeUpdate();
        //response.setContentType("textml");
        //PrintWriter out=response.getWriter();
//        out.println("<html>");
//        out.println("<head><title>Register</title></head>");
//        out.println("<body>");
//        out.println("<table>");
//        out.println("<tr><td>ID</td><td>username</td><td>password</td><td>Email</td><td>Gender</td><td>Birthdate</td></tr>");
        //String sql2="select * from usertable";
        //ResultSet rs= null;
            //rs = con.createStatement().executeQuery(sql2);
//            while(rs.next()){

//                int id=rs.getInt("id");
//                String username=rs.getString("username");
//                String password1=rs.getString("password");
//                String email=rs.getString("email");
//                String gender=rs.getString("gender");
//                String birthdate=rs.getString("birthdate");
//                out.println("<tr><td>"+id+"</td><td>"+username+"</td><td>"+password1+"</td><td>"+email+"</td><td>"+gender+"</td><td>"+birthdate+"</td></tr>");
//            request.setAttribute("rsname",rs);
//            request.getRequestDispatcher("userList.jsp").forward(request,response);
//            System.out.println("i am in RedirectServlet-->doPoat()-->after forward()");

           // response.sendRedirect("Login.jsp");
        response.sendRedirect("login");
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
//        out.println("</table>");
//        out.println("</body>");
//        out.println("<ml>");
    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
