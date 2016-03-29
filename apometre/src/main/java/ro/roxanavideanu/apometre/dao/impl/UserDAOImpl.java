package ro.roxanavideanu.apometre.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ro.roxanavideanu.apometre.dao.UserDAO;

@Component
public class UserDAOImpl implements UserDAO {

	
	
	
	
	@Override
	public List<String> retrieveAllUsers(){
		
		List<String> fromDb = new ArrayList<String>();
		fromDb.add("Caine");
		fromDb.add("Pisica");
		fromDb.add("Iepure");
		
		return fromDb;	
	}
	
	
	
}
