<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/form/form.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <div style="margin: auto;width: 240px">
            <form class="navy">
                <fieldset>
                    <legend>Nuevo Usuario</legend>
                    
                    <label style="width: 70px">Apellidos</label>
                    <input type="text" style="width: 120px" maxlength="50" 
                           name="apellidos"/>

                    <label style="width: 70px">Nombres</label>
                    <input type="text" style="width: 120px" maxlength="50" 
                           name="nombres"/>

                    <label style="width: 70px">Correo</label>
                    <input type="text" style="width: 120px" maxlength="50" 
                           name="correo"/>

                    <div class="submit">
                        <input type="submit" value="Enviar Datos"/>
                    </div>
                    
                </fieldset>
            </form>

            <p style="text-align: center">
                <a href="index.jsp">Cancelar</a>
            </p>
        </div>
    </body>
</html>

