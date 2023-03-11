package com.ciq.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Employee;
@Repository("dao")
public class Employeeimpl implements EmployeeDao{
	
	//private JdbcTemplate jdbcTemplate;

	public void save(Employee employee) {
		System.out.println(employee);
		System.out.println("employeeDao");
//		String insert="inser into Employeecode values(?,?,?)";
//		Object[]emps= {employee.getId(),employee.getName(),employee.getSalary()};
//		
//		 int i = jdbcTemplate.update(insert, emps);
//		 System.out.println(i+"successfully inserted");
//		 return i;
		
	}

	public void delete(int id) {
		
		
	}

	public void update(Employee employee) {
		
		
	}

	public List<Employee> getEmployees() {
		
		return null;
	}

}
