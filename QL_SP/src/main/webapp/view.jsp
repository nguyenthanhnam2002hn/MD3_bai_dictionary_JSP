<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Quantity: </td>
        <td>${requestScope["product"].getQuantity()}</td>
    </tr>
    <tr>
        <td>title: </td>
        <td>${requestScope["product"].getTitle()}</td>
    </tr>
    <tr>
        <td>img: </td>
        <td>${requestScope["product"].getImg()}</td>
    </tr>

</table>
</body>
</html>
