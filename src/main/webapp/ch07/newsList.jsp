<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuC0mLASjC"
    crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>
    <title>뉴스 관리 앱</title>
</head>
<body>
<h2>News List</h2>
<hr>
<table>
    <tr>
        <th>id</th><th>제목</th><th>작성일자</th>
    </tr>
    <c:forEach var="news" items="${newsList}" varStatus="status">
        <tr>
            <td>${news.aid}</td>
            <td><a href="/news.nhn?action=info&id=${news.aid}">${news.title}</a></td>
            <td>${news.date}</td>
        </tr>
    </c:forEach>
    <a href="/news.nhn?action=addNews">추가하기</a>
</table>
</body>
</html>