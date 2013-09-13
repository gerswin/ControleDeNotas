package com.snowfox.dao;

import java.util.List;

/**
 *
 * @author Everton
 * @param <T>
 */
public abstract class Dao<T> {
    
    public abstract int insert(T t);

    public abstract boolean update(T t);

    public abstract T delete(T t);

    public abstract T selectOne(int id);

    public abstract List<T> select();

}
