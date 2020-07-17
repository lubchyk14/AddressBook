
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new record in address book</title>
</head>
<body>
<%@include file="header.html"%>
<%
    Boolean success = (Boolean)request.getAttribute("success");
    if(success!=null && !success){
        %><h3>An Error occured. Please,try again.</h3>
<%
    }
%>
<form action="/create" method="post">
    <table>
        <tr>
            <td>
                <label for ="username"> Persons name: </label>
            </td>
            <td>
                <input type="text" id="username" name="username">
            </td>
        </tr>
        <tr>
            <td>
                <label for ="usersurname"> Persons surname: </label>
            </td>
            <td>
                <input type="text" id="usersurname" name="usersurname">
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
                <input type="text" id="useraddress" name="useraddress">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Submit">
            </td>
            <td>
                <input type="reset" value="Reset">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
