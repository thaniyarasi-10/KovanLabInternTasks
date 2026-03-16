<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <style>
        .error{
            color:red;
        }
    </style>
</head>

<body>

<h2>User Registration</h2>

<form:form action="submit" method="post" modelAttribute="userModel">

    Name:
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
    <br><br>

    Email:
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/>
    <br><br>

    Age:
    <form:input path="age"/>
    <form:errors path="age" cssClass="error"/>
    <br><br>

    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>