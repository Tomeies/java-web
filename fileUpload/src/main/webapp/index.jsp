<%--
  Created by IntelliJ IDEA.
  User: johh
  Date: 2022/11/10
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>文件上传</title>
</head>
<body>

<form action="upload" method="post" enctype="multipart/form-data">
  <div>
    <h1>文件上传功能</h1>
  </div>
  <div>
    工号：<input name="sno">
  </div>
  <div>
    姓名：<input name="sname">
  </div>
  <div>
    上传文件：<input type="file" name="spicture">
  </div>
  <div>
    <input type="submit" value="上传">
  </div>
</form>
</body>
</html>