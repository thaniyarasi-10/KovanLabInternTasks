<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 11-03-2026
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration</title>
</head>

<body>

<h2>Register Student</h2>

<form action="students" method="post">

    Name:
    <input type="text" name="name"><br><br>

    Email:
    <input type="text" name="email"><br><br>

    RollNo:
    <input type="text" name="rollNo"><br><br>

    <input type="submit" value="Register">

</form>

</body>
</html>
