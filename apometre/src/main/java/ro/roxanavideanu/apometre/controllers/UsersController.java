package ro.roxanavideanu.apometre.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ro.roxanavideanu.apometre.entities.User;
import ro.roxanavideanu.apometre.service.UserService;
import ro.roxanavideanu.apometre.service.impl.UserServiceImpl;

@Controller
public class UsersController {
	
	
	@Autowired
	public UserService userService;
	
	
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public ModelAndView showUsers(){
		
		User u = userService.getUserById(1);
		
		//UserService userService =  new UserServiceImpl();		
		List<String> users = userService.retrieveUsers();
		
		
		ModelAndView modelV = new ModelAndView("users");
		modelV.addObject("userList", users);
		modelV.addObject("userName", u.getUsername());
		
		
		return modelV;
	}

		
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView createUser(){
		
		userService.createUser();
		return new ModelAndView("createUser");
	}
	
	

}
