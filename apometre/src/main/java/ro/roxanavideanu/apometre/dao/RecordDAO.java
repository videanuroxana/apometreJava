package ro.roxanavideanu.apometre.dao;

import java.util.List;

import ro.roxanavideanu.apometre.entities.Record;

public interface RecordDAO extends GenericDAO<Record> {
	
	public List<Record>getRecords();

}
