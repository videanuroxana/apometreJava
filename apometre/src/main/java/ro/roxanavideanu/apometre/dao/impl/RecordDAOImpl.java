package ro.roxanavideanu.apometre.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ro.roxanavideanu.apometre.dao.RecordDAO;
import ro.roxanavideanu.apometre.entities.Record;

@Repository
public class RecordDAOImpl extends GenericDAOImpl<Record> implements RecordDAO{

	@Override
	public List<Record> getRecords() {
		
		TypedQuery<Record> tq = em.createQuery("SELECT r FROM Record r",Record.class);
		List<Record> records = tq.getResultList();
		return records;
	}

}
