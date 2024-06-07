<%--
  Created by IntelliJ IDEA.
  Estudiante: Dario Verdezoto
  Date: 06/06/2024
  Version: 2.0
  Detalle: Formulas del MRUV
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="web.modelo.Cliente" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>

</head>
<body>
<h2>Resultado del Crédito</h2>
<%
    Cliente cliente = (Cliente) session.getAttribute("cliente");
    if (cliente != null) {
%>
<p>Cliente: <%= cliente.getNombre() %></p>
<p>Sexo: <%= cliente.getSexo() %></p>
<p>Edad: <%= cliente.getEdad() %></p>
<p>Sueldo Mensual: <%= cliente.getSueldo() %></p>
<p>Monto del Crédito: $<%= cliente.getMontoCredito() %></p>
<p>Plazo: <%= cliente.getPlazo() %> meses</p>
<p>Total: $<%= cliente.getMontoCredito() * (1 + cliente.getInteres()) %></p>
<p>Pagos de: $<%= cliente.getPagoMensual() %> mensuales</p>
<form action="${pageContext.request.contextPath}/index.jsp" method="post">
    ¿Desea calcular otro monto? <input type="submit" value="Si/No">
</form>
<%
    } else {
        response.sendRedirect("index.jsp");
    }
%>
</body>
</html>
