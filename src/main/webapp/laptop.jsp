<%--@elvariable id="url1" type="com"--%>
<%--
  Created by IntelliJ IDEA.
  User: astmkv
  Date: 09.10.2022
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>

</style>
<head>
    <title>Title</title>
</head>
<body>
<form action="LaptopServlet" method="post">
<div style="background-image: url(${url1}); width: 200px; height: 200px; display: inline-block"></div>
<div style="background-image: url(${url2}); width: 200px; height: 200px; display: inline-block"></div>
<div style="background-image: url(${url2}); width: 200px; height: 200px; display: inline-block"></div>
Model: <p name="text" >${model}</p>
OS: <p name="text" >${os}</p>
Processor: <p name="text" >${proc}</p>
Memory: <p name="text" >${memory}</p>
Display: <p name="text" >${display}</p>
</form>
</body>
</html>
