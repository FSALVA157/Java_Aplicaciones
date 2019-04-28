<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SpringForm - Register</title>                
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.css" type="text/css" media="all" />
    </head>
    <body>
        <div class="content">
        <h1>SpringForm - Register</h1>
        <form:form modelAttribute="personaForm" method="POST" action="${pageContext.request.contextPath}/persona/action">
            <table>
                <tr>
                    <td><b>Username:</b></td>
                    <td><form:input path="username" /></td> 
                    <td><form:errors path="username" style="color: red;" /></td>
                </tr>
                <tr>
                    <td><b>Password:</b></td>
                    <td><form:input path="password" /></td> 
                    <td><form:errors path="password" style="color: red;" /></td>
                </tr>
                <tr>
                    <td><b>Email:</b></td>
                    <td><form:input path="email" /></td>
                    <td><form:errors path="email" style="color: red;" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Registrar" /> </td>
                    <td></td>
                </tr>
            </table>
        </form:form>
        </div>
    </body>
</html>