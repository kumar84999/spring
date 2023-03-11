package com.ciq.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;

import com.ciq.pojo.Student;

public class Studentimpl implements StudentDao{
	private static BasicDataSource basicDataSource;
	
	public void setBasicDataSource(BasicDataSource basicDataSource) {
		this.basicDataSource = basicDataSource;
	}

	public int save(Student student) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = basicDataSource.getConnection();
			ps = con.prepareStatement("insert into studentcurd values(?,?,?)");
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getFee());
			int result = ps.executeUpdate();

			System.out.println("Student saved"+result);

		} catch (Exception e) {
			e.printStackTrace();
			
			
			try {
				con.close();
				ps.close();
				
				
			} catch (Exception e1) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public void delete(int id) {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			
			con=basicDataSource.getConnection();
			ps=con.prepareStatement("delete from  studentcurd where id=?");
			ps.setInt(1, id);
			
			int i = ps.executeUpdate();
			System.out.println("student deleted"+i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void update(Student student) {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=basicDataSource.getConnection();
			ps=con.prepareStatement("update studentcurd set Name=?,salary=? where id=?");
			ps.setString(1,student.getName());
			ps.setDouble(2, student.getFee());
			ps.setInt(3, student.getId());
			int i = ps.executeUpdate();
			System.out.println("Student updated"+i);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<Student> getAllStudents() {
List<Student>list=new ArrayList<Student>();
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=basicDataSource.getConnection();
			ps=con.prepareStatement("select * from studentcurd");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student s=new Student();
			  s.setId(rs.getInt(1));
			  s.setName(rs.getString(2));
			  s.setFee(rs.getDouble(3));
			 list.add(s);
			 System.out.println("Data retrived");
			  
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public Studentimpl getBean(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	}		

		