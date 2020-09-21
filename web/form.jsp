<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/javaweb_day04_1/d1" method="post">
        <input type="hidden" name="method" value="run2"/>
        用户名：<input type="text" name="username"/><br/>
        密码：<input type="password" name="pwd"/><br/>
        爱好：<input type="checkbox" name="hobby" value="run"/>跑步
        <input type="checkbox" name="hobby" value="code"/>编码
        <input type="checkbox" name="hobby" value="swim"/>游泳<br/>
        <input type="submit"/>
    </form>
</body>
</html>
