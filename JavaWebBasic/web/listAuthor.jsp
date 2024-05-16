<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : listAuthor
    Created on : May 16, 2024, 7:00:31 PM
    Author     : tungl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1><table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Zip</th>
                    <th>Contract</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="a" items="${list}">
                <tr>
                    <td>${a.authorId}</td>
                    <td>${a.authorLastname} ${a.authorFirstname}</td>
                    <td>${a.phone}</td>
                    <td>${a.address}</td>
                    <td>${a.city}</td>
                    <td>${a.state}</td>
                    <td>${a.zip}</td>
                    <td>${a.contract}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </body>
</html>
