package ro.roxanavideanu.apometre.dao.impl;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;

import org.apache.logging.log4j.Logger;

import ro.roxanavideanu.apometre.dao.GenericDAO;

import org.apache.logging.log4j.LogManager;

public abstract class GenericDAOImpl<T> implements GenericDAO<T>{

	    protected EntityManager em = MyEntityManagerFactory.createEntityManager();
		
	    private Class<T> type;
	    
	    protected static final Logger LOGGER = LogManager.getLogger(GenericDAOImpl.class);
	    
	    public GenericDAOImpl() {
	        Type t = getClass().getGenericSuperclass();
	        ParameterizedType pt = (ParameterizedType) t;
	        type = (Class) pt.getActualTypeArguments()[0];
	    }
	    	    
	    public EntityManager getEm() {
			return em;
		}

		public void setEm(EntityManager em) {
			this.em = em;
		}

	    @Override
	    public T create(final T t) {
	        this.em.persist(t);
	        return t;
	    }

	    @Override
	    public void delete(final Object id) {
	    	this.em.remove(this.em.getReference(type, id));
	    }

	    @Override
	    public T find(final Object id) {
	        return (T) this.em.find(type, id);
	    }

	    @Override
	    public T update(final T t) {
	        return this.em.merge(t); 	        
	    }
	    
	    @Override
	    public void flush(){
	    	this.em.flush();
	    }
	    
	    @Override
	    public void clear(){
	    	this.em.clear();
	    }	    
	    
	    @Override
	    public T getReference(Class<T> clazz,Object pk){
	    	return em.getReference(clazz, pk);
	    }
	   
	}

