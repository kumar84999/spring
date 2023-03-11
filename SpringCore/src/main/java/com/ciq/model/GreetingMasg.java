package com.ciq.model;

public class GreetingMasg {
	private int id;
	private String name;
	public GreetingMasg(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void msg() {
		System.out.println(id+""+name+"Welcome To Spring");
	}
	
}
