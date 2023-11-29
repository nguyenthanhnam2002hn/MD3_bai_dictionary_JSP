<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/21/2023
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
float rate = Float.parseFloat(request.getParameter("rate"));
float use = Float.parseFloat(request.getParameter("usd"));
float kq = rate * use;
%>
<h1>rate: <%=rate%></h1>
<h1>usd: <%=use%>></h1>
<h1>kq: <%=kq%>></h1>
</body>
</html>
