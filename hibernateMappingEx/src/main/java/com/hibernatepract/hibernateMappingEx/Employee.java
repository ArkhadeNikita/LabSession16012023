package com.hibernatepract.hibernateMappingEx;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id @Column(name="Employee_table")
	int Emp_id;
	String Emp_name;
	public int getEmp_id() {
		return Emp_id;
	}
	
	@ManyToOne
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public Employee(int emp_id, String emp_name) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
