package com.project.mvc.models;

public class Jedi {

	
	private String name;
	private String lastName;
	public Jedi(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}
	public Jedi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	
	
}
