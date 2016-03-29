package ro.roxanavideanu.apometre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") 
									String name,
									@RequestParam(value="lastname", required = false, defaultValue = "") 
									String lastname) {
		
		System.out.println("in controller");
 
		System.out.println("Nume ="+name);
		System.out.println("lastname"+lastname);
		
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		mv.addObject("lastname", lastname);
		
		return mv;
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView showContact(){
		
		// caut in DB adresa nume si telefon
		String adresa = "Calea Rahovei 356";
		String nume = "Adrian Videanu";
		String tel = "0040723864025";
		
		
		ModelAndView mv = new ModelAndView("contact");
		mv.addObject("adresa",adresa);
		mv.addObject("nume",nume);
		mv.addObject("tel",tel);
		
		
		return mv;
		
		
	}
	
	
	
	
}