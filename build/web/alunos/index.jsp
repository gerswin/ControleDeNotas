<%-- 
    Document   : index
    Created on : 11/09/2013, 19:35:23
    Author     : FIC
--%>
<%@page import="com.snowfox.helpers.AlunoHelper"%>
<%@page import="com.snowfox.models.Aluno"%>
<%@page import="com.snowfox.dao.AlunoDao"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/jspf/template/_header.jspf" />
        <title>Controle de Notas</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="/WEB-INF/jspf/template/_body.jspf" />
            <h1>Listagem de Alunos</h1>
            <table class="table table-striped table-hover table-condensed">
                <tr>
                    <td>Matrícula</td>
                    <td>Nome</td>
                    <td>Curso</td>
                </tr>
                <% for(Aluno a : AlunoDao.getInstance().select()) { %>
                <tr>
                    <td><%= AlunoHelper.getMatricula(a) %></td>
                    <td><%= AlunoHelper.getNome(a) %></td>
                    <td><%= AlunoHelper.getCurso(a) %></td>
                </tr>
                <% } %>
            </table>
        </div>
        <jsp:include page="/WEB-INF/jspf/template/_footer.jspf" />
    </body>
</html>