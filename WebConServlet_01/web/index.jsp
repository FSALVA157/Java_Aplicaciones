

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/form.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <h1>FORMULARIO DE PRUEBA</h1>
        <form class="form-table" method = "POST" action="ServletDatos">
            <input type="text" name="nombre" /> <br/>
            <input type="submit" value = "Enviar Datos"/>
            
        </form>
    </body>
</html>
