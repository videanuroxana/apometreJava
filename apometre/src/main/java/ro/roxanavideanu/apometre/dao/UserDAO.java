package ro.roxanavideanu.apometre.dao;

import java.util.List;

import ro.roxanavideanu.apometre.entities.User;

public interface UserDAO extends GenericDAO<User>{
	
	
	public List<User> retrieveAllUsers();

}
