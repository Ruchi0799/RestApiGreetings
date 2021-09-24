package com.springrestgreeting.springrestpracticegreeting.entities;

public class Course {
	
	private long id;
	private String name;
	//private String description;
	public Course(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Helloo [id=" + id + ", name=" + name + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
