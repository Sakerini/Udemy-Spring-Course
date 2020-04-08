<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>

<body>
        <h2>LOGIN:</h2>
        <%--@elvariable id="user" type="com.sakerini.validationdemo.entity.User"--%>
        <form:form action="/login/process" modelAttribute="user">
            Account Name:<form:input path="accountName" />
            <br><br>
            Passowrd:    <form:input path="password" />
            <br><br>
            <input type="submit" value="Login">
        </form:form>
        <br><br>
</body>
</html>
