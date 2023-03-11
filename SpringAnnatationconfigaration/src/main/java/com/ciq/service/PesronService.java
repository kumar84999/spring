package com.ciq.service;

import java.util.List;

import com.ciq.pojo.Person;

public interface PesronService {
	int save(Person person);
	int delete(int id);
	int update(Person person);
	List<Person> getPersons();

}
