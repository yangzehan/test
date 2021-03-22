<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/22 0022
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="get">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td>sex</td>
            <td><input type="text" name="sex"></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
            <td><input type="reset" name="清除"></td>
        </tr>
    </table>
</form>
</body>
</html>
