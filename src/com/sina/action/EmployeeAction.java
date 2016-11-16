package com.sina.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;



import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sina.domain.Employee;
import com.sina.service.inter.DepartmentServiceInter;
import com.sina.service.inter.EmployeeServiceInter;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	private HttpServletRequest request=ServletActionContext.getRequest();
	private Employee employee=new Employee();
	private EmployeeServiceInter employeeServiceInter;
	private DepartmentServiceInter departmentServiceInter;
	public DepartmentServiceInter getDepartmentServiceInter() {
		return departmentServiceInter;
	}

	public void setDepartmentServiceInter(
			DepartmentServiceInter departmentServiceInter) {
		this.departmentServiceInter = departmentServiceInter;
	}










	private int a=0;
	public Employee getModel() {
		
		return employee;
	}
	
	/**
	 * @return 视图
	 * @throws Exception
	 * @function 登录验证
	 */
	public String login1() throws Exception {
		if(employee.getName()!=null&&employee.getId()!=null){
			
			
			Employee e=employeeServiceInter.checkEmployee(employee);
			if(e!=null){
				request.getSession().setAttribute("employee", e);
				return "loginOk";
			}else{
				return "reLogin";
			}
		}else{
			return "reLogin";
		}
		
	}
	
	public String addEmployee()  {
		
		//System.out.println("eawfhlkahds;"+employee.getDepartment_id());
		try{
			employee.setDepartment(departmentServiceInter.getDepartmentById(employee.getDepartment_id()));
			
			employeeServiceInter.add(employee);
		}catch(Exception e){
			e.printStackTrace();
			return "error";
		}
		return "queryAllUi";
		
	}
	public String addUi() throws Exception {
			return "addUi";
		
	}
	
		
		
	
	
	

	


	public void setEmployeeServiceInter(EmployeeServiceInter employeeServiceInter) {
//		System.out.println("a="+(++a));
		this.employeeServiceInter = employeeServiceInter;
	}

}
