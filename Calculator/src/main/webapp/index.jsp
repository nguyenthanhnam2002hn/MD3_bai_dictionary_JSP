<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Bảng tính</h2>
<form action="x" method="post">
    <input type="text" name="gt1" placeholder="nhập :"><br>
    <select name="q">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select><br>
    <input type="text" name="gt2" placeholder="nhập :"><br>
    <input type="submit" id="submit" value="click me!">
</form>
</body>
</html>