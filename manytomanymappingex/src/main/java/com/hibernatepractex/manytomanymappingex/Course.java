package com.hibernatepractex.manytomanymappingex;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
    @Id @Column(name="Course_id")
	private int cid;
	private String cname;
	
	@ManyToMany //(mappedBy="student")
	private List<Student> student;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Course(int cid, String cname, List<Student> student) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.student = student;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
