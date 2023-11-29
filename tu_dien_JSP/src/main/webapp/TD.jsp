<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/21/2023
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
Map<String,String> map = new HashMap<>();
%>
<%
map.put("hello","xin chào");
map.put("what","cái j");
map.put("một","one");
PrintWriter writer = response.getWriter();
String tk = request.getParameter("tk");  //lấy dữ liệu trong ô input để sử dụng sử dụng
String result = map.get(tk);  //chuyền từ câ tìm vào trong map để kiê tra
if (result != null) {
    writer.println("từ nhập" + ":" + tk + "    ");
    writer.println("từ tìm thấy" + ":" + result);
}
else {
    writer.println("not null");
}
%>
</body>
</html>
