package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.bfm.util.HibernateUtil;

/**
 * Home object for domain model class Tbinstrstockfile.
 * @see com.bfm.db.bean.Tbinstrstockfile
 * @author Hibernate Tools
 */
public class TbinstrstockfileHome {

	private static final Log log = LogFactory
			.getLog(TbinstrstockfileHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstrstockfile transientInstance) {
		log.debug("persisting Tbinstrstockfile instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstrstockfile instance) {
		log.debug("attaching dirty Tbinstrstockfile instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstrstockfile instance) {
		log.debug("attaching clean Tbinstrstockfile instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstrstockfile persistentInstance) {
		log.debug("deleting Tbinstrstockfile instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstrstockfile merge(Tbinstrstockfile detachedInstance) {
		log.debug("merging Tbinstrstockfile instance");
		try {
			Tbinstrstockfile result = (Tbinstrstockfile) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstrstockfile findById(java.lang.String id) {
		log.debug("getting Tbinstrstockfile instance with id: " + id);
		try {
			Tbinstrstockfile instance = (Tbinstrstockfile) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstrstockfile", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbinstrstockfile instance) {
		log.debug("finding Tbinstrstockfile instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstrstockfile")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
