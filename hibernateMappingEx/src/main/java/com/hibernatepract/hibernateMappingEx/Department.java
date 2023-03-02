package com.hibernatepract.hibernateMappingEx;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Department {
	
	@Id @Column(name="Dept_table")
	private int Dept_id;
	private String Dept_name;
	
	@OneToMany
	private List<Employee> employee;

	public int getDept_id() {
		return Dept_id;
	}

	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}

	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Department(int dept_id, String dept_name, List<Employee> employee) {
		super();
		Dept_id = dept_id;
		Dept_name = dept_name;
		this.employee = employee;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
