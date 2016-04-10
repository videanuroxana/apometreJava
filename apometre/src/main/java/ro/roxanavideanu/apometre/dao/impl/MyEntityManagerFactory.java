package ro.roxanavideanu.apometre.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContextType;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyEntityManagerFactory implements ServletContextListener {

    private static EntityManagerFactory emf;

    @Override
    public void contextInitialized(ServletContextEvent event) {
    	System.out.println("---------------- START CONEXTEX LISTENER ---------------------------");
        emf = Persistence.createEntityManagerFactory("apometrePU");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        emf.close();
    }

    public static EntityManager createEntityManager() {
        if (emf == null) {
            throw new IllegalStateException("Context is not initialized yet.");
        }
        
        Map<String,Object> props = new HashMap<>();        
        props.put("type",PersistenceContextType.TRANSACTION);
        
        EntityManager em = emf.createEntityManager(props);

        return em;
    }

}