package com.sina.service.inter;

import java.util.List;

import com.sina.domain.Employee;

public interface EmployeeServiceInter {
	
	public void add(Employee employee);
	public List<Employee> showEmployee();
	public void updateEmployee(Employee employee);
	public void delEmployee(java.io.Serializable id);
	public Employee checkEmployee(Employee employee);
}
