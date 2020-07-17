<%@ page import="com.softserve.AddressBook" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of all address notes</title>
</head>
<body>
<%@include file="header.html"%>
<br>
<table>
    <tr>
        <td><h3> Sort by :</h3></td>
        <td><h4><a href="/sort?value=ASC">ascending</a></h4></td>
        <td><h4><a href="/sort?value=DESC">descending</a></h4></td>
    </tr>
</table>
<br>
<table border="1">
    <tr>
        <th>No.</th>
        <th>Person's name </th>
        <th>Person's surname</th>
        <th>Address </th>
        <th colspan="3">Operations</th><%--обєднуе 3 колонки під собою--%>

    </tr>

    <%
        int counter = 0;
        for (Object s :(AddressBook)request.getAttribute("list")){
            counter++;
            String value = (String) s;
            String [] arr = value.split(" ");
            String username = arr[2].substring(0,arr[2].indexOf(","));
            String usersurname = arr[5].substring(0,arr[5].indexOf(","));

        %>
    <tr>
        <td><%=counter%></td>
        <td><%=username%></td>
        <td><%=usersurname%></td>
        <td><%=value.substring(value.indexOf("Address:")+9)%></td>
        <td>
            <a href="/read?name=<%=username%>&surname=<%=usersurname%>">Read</a>
        </td>
        <td>
            <a href="/update?name=<%=username%>&surname=<%=usersurname%>">Update</a>
        </td>
        <td>
            <a href="/delete?name=<%=username%>&surname=<%=usersurname%>">Delete</a>
        </td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>
