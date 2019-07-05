

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
            <fieldset>
                <legend>Ingreso de Datos</legend>
                <div class="fila">
                    <label class="celda" style="width: 80px">Nombre</label>
                    <div class="celda">
                        <input type="text" name="nombre" style="width: 180px">
                    </div>
                  </div>
                
                <div class="separator"></div>
                
                <div class="fila">
                    <label class="celda" style="width: 80px">Género</label>
                    <div class="celda">
                        <input type="radio" name="genero" value="Masculino" checked>Masculino <br>
                        <input type="radio" name="genero" value="Femenino">Femenino
                     </div>
                </div>
                
                <div class="separator"></div>
                                
            <input type="submit" value = "Enviar Datos"/>
            </fieldset>
        </form>
    </body>
</html>
