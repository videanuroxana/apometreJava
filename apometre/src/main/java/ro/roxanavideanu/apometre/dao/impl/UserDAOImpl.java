package ro.roxanavideanu.apometre.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ro.roxanavideanu.apometre.dao.UserDAO;
import ro.roxanavideanu.apometre.entities.User;

@Repository
public class UserDAOImpl extends GenericDAOImpl<User> implements UserDAO {

	@Override
	public List<User> retrieveAllUsers(){
		
		TypedQuery<User> tq = em.createQuery("SELECT u FROM User u",User.class);
		List<User> users = tq.getResultList();
		return users;	
	}
	
	
	
}
