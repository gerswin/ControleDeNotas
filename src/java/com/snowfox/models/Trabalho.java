package com.snowfox.models;

import com.snowfox.dao.AvaliacaoDao;
import com.snowfox.dao.TurmaDao;
import java.util.Date;

/**
 *
 * @author Everton
 */
public class Trabalho {
    
    private int id;
    private int turma;
    private int avaliacao;
    private Date data_entrega;
    private float nota_max;
    private float nota_min;
    private boolean nota_extra;

    public Trabalho(int id, int turma, int avaliacao, Date data_entrega, float nota_max, float nota_min, boolean nota_extra) {
        this.id = id;
        this.turma = turma;
        this.avaliacao = avaliacao;
        this.data_entrega = data_entrega;
        this.nota_max = nota_max;
        this.nota_min = nota_min;
        this.nota_extra = nota_extra;
    }

    public int getId() {
        return id;
    }

    public Turma getTurma() {
        return TurmaDao.getInstance().selectOne(this.turma);
    }

    public Avaliacao getAvaliacao() {
        return AvaliacaoDao.getInstance().selectOne(this.avaliacao);
    }

    public Date getData_entrega() {
        return data_entrega;
    }

    public float getNota_max() {
        return nota_max;
    }

    public float getNota_min() {
        return nota_min;
    }

    public boolean isNota_extra() {
        return nota_extra;
    }
    
}
