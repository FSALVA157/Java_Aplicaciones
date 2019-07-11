<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AprendeJAVA</title>
        <style type="text/css">
            body {
                font-size: .7em
            }
        </style>
        <link href="../../tema10/table.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>

        <div id="caja" style="margin: auto;width: 760px">
            <table class="navy">
                <caption>Lista de Profesores</caption>

                <thead>
                    <tr>
                        <td>Profesor</td>
                        <td>Nacimiento</td>
                        <td>Direcci&oacute;n</td>
                        <td>Referencia</td>
                        <td>Genero</td>
                        <td>Activo</td>
                        <th style="width: 26px">
                            <a href="#" onclick="js_ins()">
                                <img src="../../tema10/images/ins.png" 
                                     alt="Nuevo"/>
                            </a>
                        </th>
                        <th style="width: 26px">
                            <a href="#" onclick="js_del()">
                                <img src="../../tema10/images/del.png" 
                                     alt="Retirar"/>
                            </a>
                        </th>
                        <th style="width: 26px">
                            <a href="#" onclick="js_upd()">
                                <img src="../../tema10/images/upd.png" 
                                     alt="Actualizar"/>
                            </a>
                        </th>
                    </tr>
                </thead>

                <tfoot>
                    <tr>
                        <th colspan="9">Java Web - AprendeJAVA</th>
                    </tr>
                </tfoot>

                <tbody>
                    <c:forEach var="p" items="${list}">
                        <tr>
                            <td>${p.appaterno} ${p.apmaterno}, ${p.nombres}</td>
                            <td>${p.nacimiento}</td>
                            <td>${p.direccion}</td>
                            <td>${p.referencia}</td>
                            <td>${p.genero}</td>
                            <td colspan="2">${p.estado}</td>
                            <th>
                                <input type="checkbox" value="${p.idprofesor}" 
                                       name="chk_del"/>
                            </th>
                            <th>
                                <input type="radio" value="${p.idprofesor}" 
                                       name="rad_upd"/>
                            </th>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

