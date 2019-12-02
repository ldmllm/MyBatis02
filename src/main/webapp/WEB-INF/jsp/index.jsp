<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h2>首页</h2>

<%--<div>--%>
    <%--<a href="<%=request.getContextPath()%>/news/toAdd">新闻新增</a>--%>
<%--</div>--%>
<%--<div>--%>
    <%--<a href="<%=request.getContextPath()%>/news/toEdit">新闻修改</a>--%>
<%--</div>--%>
<div>
    <a href="<%=request.getContextPath()%>/i18n/change"> <t:message code="language"/></a><br>
    <t:message code="yhzh.label"/><input/><br>
    <t:message code="yhmm.label"/><input/><br>
</div>
</body>
</html>
