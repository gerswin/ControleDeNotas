/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snowfox.dao;

import com.snowfox.models.Disciplina;
import java.util.List;

/**
 *
 * @author Everton
 */
public class DisciplinaDao extends Dao<Disciplina> {

    private static DisciplinaDao dao;

    private DisciplinaDao() {
    }

    public static DisciplinaDao getInstance() {
        if (dao == null) {
            dao = new DisciplinaDao();
        }
        return dao;
    }

    @Override
    public int insert(Disciplina d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Disciplina d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Disciplina delete(Disciplina d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Disciplina selectOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Disciplina> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
