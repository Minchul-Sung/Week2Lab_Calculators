<%-- 
    Document   : agecalculator
    Created on : Sep 26, 2020, 11:03:03 PM
    Author     : Min Chul, Sung [808360]
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    
    <body>
        <h1>Age Calculator</h1>

        <form action="age" method="POST">
            <label>Enter your age:</label>
            <input type="number" name="enterAge" required>
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            <div>${resultMess}</div>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>  
</html>
