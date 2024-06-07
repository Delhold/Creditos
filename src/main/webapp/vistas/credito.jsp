<%@ page import="web.modelo.Cliente" %><%--
  Created by IntelliJ IDEA.
  Estudiante: Dario Verdezoto
  Date: 30/5/2024
  Version: 2.0
  Detalle: Formulas del MRUV
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Credito al Cliente</title>

</head>
<body>
<h2>Credito del Cliente</h2>
<form action="${pageContext.request.contextPath}/CreditoServlet"method="post">
    Monto de Credito: <input type="number" name="monto" required>
    Plazo:
    <select name="plazo">
        <option value="12">12 Meses</option>
        <option value="24">24 Meses</option>
        <option value="36">36 Meses</option>
        <option value="60">60 Meses</option>
    </select> <br>
    <input type="submit" value="Calcular">
</form>
</body>
</html>
