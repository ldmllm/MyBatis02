<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/28 0028
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/img/upload" enctype="multipart/form-data">
   文件上传： <input type="file" name="imgs">

<input type="file" name="imgs">

<input type="file" name="imgs"><br>
    <input type="submit" value="确定">
</form>
</body>
</html>
