package com.ciq.dao;

import com.ciq.pojo.Employee;
import com.ciq.templates.CiqTemplates;

public class Employeeimpl implements Employeedao{
	
	private CiqTemplates ciqTemplates;
	
	

	public void setCiqTemplates(CiqTemplates ciqTemplates) {
		this.ciqTemplates = ciqTemplates;
	}

	public int save(Employee employee) {
		String insert ="insert into employee valuee(?,?,?)";
		Object[]employ= {employee.getId(),employee.getName(),employee.getSalary()};
		int results=ciqTemplates.update(insert,employ);
		System.out.println(results);
		
		return results;
	}

	public int delete(int id) {
		
		return 0;
	}

}
