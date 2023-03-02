package com.hibernateP.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.hibernatepract.hibernateMappingEx.Course;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	
	@OneToMany
	private List<Course> course;

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

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Student(int id, String name, List<Course> course) {
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
