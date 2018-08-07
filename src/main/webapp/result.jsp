<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.zunda_lab.jenkins_sample.model.BmiBean"%>
<%
    //リクエストスコープに保存されたHealthBeanインスタンスを取得
    BmiBean health = (BmiBean) request.getAttribute("health");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI判定結果</title>
</head>
<body>
    <h1>BMI判定結果</h1>
    <p>
        身長(cm)：<%=health.getHeight()%><br> 体重(kg)：<%=health.getWeight()%><br>
        BMI：<%=health.getBmi()%><br> 判定結果：<%=health.getBodyType()%>
    </p>
    <a href="/JenkinsSample">戻る</a>
</body>
</html>