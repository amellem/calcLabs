<%-- 
    Document   : lab2
    Created on : Feb 4, 2017, 9:58:55 PM
    Author     : Aerius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab #2</title>
    </head>
    <body>
        <h1>Let's calculate the area of your rectangle!</h1>
        <div>
            <form id="form1" name="form1" method="POST" action="labTwo">
                <input type="text" name="length" id="length" placeholder="Length" required="true">
                <input type="text" name="width" id="width" placeholder="Width" required="true">
                <input type="submit" value="Calculate">
            </form>
            <h2>The calculated area of your rectangle is: ${rectangleAreaTwo}</h2>
        </div>
    </body>
</html>
