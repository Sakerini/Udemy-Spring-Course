<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register</title>

    <style>
            .error {color:red}
    </style>

</head>
<body>

        <%--@elvariable id="user" type="com.sakerini.validationdemo.entity.User"--%>
        <form:form action="process" modelAttribute="user">
                <h2>Welcome to Demo Application for Validation</h2>
                Enter your INFORMATION:
                <br><br>
                Account Name: <form:input path="accountName" />
                <form:errors path="accountName" cssClass="error" />

                <br><br>
                Passowrd:     <form:input path="password" />
                <form:errors path="password" cssClass="error" />

                <br><br>
                Age:          <form:input path="age" />
                <form:errors path="age" cssClass="error" />

                <br><br>

                Postal code: <form:input path="postalCode" />
                <form:errors path="postalCode" cssClass="error" />

                <br><br>

                Street: <form:input path="street" />
                <form:errors path="street" cssClass="error" />

                <br><br>

                <input type="submit" value="Submit">
                <br><br>
        </form:form>
</body>
</html>










