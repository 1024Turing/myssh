package com.sina.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sina.domain.Department;
import com.sina.service.inter.DepartmentServiceInter;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department> {
	
	private Department department=new Department();
	//接口
	private DepartmentServiceInter departmentServiceInter;
	public DepartmentServiceInter getDepartmentServiceInter() {
		return departmentServiceInter;
	}
	//在spring配置文件里把departmentServiceInter接口的实现类注入这个action.
	public void setDepartmentServiceInter(
			DepartmentServiceInter departmentServiceInter) {
		this.departmentServiceInter = departmentServiceInter;
	}
	//ModelDriven接口提供的方法.
	public Department getModel() {
		
		return department;
	}
	
	
	/**
	 * @function 查询所有部门,本方法供添加雇员的页面中的ajax调用
	 * @throws Exception
	 */
	public void queryAllDep() throws Exception {
		System.out.println("HAHHAHHAHAAAAAAA");
		List<Department> list=departmentServiceInter.queryAllDep();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		for (Department dep : list) {
			out.println("<option value='"+dep.getId()+"'>"+dep.getName()+"</option>");
		}
		

	}	
	

}
