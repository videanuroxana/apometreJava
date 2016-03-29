package ro.roxanavideanu.apometre.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ro.roxanavideanu.apometre.dao.UserDAO;
import ro.roxanavideanu.apometre.dao.impl.UserDAOImpl;
import ro.roxanavideanu.apometre.service.UserService;


@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	public List<String> retrieveUsers(){
		
		//UserDAO userDAO =  new UserDAOImpl();
		List<String> users = userDAO.retrieveAllUsers();
		return users;
	
	}
	
	
	
}
