<%--@elvariable id="url2" type=""--%>
<%--@elvariable id="text" type="com"--%>
<%--@elvariable id="url1" type="com"--%>
<%--
  Created by IntelliJ IDEA.
  User: astmkv
  Date: 12.10.2022
  Time: 8:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="NewsServlet" method="post">
<div class="head">
    <h1>НОВОСТИ</h1>

    <p name="text" >${text}</p>
    <div style="background-image: url(${url1}); width: 200px; height: 200px; display: inline-block"></div>
    <div style="background-image: url(${url2}); width: 200px; height: 200px; display: inline-block"></div>
    </div>
</div>
</form>
</body>
</html>
