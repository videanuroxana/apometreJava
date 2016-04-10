package ro.roxanavideanu.apometre.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ro.roxanavideanu.apometre.dao.UserDAO;
import ro.roxanavideanu.apometre.entities.User;
import ro.roxanavideanu.apometre.service.UserService;


@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<String> retrieveUsers(){
		
		//UserDAO userDAO =  new UserDAOImpl();
		List<User> users = userDAO.retrieveAllUsers();
		
		List<String> userNames = new ArrayList<String>();
		
		for(User u:users){
			userNames.add(u.getUsername());
		}
				
		return userNames;	
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public User getUserById(Integer userId){
		
		User u = userDAO.find(userId);
		return u;		
	}

	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW ,readOnly=false,transactionManager="transactionManager")
	public void createUser() {
		
		User u = new User();
		u.setNume("Popescu");
		u.setPrenume("Ion");
		u.setApartament(12);
		u.setBloc("6");
		u.setEtaj(7);
		u.setJudet("Arges");
		u.setLocalitate("Pitesti");
		u.setMail("pi@gmail.com");
		u.setPassword("euforia");
		u.setScara("B");
		u.setSector(0);
		u.setUsername("popescu.ionel");
		
		//salveaza in DB
		userDAO.create(u);		
		userDAO.flush();
		
	}
	
	
}
