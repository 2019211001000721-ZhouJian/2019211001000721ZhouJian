<%--
  Created by IntelliJ IDEA.
  User: 32203
  Date: 2021/3/14
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
This is my register JSP page. <br>
    <form method="post" action="register">
        username :<input type="text" name="username" required><br/>
        password :<input type="password" name="password" required minlength="8"><br/>
        email    :<input type="text" name="email" required><br/>
        Gender   :<input  type="radio" name="gender" value="Male">Male
                  <input  type="radio" name="gender" value="Female">Female<br/>
        birthdate:<input type="text" name="birthdate" required><br/>
        <input type="submit" value="Register" required>
    </form>
<%@include file="footer.jsp"%>
