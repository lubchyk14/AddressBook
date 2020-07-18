
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error page jsp</title>
</head>
<body>
    <h3>Person with name '<%=request.getParameter("name")%> <%=request.getParameter("surname")%>' not found</h3>
</body>
</html>
