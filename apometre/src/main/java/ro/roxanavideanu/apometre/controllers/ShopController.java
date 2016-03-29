package ro.roxanavideanu.apometre.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

	
	
	
	
	@RequestMapping(value="/shop", method = RequestMethod.GET)
	public ModelAndView showShop(){
		
		
		List<String> fromDb = new ArrayList<String>();
		fromDb.add("Caine");
		fromDb.add("Pisica");
		fromDb.add("Iepure");
		
		
		String userName = "Ion";
		
		ModelAndView mv = new ModelAndView("shop");
		mv.addObject("userName", userName);
		mv.addObject("listaAnimale",fromDb);
		
		
		
		
		return mv;
		
		
		
		
		
		
	}
	
}
