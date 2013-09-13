/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snowfox.helpers;

import com.snowfox.models.Aluno;

/**
 *
 * @author FIC
 */
public abstract class AlunoHelper {
    
    public static String getMatricula(Aluno a) {
        return a == null ? "" : String.valueOf(a.getMatricula());
    }

    public static String getNome(Aluno a) {
        return a == null ? "" : a.getNome();
    }

    public static String getEndereco(Aluno a) {
        return a == null ? "" : a.getEndereco();
    }

    public static String getCpf(Aluno a) {
        return a == null ? "" : a.getCpf();
    }

    public static String getCurso(Aluno a) {
        return a == null ? "" : a.getCurso().getNome();
    }
}
