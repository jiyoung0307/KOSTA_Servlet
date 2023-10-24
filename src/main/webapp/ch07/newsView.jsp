<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>뉴스 상세 보기</title>
</head>
<body>
<h2>News 상세정보</h2>
<ul>
    <li>id : ${news.aid}</li>
    <li>maker : ${news.title}</li>
     <li>maker : ${news.img}</li>
    <li>price : ${news.date}</li>
    <li>date : ${news.content}</li>
</ul>

</body>
</html>