<%
    String producto = request.getParameter("producto");
    String categoria = request.getParameter("Categoria");
    String existencia = request.getParameter("existencia");
    String precio = request.getParameter("precio");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Producto Registrado</h1>
        <p>Los datos recibidos son: </p>
        <p>Producto: <%= producto%></p>
        <p>Categoria: <%= categoria%></p>
        <p>Existencia: <%= existencia%></p>
        <p>Precio: <%= precio%></p>
        <a href="index.jsp">volver al inicio</a>
    </body>
</html>