package com.ciq.prototype;

public class Student {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		name = name;
	}
	
	
	public void studentdetails() {
		System.out.println(id+""+name);
		
	}

}
