package com.ciq.dao;

import com.ciq.pojo.Employee;

public interface Employeedao {
	
	int save(Employee employee);
	int delete(int id);

}
