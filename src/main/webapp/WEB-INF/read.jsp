
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read info about record</title>
</head>
<body>
<%@include file="header.html"%>
<br>
<table border="1">
    <tr>
        <td>Person's name </td>
        <td><%=request.getAttribute("name")%></td>
    </tr>
    <tr>
        <td>Person's surname</td>
        <td><%=request.getAttribute("surname")%></td>
    </tr>
    <tr>
        <td>Address:</td>
        <td><%=request.getAttribute("address")%></td>
    </tr>
</table>

</body>
</html>
