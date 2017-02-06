<%-- 
    Document   : lab3
    Created on : Feb 4, 2017, 10:00:44 PM
    Author     : Aerius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab #3</title>
    </head>
    <body>
        <h1>Lab #3</h1>
        <div>
            <h2>Lets calculate the area of a rectangle!</h2>
            <div style="height: 10em">
                <img src="images/rectangle.png">
            </div>
            <form id="form1" name="form1" method="POST" action="CalculatorLabThreeController?calcType=rectangle">
                <label for="length">Length</label>
                <input type="text" name="length" id="length" placeholder="Length" required="true">
                <label for="width">Width</label>
                <input type="text" name="width" id="width" placeholder="Width" required="true">
                <input type="submit" value="Calculate">
            </form>
        </div>
        <div>
            <h3>The calculated area of your rectangle is: ${rectangleAreaThree}</h3><br>
            <h2>Lets calculate the area of a circle!</h2>
            <div style="height: 10em">
                <img src="images/circle.png">
            </div>
            <form id="form2" name="form2" method="POST" action="CalculatorLabThreeController?calcType=circle">
                <label for="radius">Radius</label>
                <input type="text" name="radius" placeholder="Radius" required="true">
                <input type="submit" value="Calculate">
            </form>
        </div>
        <div>    
            <h3>The calculated area of your circle is: ${circleArea}</h3><br>
            <div>
            <h2>Lets find the hypotenuse of a triangle!</h2>
            <div style="height: 10em">
                <img src="images/hypotenuse.gif">
            </div>
            <form id="form3" name="form3" method="POST" action="CalculatorLabThreeController?calcType=hypotenuse">
                <label for="leg1">Leg 1</label>
                <input type="text" name="leg1" placeholder="Leg 1" required="true">
                <label for="leg2">Leg 2</label>
                <input type="text" name="leg2" placeholder="Leg 2" required="true">
                <input type="submit" value="Calculate">
            </form>
            <h3>The hypotenuse of your triangle is: ${hypotenuse}</h3>
        </div>
        </div>
        
    </body>
</html>
