<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<style>
    * {
        font-family: Arial, sans-serif;
    }

    body{
        background-image: url(images/1614390882_4-p-temnii-fon-na-noutbuke-4.jpg);
        background-repeat: no-repeat;
        background-size: cover;
    }

    header {
        height: 200px;
        margin-top: 40px;
    }

    #menu {
        text-align: center;
        height: 80%;
    }
    .menu-item {
        height: 80%;
        width: 22%;
        font-weight: bold;
        font-size: 30px;
        border-collapse: collapse;
        border-radius: 2%;
        list-style: none;
        color: white;
        padding: 0;
        background-color: transparent;
        line-height: 3.5;
        transition: all 1s;
        border: none;
    }
    .menu-item:hover  {
        z-index: 1;
        transform: scale(1.1);
        font-weight: bold;
        font-size: 32px;
        border: 1px solid white;
        box-shadow: 0 0 15px;
    }
    .menu-form{
        display: inline;
    }

    footer {
        font-family: Arial, sans-serif;
        background: rgba(255,255,255,0.3);
        position: absolute;
        bottom: 0;
        left: 0;
        right: 0;
        /*color: white;*/
        text-align: center;
    }

</style>
<header>
    <div id="menu">
        <form class="menu-form" action="genInfo.jsp">
        <button  class="menu-item" name="gen_info" id >
            GENERAL INFO
        </button>
        </form>
        <form class="menu-form" action="history.jsp" >
        <button class="menu-item">
            HISTORY
        </button>
        </form>
        <form class="menu-form"  action="news1.jsp">
        <button class="menu-item">
            NEWS
        </button>
        </form>
        <form class="menu-form" action="catalog.jsp">
        <button class="menu-item">
            MODELS
        </button>
        </form>
    </div>
</header>
<head>
    <title>Title</title>
</head>
<body>
<footer>
    <p class="text-footer">Created by Tymkiv Artur for Top.Academy</p>
    <p class="text-footer">Penza 2022</p>
</footer>
</body>

</html>