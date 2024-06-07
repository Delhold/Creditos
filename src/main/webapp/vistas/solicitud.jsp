<%--
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
    <title>Solicitud  al Cliente</title>

</head>
<body>
<h2>Solicitud de Cliente</h2>
<form action="${pageContext.request.contextPath}/SolicitudServlet" method="post">
    Nombre: <input type="text" name="nombre" required><br>
    Sexo: <input type="text" name="sexo" required><br>
    Edad: <input type="number" name="edad" required><br>
    Sueldo: <input type="number" name="sueldo" required><br>
    <input type="submit" value="Enviar">
</form>
</body>
</html>
