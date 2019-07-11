<%-- 
    Document   : salida
    Created on : 03-jul-2019, 0:35:59
    Author     : xxavier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DATOS RECIBIDOS</h1>
        <table style="margin: auto">
            <tbody>
                <tr>
                    <td>nombre</td>
                    <td>${nombre}</td>
                </tr>
                <tr>
                    <td>genero</td>
                    <td>${genero}</td>
                </tr>
                <tr>
                    <td>estudios</td>
                    <td>${estudios}</td>
                </tr>
                <tr>
                    <td>deportes</td>
                    <td>${deportes}</td>
                </tr>
                <tr>
                    <td>pasatiempos</td>
                    <td>${pasatiempos}</td>
                </tr>
            </tbody>
        </table>
                <p style="text-align: center">
                    <a href="index.jsp">Volver</a>
                </p>
    </body>
</html>
