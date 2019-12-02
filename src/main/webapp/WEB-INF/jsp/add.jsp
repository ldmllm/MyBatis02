<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/27 0027
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻新增</title>
    <%@include file="head.jsp"%>
</head>
<body>
<h1>新闻新增<%=System.currentTimeMillis()%></h1>
<div>
    ${clasList}
</div>
<f:form modelAttribute="news" action="${ctx}/news/add" method="post">

    <div>newsId: <f:input path="newsId"/><f:errors path="newsId" cssStyle="color: red" /></div>
    <div>title:<f:input path="title"/><f:errors path="title" cssStyle="color: red" /></div>
    <input type="submit" value="确定  " />

</f:form>
</body>
</html>
