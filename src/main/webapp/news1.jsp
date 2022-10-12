<%--
  Created by IntelliJ IDEA.
  User: astmkv
  Date: 11.10.2022
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    * {
        font-family: Arial, sans-serif;
    }

    body {
        background-image: url(images/1614390882_4-p-temnii-fon-na-noutbuke-4.jpg);
        background-repeat: no-repeat;
        background-size: cover;
    }

    #head {
        width: 80vw;
        height: 80vh;
        position: center;
        color: black;
        background: rgba(255, 255, 255, 0.5);
        margin: auto;
        padding: 2%;
    }

    h1 {
        text-align: center;
        margin: 0;
    }

    #listNews {
        width: 768px;
        height: 100px;
        color: black;
        margin: auto;
    }

    #new1 {
        background-image: url(images/news/загруженное3.png);
    }

    #new2 {
        background-image: url(images/news/загруженное.png);
    }

    #new3 {
        background-image: url(images/news/загруженное1.png);
    }

    #new4 {
        background-image: url(images/news/загруженное2.png);
    }

    .new > div {
        background-repeat: no-repeat;
        background-size: 100%;
        height: 100px;
        width: 100px;
    }

    .new {
        display: flex;
        text-align: center;
        margin: auto;
    }

    p {
        font-size: 22px;
    }
</style>
<head>
    <title>Title</title>
</head>
<body>
<div id="head">
    <h1>Новости Lenovo</h1>
    <form action="NewsServlet" method="post">
        <div id="listNews">
            <select name="choice_news">
            <option class="new" value="new1">
                <div id="new1">
                </div>
                <p>Lenovo стала «Парнером года» Microsoft в номинации Device Partner</p>
            </option>

            <option class="new" value="new2">
                <div id="new2">
                </div>
                <p>Новые устройства Lenovo — для работы, учебы, развлечений и отдыха</p>
            </option>

            <option class="new" value="new3">
                <div id="new3">
                </div>
                <p>Окунитесь в будущее с 16-дюймовым ThinkPad X1 Fold от Lenovo</p>
            </option>

            <option class="new" value="new4">
                <div id="new4">
                </div>
                <p>Новая линейка устройств Lenovo для гибридного формата работы</p>
            </option>
            </select>
            <button>
                view
            </button>
        </div>

    </form>
</div>
</body>
</html>
