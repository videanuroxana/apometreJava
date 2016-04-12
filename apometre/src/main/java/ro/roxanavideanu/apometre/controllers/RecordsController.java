package ro.roxanavideanu.apometre.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ro.roxanavideanu.apometre.entities.Record;
import ro.roxanavideanu.apometre.service.RecordService;

@Controller
public class RecordsController {
	
	@Autowired
	private RecordService recordService;
	
	
	
	
	@RequestMapping(value="/records", method=RequestMethod.GET)
	public ModelAndView listRecords(){
		
		List<Record> records = recordService.getRecords();
		ModelAndView mv = new ModelAndView("listRecords");
		mv.addObject("records", records);
		
		return mv;
		
	}
	
	
	
	
	
	
	

}
