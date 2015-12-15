package com.anthem.ais.pmb.claims.microservices.generic.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

/**
 *
 * <Comments>
 *
 * @filename	GenericPMBDAO.java
 * @date	Apr 30, 2014
 * @author Deloitte
 *
 */
public interface GenericPMBDAO<T, PK extends Serializable> {

    public abstract T save(T t);
    
    public abstract T saveOrUpdate(T t);
    
    public abstract T saveWithoutFlush(T t);
    
    public abstract T saveAndFlush(T t);

    public abstract List<T> findAll();

    public abstract Integer countAll();

    public abstract void delete(T t);

    public abstract T findById(PK id);

    public abstract Long rowCount();

    public abstract List<T> findByExample(final T exampleInstance);

    public abstract List<T> findByExample(final T exampleInstance, final String[] excludeProperty);

    public abstract List<T> findByCriteria(final Criterion... criterion);

    public abstract List<T> findByQuery(String query, Object[] params);

    public abstract void clear();

    public abstract void flush();
}
