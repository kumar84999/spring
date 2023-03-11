package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.pojo.Person;
import com.ciq.service.PesronService;

@Controller("person")
public class PersonController {
	
	@Autowired
	private PesronService serviceimpl;
	
	public int save(Person person) {
		
		return serviceimpl.save(person);
		
	}
	public int delete(int id) {
		return serviceimpl.delete(id);
	}
	public int update(Person person) {
		return serviceimpl.update(person);
	}

}
