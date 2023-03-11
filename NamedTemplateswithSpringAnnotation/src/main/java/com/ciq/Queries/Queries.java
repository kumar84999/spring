package com.ciq.Queries;

public interface Queries {

	public static String INSERT_QUERY = "INSERT INTO Student VALUES(:id,:name,:fee)";
	public static String DELETR_QUERY = "UPDATE Student SET name=:name, salary=:fees  WHERE id=:id)";
	public static String UPDATE_QUERY = "DELETE  FROM Student   WHERE id=id)";
    public static String Retrive_ALL ="select * FROM Student(:id,:name,:salary)";
}
