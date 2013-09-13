/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snowfox.dao;

import com.snowfox.models.Avaliacao;
import java.util.List;

/**
 *
 * @author Everton
 */
public class AvaliacaoDao extends Dao<Avaliacao> {

    private static AvaliacaoDao dao;

    private AvaliacaoDao() {
    }

    public static AvaliacaoDao getInstance() {
        if (dao == null) {
            dao = new AvaliacaoDao();
        }
        return dao;
    }

    @Override
    public int insert(Avaliacao a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Avaliacao a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Avaliacao delete(Avaliacao a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Avaliacao selectOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Avaliacao> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
