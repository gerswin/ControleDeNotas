/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snowfox.dao;

import com.snowfox.models.Turma;
import java.util.List;

/**
 *
 * @author Everton
 */
public class TurmaDao extends Dao<Turma> {

    private static TurmaDao dao;

    private TurmaDao() {
    }

    public static TurmaDao getInstance() {
        if (dao == null) {
            dao = new TurmaDao();
        }
        return dao;
    }

    @Override
    public int insert(Turma t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Turma t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Turma delete(Turma t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Turma selectOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Turma> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
