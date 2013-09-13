package com.snowfox.models;

/**
 *
 * @author Everton
 */
public class Disciplina {
    
    private int id;
    private String nome;

    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
}
