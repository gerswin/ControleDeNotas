package com.snowfox.dao;

import com.snowfox.models.Aluno;
import java.util.List;

/**
 *
 * @author Everton
 */
public class AlunoDao extends Dao<Aluno> {

    private static AlunoDao dao;

    private AlunoDao() {
    }

    public static AlunoDao getInstance() {
        if (dao == null) {
            dao = new AlunoDao();
        }
        return dao;
    }

    @Override
    public int insert(Aluno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Aluno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno delete(Aluno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno selectOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
