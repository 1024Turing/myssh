package com.sina.domain;

import java.util.Set;

public class Department {
	private String name;
	private Integer id;
	private Set<Employee> emps; 
	public Set<Employee> getEmps() {
		return emps;
	}
	public void setEmps(Set<Employee> emps) {
		this.emps = emps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Department(){}
	public Department(int id, String name, Set emps) {
		
	}
}
