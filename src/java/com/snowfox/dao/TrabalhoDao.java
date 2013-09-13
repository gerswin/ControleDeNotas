/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snowfox.dao;

import com.snowfox.models.Trabalho;
import java.util.List;

/**
 *
 * @author Everton
 */
public class TrabalhoDao extends Dao<Trabalho> {

    private static TrabalhoDao dao;

    private TrabalhoDao() {
    }

    public static TrabalhoDao getInstance() {
        if (dao == null) {
            dao = new TrabalhoDao();
        }
        return dao;
    }

    @Override
    public int insert(Trabalho t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Trabalho t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trabalho delete(Trabalho t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trabalho selectOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Trabalho> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
