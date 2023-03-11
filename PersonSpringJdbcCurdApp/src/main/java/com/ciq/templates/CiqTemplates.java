package com.ciq.templates;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp.BasicDataSource;



public class CiqTemplates {
	
	
	private BasicDataSource managerSourece; 

	public void setManagerSourece(BasicDataSource managersource) {
		this.managerSourece=managersource;
	}

	public int update(String insert, Object[] employ) {

		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=managerSourece.getConnection();
			ps=con.prepareStatement(insert);
			int i=1;
			for (Object object : employ) {
				ps.setObject(i, object);
				i++;
				
			}
			return ps.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(ps != null&& con!=null) {
				try {
					ps.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return 0;
		
		}
	}

	

