<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security"
          uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>

<html>
<head>
    <title>Home</title>
</head>
<body>
<h3>Welcome to the home page</h3>

<hr>
<p>
    User: <security:authentication property="principal.username"/>
    <br>
    Role(s): <security:authentication property="principal.authorities"/>
    <br><br>
</p>
<hr>
<form:form action="${pageContext.request.contextPath}/logout"
           method="post">

    <input type="submit" value="Logout"/>
</form:form>
</body>
</html>