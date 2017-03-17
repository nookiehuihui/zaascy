<%--
  Created by IntelliJ IDEA.
  Date: 2017/3/15
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>IDEA搭建SpringMVC并用maven配置的小例子</title>

</head>
<body>

    <div>
        你已经搭建成功SpringMVC框架了，真的吗，是吗
    </div>

    <div>
        你成功新增了<c:out value="${id}" default="0" escapeXml="false"/>条记录,记录id为<c:out value="${ids}" default="0" escapeXml="false"/>

    </div>
</body>
</html>
