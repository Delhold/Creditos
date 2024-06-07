<%--
  Created by IntelliJ IDEA.
  User: Estudiante
  Date: 7/6/2024
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Solicitud de Credito</title>
</head>
<body>
<h2>Menú Principal</h2>
<form action="${pageContext.request.contextPath}/vistas/solicitud.jsp" method="post">
    <input type="submit" value="Solicitud">
</form>
<form action="${pageContext.request.contextPath}/vistas/credito.jsp" method="post">
    <input type="submit" value="Crédito">
</form>
</body>
</html>
