package com.snowfox.models;

import com.snowfox.dao.CursoDao;

/**
 *
 * @author Fic
 */
public class Aluno {
    
    private int matricula;
    private String nome;
    private String endereco;
    private String cpf;
    private int curso;

    public Aluno(int matricula, String nome, String endereco, String cpf, int curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public Curso getCurso() {
        return CursoDao.getInstance().selectOne(this.curso);
    }
    
}
