<%--
  Created by IntelliJ IDEA.
  User: Techcare
  Date: 6/8/2020
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency converter</title>
    <%--      <link rel="stylesheet" type="text/css" href="css/style.css">--%>
</head>
<body>
<h3>Currency converter</h3>
<form action="/convert" method="post">
    <label>Rate:</label><br/>
    <input type="text" name="rate" placeholder="Rate" value="22000"/><br/>
    <label>USD:</label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>
