<%@taglib prefix="security"
          uri="http://www.springframework.org/security/tags" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
    <title>Home</title>
</head>
    <h3>WELCOME TO MY SECURITY HOME PAGE</h3>
    <hr>

    <security:authorize access="isAnonymous()">
        <a href="${pageContext.request.contextPath}/login">log in</a>

    </security:authorize>

    <security:authorize access = "isAuthenticated()">
    <a href="${pageContext.request.contextPath}/account"> Account Details</a>
    <br>
    </security:authorize>

    <security:authorize access="hasRole('MANAGER')">
    <a href="${pageContext.request.contextPath}/leaders"> Leaders Page</a>
    <br>
    </security:authorize>

    <security:authorize access="hasRole('ADMIN')">
    <a href="${pageContext.request.contextPath}/systems"> System</a>
    </security:authorize>
    <security:authorize access="isAuthenticated()">
        <br>
        <a href="<c:url value="/logout" />">logout</a>
    </security:authorize>
<body>
</body>
</html>