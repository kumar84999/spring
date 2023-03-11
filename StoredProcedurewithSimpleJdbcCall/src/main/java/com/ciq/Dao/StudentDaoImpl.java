package com.ciq.Dao;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void operation(int id) {
		SimpleJdbcCall simpleJdbcCall=new SimpleJdbcCall(jdbcTemplate).withProcedureName("GetById");
		MapSqlParameterSource named=new MapSqlParameterSource();
		named.addValue("sid", id);
		Map<String, Object>result=simpleJdbcCall.execute(named);
		
		System.out.println(result);
		
		
	}

}
