<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Contact</h1>
        <form method="post" action="submit_contact">
            <div>
                <label>Name:</label>
                <input type="text" name="name" />
            </div>
            <div>
                <label>Message:</label>
                <textarea name="message"></textarea>
            </div>
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
