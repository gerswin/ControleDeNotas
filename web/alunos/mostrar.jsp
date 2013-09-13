<%-- 
    Document   : mostrar
    Created on : 11/09/2013, 19:44:07
    Author     : FIC
--%>
<%@page import="com.snowfox.models.Aluno"%>
<%@page import="com.snowfox.dao.AlunoDao"%>
<%@page import="com.snowfox.helpers.AlunoHelper"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/jspf/template/_header.jspf" />
        <title>Controle de Notas</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="/WEB-INF/jspf/template/_body.jspf" />
            <% Aluno a = AlunoDao.getInstance().selectOne((Integer)request.getAttribute("id")); %>
            <h1>Exibir Alunos: <%= AlunoHelper.getNome(a) %></h1>
            <dl>
                <dt>Matrícula:</dt>
                <dd><%= AlunoHelper.getMatricula(a) %></dd>
                <dt>Endereço:</dt>
                <dd><%= AlunoHelper.getEndereco(a) %></dd>
                <dt>CPF:</dt>
                <dd><%= AlunoHelper.getCpf(a) %></dd>
                <dt>Curso:</dt>
                <dd><%= AlunoHelper.getCurso(a) %></dd>
            </dl>
        </div>
        <jsp:include page="/WEB-INF/jspf/template/_footer.jspf" />
    </body>
</html>