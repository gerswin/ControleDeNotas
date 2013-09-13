package com.snowfox.models;

import com.snowfox.dao.CursoDao;
import com.snowfox.dao.DisciplinaDao;

/**
 *
 * @author Everton
 */
public class Turma {
    
    private int id;
    private int curso;
    private int disciplina;
    private boolean ativo;

    public Turma(int id, int curso, int disciplina, boolean ativo) {
        this.id = id;
        this.curso = curso;
        this.disciplina = disciplina;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public Curso getCurso() {
        return CursoDao.getInstance().selectOne(this.curso);
    }

    public Disciplina getDisciplina() {
        return DisciplinaDao.getInstance().selectOne(this.disciplina);
    }

    public boolean isAtivo() {
        return ativo;
    }
    
}
