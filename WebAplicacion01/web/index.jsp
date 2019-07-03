<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/form.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <form class="form-table" action="RecibirDatos">
            <fieldset>
                <legend>Ingreso de Datos</legend>

                <div class="fila">
                    <label class="celda" style="width: 80px">Nombre</label>
                    <div class="celda">
                        <input type="text" name="nombre" style="width: 180px">
                    </div>
                </div>

                <div class="fila separator"></div>

                <div class="fila">
                    <label class="celda" style="width: 80px">Género</label>
                    <div class="celda">
                        <input type="radio" name="genero" value="Masculino" 
                               checked> Masculino<br>
                        <input type="radio" name="genero" 
                               value="Femenino"> Femenino
                    </div>
                </div>

                <div class="fila separator"></div>

                <div class="fila">
                    <label class="celda" style="width: 80px">Estudios</label>
                    <div class="celda">
                        <select name="estudios" style="width: 180px">
                            <option value="Secundaria">Secundaria</option>
                            <option value="Superior">Superior</option>
                            <option value="PostGrado">PostGrado</option>
                        </select>
                    </div>
                </div>

                <div class="fila separator"></div>

                <div class="fila">
                    <label class="celda" style="width: 80px">Deportes</label>
                    <div class="celda">
                        <div class="celda" style="width: 90px">
                            <input type="checkbox" name="deportes" 
                                   value="Football"> Football<br>
                            <input type="checkbox" name="deportes" 
                                   value="Karate"> Karate
                        </div>
                        <div class="celda">
                            <input type="checkbox" name="deportes" 
                                   value="Ciclismo"> Ciclismo<br>
                            <input type="checkbox" name="deportes" 
                                   value="Voley"> Voley
                        </div>
                    </div>
                </div>

                <div class="fila separator"></div>

                <div class="fila">
                    <label class="celda" style="width: 80px">
                        Pasatiempos</label>
                    <div class="celda">
                        <select name="pasatiempos" style="width: 180px"
                                size="4" multiple>
                            <option value="Jugar Ajedrez">
                                Jugar Ajedrez</option>
                            <option value="Juegos de Pinball">
                                Juegos de Pinball</option>
                            <option value="Algo de Cocina">
                                Algo de Cocina</option>
                            <option value="Ver Películas">
                                Ver Películas</option>
                            <option value="Lecturas Variadas">
                                Lecturas Variadas</option>
                            <option value="Escuchar Música">
                                Escuchar Música</option>
                        </select>
                    </div>
                </div>

                <div class="fila separator"></div>

                <div class="fila center">
                    <input type="submit" value="Enviar Datos">
                </div>
            </fieldset>
        </form>
    </body>
</html>
