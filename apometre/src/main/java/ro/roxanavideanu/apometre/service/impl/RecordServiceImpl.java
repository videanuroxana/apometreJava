package ro.roxanavideanu.apometre.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.roxanavideanu.apometre.dao.RecordDAO;
import ro.roxanavideanu.apometre.entities.Record;
import ro.roxanavideanu.apometre.service.RecordService;

@Service
public class RecordServiceImpl implements RecordService{
	
	@Autowired
	private RecordDAO recordDAO;

	@Override
	public List<Record> getRecords() {
		
		
		
		List<Record> records = recordDAO.getRecords();
		
		return records;
	}

}
