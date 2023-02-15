package com.hibernateProj.employeeProj;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity(name="Student_Ex")
public class Student {
	@Id
	private int id;
	
	private String name;
	@OneToOne
	@JoinColumn(name="Student_cource_id")
   private Course course;
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	

}
