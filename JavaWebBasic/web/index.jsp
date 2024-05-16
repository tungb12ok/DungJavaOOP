<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index" method="get">
            Number1:
            <input type="text" name="number1" value="${num1}" />
            </br>
            </br>
            Number2:
            <input type="text" name="number2" value="${num2}" />
            </br>
            </br>
            Result: 
            <input type="text" name="result" value="${rls}" />
            </br>
            <input type="submit" value="submit" />
        </form>
    </body>
</html>
