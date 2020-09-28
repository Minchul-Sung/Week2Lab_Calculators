

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label>First:</label>
            <input type="number" name="fnumber" required><br>
            <label>Second:</label> 
            <input type="number" name="snumber" required><br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="*">
            <input type="submit" name="operator" value="%">
            <div>Result: ${resultMess}</div>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
