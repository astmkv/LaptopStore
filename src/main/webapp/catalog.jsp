<%--
  Created by IntelliJ IDEA.
  User: astmkv
  Date: 09.10.2022
  Time: 20:42
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

    .head {
        width: 80%;
        height: 80%;
        position: center;
        color: black;
        background: rgba(255, 255, 255, 0.5);
        margin: auto;
        padding: 2%;
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
        justify-content: space-evenly;
        align-items: center;
    }

    .model {
        display: flex;
        flex-direction: column;
        width: 30%;
    }
</style>
<head>
    <title>Title</title>
</head>
<body>
<form action="LaptopServlet" method="post">
    <div class="head">
        <select name="choice_model">
            <option class="model" id="model1" value="m13">
                Lenovo 13
            </option>

            <option class="model" id="model2" value="m110-15">
                Lenovo 110-15
            </option>

            <option class="model" id="model3" value="m120-14">
                Lenovo 120-14
            </option>

            <option class="model" id="model4" value="m300-15">
                Lenovo 300-15
            </option>
            <option class="model" id="model5" value="m320-14">
                Lenovo 320-14
            </option>
        </select>
        <button>
            view
        </button>
    </div>
</form>
</body>
</html>
