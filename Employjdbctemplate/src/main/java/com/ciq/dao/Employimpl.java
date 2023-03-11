package com.ciq.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ciq.pojo.Employee;

public class Employimpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;
	
       public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public int save(Employee employee) {
		String insert="insert into employee values(?,?,?)";
		Object[]employ= {employee.getId(),employee.getName(),employee.getSalary()};
		int results=jdbcTemplate.update(insert, employ);
		System.out.println(results);
		
		return results;
	}

	public int update(Employee employee) {
		String update="update employee set name=?,set salary=?,where id=?";
		Object[]ep= {employee.getId(),employee.getName(),employee.getSalary()};
		int results=jdbcTemplate.update(update, ep);
		System.out.println(results);
		
		return results;
	}

	public int delete(int id) {
		String delete="delete employee where id=?";
		Object[]es= {id};
		int results=jdbcTemplate.update(delete, es);
	System.out.println(id);
	return results;
		
	}
	
	public List<Employee> getallemp() {
		String insert="select *from employee";
		return null;
	}

}
