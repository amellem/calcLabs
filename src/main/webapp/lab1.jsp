<%-- 
    Document   : lab1
    Created on : Jan 31, 2017, 11:11:22 PM
    Author     : Aerius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab #1</title>
    </head>
    <body>
        <h1>Let's calculate the area of your rectangle!</h1>
        <div>
            <form id="form1" name="form1" method="POST" action="rectangleArea">
                <input type="text" name="length" id="length" placeholder="Length" required="true">
                <input type="text" name="width" id="width" placeholder="Width" required="true">
                <input type="submit" value="Calculate">
            </form>
        </div>
    </body>
</html>
