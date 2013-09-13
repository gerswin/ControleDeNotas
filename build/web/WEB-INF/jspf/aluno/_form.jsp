<%@page import="com.snowfox.helpers.AlunoHelper"%>
<%@page import="com.snowfox.models.Aluno" %>
<%@page import="com.snowfox.dao.AlunoDao"%>
<% Aluno a = null;//AlunoDao.getInstance().selectOne((Integer)request.getAttribute("id")); %>
<form action="<jsp:expression>request.getParameter("action")</jsp:expression>" method="post" class="form-horizontal" role="form">
    <div class="form-group">
        <label for="matricula" class="col-lg-2 control-label">Matrícula:</label>
        <div class="col-lg-6">
            <input type="text" class="form-control" id="matricula" name="matricula" placeholder="" value="<%= AlunoHelper.getMatricula(a) %>">
        </div>
    </div>
    <div class="form-group">
        <label for="nome" class="col-lg-2 control-label">Nome:</label>
        <div class="col-lg-6">
            <input type="text" class="form-control" id="nome" name="nome" placeholder="" value="<%= AlunoHelper.getNome(a) %>">
        </div>
    </div>
    <div class="form-group">
        <label for="endereco" class="col-lg-2 control-label">Endereço:</label>
        <div class="col-lg-6">
            <input type="text" class="form-control" id="endereco" name="endereco" placeholder="" value="<%= AlunoHelper.getEndereco(a) %>">
        </div>
    </div>
    <div class="form-group">
        <label for="cpf" class="col-lg-2 control-label">CPF:</label>
        <div class="col-lg-6">
            <input type="text" class="form-control" id="cpf" name="cpf" placeholder="" value="<%= AlunoHelper.getCpf(a) %>">
        </div>
    </div>
    <div class="form-group">
        <label for="curso" class="col-lg-2 control-label">Curso:</label>
        <div class="col-lg-6">
            <select class="form-control" id="curso" name="curso" value="<%= AlunoHelper.getCurso(a) %>">
                <option>###</option>
                <option>@@@</option>
                <option>$$$</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-primary"><jsp:expression>request.getParameter("btn")</jsp:expression></button>
            <button type="reset" class="btn btn-default">Limpar</button>
            <button type="button" class="btn btn-link">Cancelar</button>
        </div>
    </div>
</form>