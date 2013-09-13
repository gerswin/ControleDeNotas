package com.snowfox.models;

import com.snowfox.dao.TurmaDao;
import java.util.Date;

/**
 *
 * @author Fic
 */
public class Avaliacao {
    
    private int id;
    private int turma;
    private Date data_realizacao;
    private float nota_max;
    private float nota_min;

    public Avaliacao(int id, int turma, Date data_realizacao, float nota_max, float nota_min) {
        this.id = id;
        this.turma = turma;
        this.data_realizacao = data_realizacao;
        this.nota_max = nota_max;
        this.nota_min = nota_min;
    }

    public int getId() {
        return id;
    }

    public Turma getTurma() {
        return TurmaDao.getInstance().selectOne(this.turma);
    }

    public Date getData_realizacao() {
        return data_realizacao;
    }

    public float getNota_max() {
        return nota_max;
    }

    public float getNota_min() {
        return nota_min;
    }
    
}
