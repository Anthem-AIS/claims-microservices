/**
 * @Apr 21, 2014
 */
package com.anthem.ais.pmb.claims.microservices.generic.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.anthem.ais.pmb.claims.microservices.generic.dao.GenericPMBDAO;
import com.anthem.ais.pmb.claims.microservices.util.PMBLogger;

/**
 *
 * <Comments>
 *
 * @filename GenericEntityServiceImpl.java
 * @date Apr 21, 2014
 * @author Deloitte
 *
 */
public abstract class GenericEntityServiceImpl<T /*extends CiiEntity*/, PK extends Serializable>
        implements GenericEntityService<T, PK> {

    private static final PMBLogger pmbLogger = PMBLogger
            .getCiiLogger(GenericEntityServiceImpl.class);
            
    public abstract GenericPMBDAO<T, PK> getEntityDao();


    /* (non-Javadoc)
     * @see com.wellpoint.cii.domain.generic.service.GenericEntityService#findAll()
     */
    @Override
    @Transactional
    public List<T> findAll() {
        pmbLogger.debug("Entered findAll");
        return getEntityDao().findAll();
    }

    /* (non-Javadoc)
     * @see com.wellpoint.cii.domain.generic.service.GenericEntityService#countAll()
     */
    @Override
    @Transactional
    public Integer countAll() {
        pmbLogger.debug("Entered countAll");
        return getEntityDao().countAll();
    }

    /* (non-Javadoc)
     * @see com.wellpoint.cii.domain.generic.service.GenericEntityService#delete(java.lang.Object)
     */
    @Override
    @Transactional
    public void delete(T t) {
        pmbLogger.debug("Entered delete");
        getEntityDao().delete(t);
    }

    /* (non-Javadoc)
     * @see com.wellpoint.cii.domain.generic.service.GenericEntityService#findById(java.io.Serializable)
     */
    @Override
    @Transactional
    public T findById(PK id) {
        pmbLogger.debug("Entered findById");
        return (T) getEntityDao().findById(id);
    }

    /* (non-Javadoc)
     * @see com.wellpoint.cii.domain.generic.service.GenericEntityService#rowCount()
     */
    @Override
    @Transactional
    public Long rowCount() {
        pmbLogger.debug("Entered rowCount");
        return getEntityDao().rowCount();
    }

    /* (non-Javadoc)
     * @see com.wellpoint.cii.domain.generic.service.GenericEntityService#findByExample(java.lang.Object)
     */
    @Override
    @Transactional
    public List<T> findByExample(T exampleInstance) {
        pmbLogger.debug("Entered findByExample");
        return getEntityDao().findByExample(exampleInstance);
    }

    /* (non-Javadoc)
     * @see com.wellpoint.cii.domain.generic.service.GenericEntityService#findByExample(java.lang.Object, java.lang.String[])
     */
    @Override
    @Transactional
    public List<T> findByExample(T exampleInstance, String[] excludeProperty) {
        pmbLogger.debug("Entered findByExample");
        return getEntityDao().findByExample(exampleInstance, excludeProperty);
    }

    /* (non-Javadoc)
     * @see com.wellpoint.cii.domain.generic.service.GenericEntityService#findByCriteria(org.hibernate.criterion.Criterion[])
     */
    @Override
    @Transactional
    public List<T> findByQuery(String query, Object[] params) {
        pmbLogger.debug("Entered findByQuery");
        return getEntityDao().findByQuery(query, params);
    }
}
