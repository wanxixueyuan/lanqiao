<%--
  Created by IntelliJ IDEA.
  User: wei62_000
  Date: 2017/6/22
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="userLogIn" >
        <table cellpadding="0" cellspacing="18px">
            <tr>
                <td>帐号：</td>
                <td><input type="text" name="name" placeholder="请输入用户名。。。"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password" placeholder="请输入密码。。。"/></td>
            </tr>
            <tr>
                <td align="center" colspan="2"><input type="submit" value="登录"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
