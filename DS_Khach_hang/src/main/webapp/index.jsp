<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
</head>
<h2>Danh sách khách hàng</h2>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>năm sinh</th>
        <th>quê quán</th>
        <th>ảnh</th>
    </tr>
    <c:forEach var="students" items="${student}">
        <tr>
            <td>${students.name}</td>
            <td>${students.ns}</td>
            <td>${students.dc}</td>
            <td>${students.img}</td>
        </tr>
    </c:forEach>
    <!-- Your customer data will go here -->
</table>
</body>
</html>
<body>