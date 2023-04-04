package com.groupeisi.ExamenEJB.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.groupeisi.ExamenEJB.dao.Repository;

public class RepositoryImpl <T> implements Repository<T>{

	@PersistenceContext(unitName="ExamenEJB")
	protected EntityManager em;
	
	public  RepositoryImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExamenEJB");
		this.em = emf.createEntityManager();
		
	}
	
	@Override
	public int add(T t) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		int result=1;
		em.persist(t);
		tx.commit();
		return result;
		
	}
	
	@Override
	public int delete(int id, T t) {
		
		int result=1;
		String table=t.getClass().getSimpleName();
        t=(T) em.createQuery("SELECT t FROM " + table + " t WHERE t.id=:id").setParameter("id", id).getSingleResult();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(t);
		tx.commit();
		return result;
	}

	@Override
	public int update(T t) {
		EntityTransaction tx = em.getTransaction();
	    tx.begin();
		int result=1;
		em.merge(t);
		tx.commit();
		return result;
	}

	
	@Override
	public List<T> list(T t) {
		EntityTransaction tx = em.getTransaction();
	    tx.begin();
		String table=t.getClass().getSimpleName();
		tx.commit();
	    return (List<T>) em.createQuery("SELECT t FROM " + table + " t").getResultList();
	}

	
	@Override
	public T get(int id, T t) {
		EntityTransaction tx = em.getTransaction();
	    tx.begin();
		String table=t.getClass().getSimpleName();
        t=(T) em.createQuery("SELECT t FROM " + table + " t WHERE t.id=:id").setParameter("id", id).getSingleResult();
        tx.commit();
        return t;
	}
	
	public T isValid(String email, String password, T t) {
		EntityTransaction tx = em.getTransaction();
	    tx.begin();
		String table=t.getClass().getSimpleName();
        t=(T) em.createQuery("SELECT t FROM " + table + " t WHERE t.email=:email AND t.password=:password ")
        		.setParameter("email", email).setParameter("password", password).getSingleResult();
        tx.commit();
        return t;
	}
}
