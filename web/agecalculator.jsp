<%-- 
    Document   : agecalculator
    Created on : Jan 20, 2020, 1:26:17 PM
    Author     : 799229
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form>
                <b>Enter your age: </b><input type="text" name="age"/><br>
                <input type="submit" value="Age next birthday"/><br>
            </form>
        </div>
        ${message}
        <a href=""><b>Arithmetic Calculator</b></a>
    </body>
</html>
