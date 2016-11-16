package com.sina.service.inter;

import java.util.List;

import com.sina.domain.Department;

public interface DepartmentServiceInter {

	public void addDep(Department dep);
	public List<Department> queryAllDep();
	public Department getDepartmentById(java.io.Serializable id);
}
