<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 22, 2020, 5:44:28 PM
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
        <h1>Arithmetic Calculator</h1>
        <div>
            <form>
                <b>First: </b><input type="text" name="first"/><br>
                <b>Second: </b><input type="text" name="second"/><br>
                <input type="submit" value="+" name="operator"/>
                <input type="submit" value="-" name="operator"/>
                <input type="submit" value="*" name="operator"/>
                <input type="submit" value="/" name="operator"/><br>
            </form>
        </div>
        <b>Result: </b>${result}<br>
        <a href="/Week02Lab_Calculators/age"><b>Age Calculator</b></a>
    </body>
</html>
