/**
 */
package com.anthem.ais.pmb.claims.microservices.generic.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * <Comments>
 *
 * @filename	GenericEntityService.java
 * @author Deloitte
 *
 */
public interface GenericEntityService<T, PK extends Serializable> {

    public abstract List<T> findAll();

    public abstract Integer countAll();

    public abstract void delete(T t);

    public abstract T findById(PK id);

    public abstract Long rowCount();

    public abstract List<T> findByExample(final T exampleInstance);

    public abstract List<T> findByExample(final T exampleInstance, final String[] excludeProperty);

    public abstract List<T> findByQuery(String query, Object[] params);
}
