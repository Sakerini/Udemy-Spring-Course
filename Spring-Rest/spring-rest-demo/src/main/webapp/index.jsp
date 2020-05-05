<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello page</title>
</head>
<body>
<h3>Spring REST DEmo</h3>
<hr>
THI IS HELLO PAGE!!!
<br><br>
<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
<a href="${pageContext.request.contextPath}/api/students">Students</a>

</body>
</html>
