<%-- 
    Document   : novo
    Created on : 06/09/2013, 13:08:07
    Author     : Everton
--%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/jspf/template/_header.jspf" />
        <title>Controle de Notas</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="/WEB-INF/jspf/template/_body.jspf" />
            <h1>Novo Aluno</h1>
            <jsp:include page="/WEB-INF/jspf/aluno/_form.jsp" flush="true">
                <jsp:param name="action" value="#" />
                <jsp:param name="btn" value="Salvar" />
            </jsp:include>
        </div>
        <jsp:include page="/WEB-INF/jspf/template/_footer.jspf" />
    </body>
</html>