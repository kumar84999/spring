package com.ciq.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.ciq.Queries.Queries;

import com.ciq.pojo.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
@Autowired
private NamedParameterJdbcTemplate namedParameter;

//public void setNamedParameter(NamedParameterJdbcTemplate namedParameter) {
//	this.namedParameter= namedParameter;
//}
	public int save(Student student) {
		Map<String,Object>map=new HashMap<String, Object>();
		map.put("id", student.getId());
		map.put("name", student.getName());
		map.put("fee", student.getFee());
		System.out.println("Student inserted");
		return namedParameter.update(Queries.INSERT_QUERY, map);
		
		
	}

	public int delete(int id) {
		SqlParameterSource parameterSource=new BeanPropertySqlParameterSource(id);
		
		return namedParameter.update(Queries.DELETR_QUERY, parameterSource);
	}

	public int update(Student student) {
		SqlParameterSource parameterSource=new BeanPropertySqlParameterSource(student);
		return namedParameter.update(Queries.UPDATE_QUERY, parameterSource);
	}

	public List<Student> getStudents() {
//		List<Student> st = namedParameter.query(Queries.Retrive_ALL, new ResultSetExtractor<Student>(Student.class) {
//			
//						public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
//							
//							return null;
//						}
//					});
		return null;
	}

	public ArrayList<Student> allStudents() {
		
		return null;
	}

}
