package com.anthem.ais.pmb.claims.microservices.generic.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projections;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anthem.ais.pmb.claims.microservices.util.PMBLogger;

/**
 * @com.wellpoint.cii.domain.generic.dao
 * 
 *                                       <Comments>
 * 
 * @filename GenericCIIDAOImpl.java
 * @date Apr 30, 2014
 * @author Deloitte
 * 
 */
@Transactional(propagation = Propagation.MANDATORY)
public class GenericPMBDAOImpl<T, PK extends Serializable> extends
		HibernateDaoSupport implements GenericPMBDAO<T, PK> {

	private static final PMBLogger pmbLogger = PMBLogger
			.getCiiLogger(GenericPMBDAOImpl.class);

	@Inject
	public void initSessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	private Class<T> type;

	protected Class<T> getType() {
		return this.type;
	}

	protected String getClassName() {
		return type.getName();
	}

	@SuppressWarnings("unchecked")
	public GenericPMBDAOImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}

	@Override
	public void delete(T obj) {
		pmbLogger.debug("Entered delete");
		getSession().delete(obj);
		pmbLogger.debug("Exited delete");
	}

	@Override
	public T save(T obj) {
		pmbLogger.debug("Entered save");
		getHibernateTemplate().saveOrUpdate(obj);
		getHibernateTemplate().flush();
		pmbLogger.debug("Exited save");
		return obj;
	}
	
	@Override
	public T saveOrUpdate(T obj) {
		pmbLogger.debug("Entered saveOrUpdate");
		getHibernateTemplate().saveOrUpdate(obj);
		pmbLogger.debug("Exited saveOrUpdate");
		return obj;
	}
	
	@Override
	public T saveAndFlush(T obj) {
		pmbLogger.debug("Entered saveAndFlush");
		getHibernateTemplate().save(obj);
		getHibernateTemplate().flush();
		pmbLogger.debug("Exited saveAndFlush");
		return obj;
	}
	
	@Override
	public T saveWithoutFlush(T obj) {
		pmbLogger.debug("Entered saveWithoutFlush");
		getHibernateTemplate().save(obj);
		pmbLogger.debug("Exited saveWithoutFlush");
		return obj;
	}
	
	

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		pmbLogger.debug("Entered findAll");
		return (List<T>) getHibernateTemplate().find(
				new StringBuilder().append("FROM ").append(type.getName())
						.toString());
	}

	@Override
	public Integer countAll() {
		pmbLogger.debug("Entered countAll");
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				new StringBuilder().append("select count(*) from ")
						.append(type.getName()).toString()));
	}

	public void setHibernateSessionFactory(
			SessionFactory hibernateSessionFactory) {
		pmbLogger.debug("Entered setHibernateSessionFactory");
		setSessionFactory(hibernateSessionFactory);
		pmbLogger.debug("Exited setHibernateSessionFactory");
	}

	@Override
	public final T findById(PK id) {
		pmbLogger.debug("Entered findById");
		T entity = (T) getHibernateTemplate().get(type, id);
		pmbLogger.debug("Exited findById");
		return entity;
	}

	/**
	 * @return the number of rows/objects
	 */
	@Override
	public final Long rowCount() {
		pmbLogger.debug("Entered rowCount");
		return (Long) getSession().createCriteria(type)
				.setProjection(Projections.rowCount()).uniqueResult();
	}

	/**
	 * @param exampleInstance
	 *            the example instance
	 * @return objects that match the example instance
	 */
	@Override
	public final List<T> findByExample(final T exampleInstance) {
		pmbLogger.debug("Entered findByExample");
		Criteria crit = getSession().createCriteria(type);
		Example example = Example.create(exampleInstance);
		crit.add(example);
		pmbLogger.debug("Exited findByExample");
		return crit.list();
	}

	/**
	 * @param exampleInstance
	 *            the example instance
	 * @param excludeProperty
	 *            the properties to exclude
	 * @return objects that match the example instance
	 */
	@Override
	public final List<T> findByExample(final T exampleInstance,
			final String[] excludeProperty) {
		pmbLogger.debug("Entered findByExample");
		Criteria crit = getSession().createCriteria(type);
		Example example = Example.create(exampleInstance);
		for (String exclude : excludeProperty) {
			example.excludeProperty(exclude);
		}
		crit.add(example);
		pmbLogger.debug("Exited findByExample");
		return crit.list();
	}

	/**
	 * Find objects by criteria. (Use this inside subclasses as a convenience
	 * method.)
	 * 
	 * @param criterion
	 *            the criteria to search by
	 * @return the found objects in a list
	 */
	@Override
	public final List<T> findByCriteria(final Criterion... criterion) {
		pmbLogger.debug("Entered findByCriteria");
		Criteria crit = getSession().createCriteria(type);
		for (Criterion c : criterion) {
			crit.add(c);
		}
		pmbLogger.debug("Exited findByCriteria");
		return crit.list();
	}

	public List<T> findByQuery(String query, Object[] params) {
		pmbLogger.debug("Entered findByQuery");
		if (params == null) {
			pmbLogger.debug("Exited findByQuery");
			return this.getHibernateTemplate().find(query);
		} else {
			pmbLogger.debug("Exited findByQuery");
			return this.getHibernateTemplate().find(query, params);
		}
	}

	/**
	 * Force this session to flush. Must be called at the end of a unit of work,
	 * before committing the transaction and closing the session (depending on
	 * flush-mode, Transaction.commit() calls this method). Flushing is the
	 * process of synchronizing the underlying persistent store with persistable
	 * state held in memory.
	 * 
	 * @see org.hibernate.Session#flush
	 */
	@Override
	public final void flush() {
		pmbLogger.debug("Entered flush");
		getSession().flush();
	}

	/**
	 * Completely clear the session. Evict all loaded instances and cancel all
	 * pending saves, updates and deletions. Do not close open iterators or
	 * instances of ScrollableResults.
	 * 
	 * @see org.hibernate.Session#clear
	 */
	@Override
	public final void clear() {
		pmbLogger.debug("Entered clear");
		getSession().clear();
	}
}
