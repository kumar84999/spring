package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Dao.PersonDao;
import com.ciq.pojo.Person;


@Service
public class Serviceimpl implements PesronService{
	
	@Autowired
	private PersonDao personDaoimp;
	

	public int save(Person person) {
		
		return personDaoimp.save(person);
	}

	public int delete(int id) {
		
		return personDaoimp.delete(id);
	}

	public int update(Person person) {
		
		return personDaoimp.update(person);
	}

	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}
