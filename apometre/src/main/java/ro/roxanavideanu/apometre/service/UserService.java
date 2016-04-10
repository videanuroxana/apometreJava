package ro.roxanavideanu.apometre.service;

import java.util.List;

import ro.roxanavideanu.apometre.entities.User;

public interface UserService {

	public abstract List<String> retrieveUsers();

	public abstract User getUserById(Integer userId);
	
	public abstract void createUser();

}
