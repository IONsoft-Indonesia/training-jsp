<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <a href="index.jsp">Home</a>
            <a href="about.jsp">About</a>
            <a href="contact.jsp">Contact</a>
        </div>
        <h1>Hello World!</h1>
        <%-- Scriptlet --%>
        <p>Hello you've come from <% out.println("IP: " + request.getRemoteAddr()); %></p>
        
        <%@page import="java.util.Date" %>
        
        <%! Date date = new Date(); %>
        
        <p>Today is <%= date %></p>
    </body>
</html>
