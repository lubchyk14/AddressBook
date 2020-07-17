<%--
  Created by IntelliJ IDEA.
  User: lubchyk
  Date: 17.07.2020
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update record info</title>
</head>
<body>
<%@include file="header.html"%>
<br>
<form action="/update" method="post">

    <%
        String name = (String)request.getAttribute("name");
        String surname = (String)request.getAttribute("surname");
        String address = (String)request.getAttribute("address");
    %>
    <table>
        <tr>
            <td>
                <label for ="username"> Persons name: </label>
            </td>
            <td>
                <input type="text" id="username" name="username" value="<%=name%>" disabled>
            </td>
        </tr>
        <tr>
            <td>
                <label for ="usersurname"> Persons surname: </label>
            </td>
            <td>
                <input type="text" id="usersurname" name="usersurname" value="<%=surname%>" disabled>
            </td>
        </tr>
        <tr>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td>
                <label for ="useraddress"> Address : </label>
            </td>
            <td>
                <input type="text" id="useraddress" name="useraddress" value="<%=address%>" >
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Submit">
            </td>
            <td>
                <input type="reset" value="Reset" >
            </td>
        </tr>
    </table>
</form>


</body>
</html>
