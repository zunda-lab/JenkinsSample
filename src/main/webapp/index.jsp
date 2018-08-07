<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI判定</title>
</head>
<body>
    <h1>BMI判定</h1>
    <form action="/JenkinsSample/BmiCheck" method="post">
        身長(cm)：<input type="text" name="height"><br> 体重(kg)：<input
            type="text" name="weight"><p> <input type="submit"
            value="判定"></p>
    </form>
</body>
</html>