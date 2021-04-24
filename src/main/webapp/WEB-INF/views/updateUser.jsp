<%@ page import="com.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 32203
  Date: 2021/4/24
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Update</h1>
<%
    User u=(User) session.getAttribute("user");
%>
<form method="post" action="updateUser">
    <input type="hidden" name="id" value="<%=u.getId()%>">
    username :<input type="text" name="username" value="<%=u.getUsername()%>" required><br/>
    password :<input type="password" name="password" value="<%=u.getPassword()%>" required minlength="8"><br/>
    email    :<input type="text" name="email" value="<%=u.getEmail()%>" required><br/>
    Gender   :<input  type="radio" name="gender" value="Male" <%="Male".equals(u.getGender())?"checked":""%>>Male
    <input  type="radio" name="gender" value="Female"<%="Female".equals(u.getGender())?"checked":""%>>Female<br/>
    birthdate:<input type="text" name="birthdate" value="<%=u.getBirthdate()%>" required><br/>
    <input type="submit" value="Save Changes" required>
</form>
<%@include file="footer.jsp"%>
