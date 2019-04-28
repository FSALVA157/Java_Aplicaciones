<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SpringForm - Result</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.css" type="text/css" media="all" />
    </head>
    <body>
        <div class="content">
        <h1>SpringForm - Result</h1>
        <table>
            <tr>
                <td><b>Username:</b> ${personaForm.username}</td>
            </tr>
            <tr>
                <td><b>Password:</b> ${personaForm.password}</td>
            </tr>
            <tr>
                <td><b>Email:</b> ${personaForm.email}</td>
            </tr>
        </table>        
        <a href="${pageContext.request.contextPath}/persona/register">Registrar otra persona</a>
        </div>
    </body>
</html>
