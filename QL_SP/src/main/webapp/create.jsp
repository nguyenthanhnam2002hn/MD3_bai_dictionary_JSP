<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Products information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>price: </td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td>quantity: </td>
                <td><input type="text" name="quantity" id="quantity"></td>
            </tr>
            <tr>
                <td>title: </td>
                <td><input type="text" name="title" id="title"></td>
            </tr>
            <tr>
                <td>img: </td>
                <td><input type="text" name="img" id="img"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Click me!"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>