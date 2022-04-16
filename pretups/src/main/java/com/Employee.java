package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;

	private String name;
	
	
	public Employee() {
		
	}

	public Employee(Long empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
