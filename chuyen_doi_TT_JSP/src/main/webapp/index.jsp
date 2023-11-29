<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h2>chuyển đổi tiền tệ băn JSP</h2>
<form action="kq.jsp" method="post">
  <label>rate :</label><br>
  <input type="text" name="rate" placeholder="rate" value="23000"><br>
  <label>USD :</label><br>
  <input type="text" name="usd" placeholder="usd"><br>
  <input type="submit" id="submit" value="click me!">
</form>
</body>
</html>