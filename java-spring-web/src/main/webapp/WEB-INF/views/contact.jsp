<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Contact</h1>
        <form:form method="post" action="../ion/message" modelAttribute="contact">
            <div>
                <label>Name:</label>
                <form:input path="name" />
            </div>
            <div>
                <label>Message:</label>
                <form:textarea path="message"></form:textarea>
            </div>
            <button type="submit">Submit</button>
        </form:form>
    </body>
</html>
