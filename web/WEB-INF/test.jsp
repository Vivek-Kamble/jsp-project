<%-- 
    Document   : test
    Created on : 8 Feb, 2020, 1:47:10 PM
    Author     : vivek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% int x=5; %>
        <%! int x=7; %>
        x=<%=x%>,<%=this.x%>
    </body>
</html>
