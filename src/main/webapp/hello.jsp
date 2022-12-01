<%--
  Created by IntelliJ IDEA.
  User: Mac
  Date: 2022-12-01
  Time: 08:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      System.out.println("test jsp" );

    %>
    ${lists};
<c:forEach items="${lists}" var="l">
    ${l}
</c:forEach>

</body>
</html>
