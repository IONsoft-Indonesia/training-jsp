<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="messages" value="Hello, World" />
        
        <c:forEach items="${messages}" var="message">
            <c:if test="${message == 'Hello'}">
                <p><b>${message}</b></p>
            </c:if>
            <p>${message}</p>
            <p>Length: ${fn:length(message)}</p>
        </c:forEach>
    </body>
</html>
