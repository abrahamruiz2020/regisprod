<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de productos</h1>
        <form action="salida.jsp" method="POST">
            <label>Producto:</label>
            <input type="text" name="producto" value="" />
            <br><br>
            <label>Categoria:</label>
            <select name="Categoria">
                <option>MEMORIAS RAM</option>
                <option>MONITORES</option>
                <option>PLACA MADRE</option>
                <option>DISCO DURO</option>
                <option>FUENTE DE PODER</option>
                <option>SSD</option>
                <option>TECLADOS</option>
                <option>MOUSE</option>
                <option>PARLANTES</option>
            </select>
            <br><br>
             <label>Existencia:</label>
            <input type="text" name="existencia" value="" />
            <br><br>
             <label>Precio:</label>
            <input type="text" name="precio" value="" />
            <br><br>
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>