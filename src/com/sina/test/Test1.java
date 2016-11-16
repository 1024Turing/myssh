package com.sina.test;

import java.util.Date;





import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sina.domain.Department;
import com.sina.domain.Employee;
import com.sina.service.inter.DepartmentServiceInter;
import com.sina.service.inter.EmployeeServiceInter;

public class Test1 {
	
	public static void main(String[] args)throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Test1Service t1=(Test1Service) ac.getBean("test1Service");
		
		EmployeeServiceInter emp=(EmployeeServiceInter) ac.getBean("employeeServiceImp");
		
		Employee em=new Employee("sohu",122, "@sina.com", new Date(),
				22222.22f);
		Employee em2=new Employee("tencent",122, "@sina.com", new Date(),
				22222.22f);
		Employee em3=new Employee("bd",122, "@sina.com", new Date(),
				22222.22f);
		emp.add(em);
		emp.add(em2);
		/*Set<Employee> s=new HashSet<Employee>();
		s.add(em);
		s.add(em2);*/
		Department de1=new Department();
		de1.setId(1);
		de1.setName("财务部");
		DepartmentServiceInter di =(DepartmentServiceInter) ac.getBean("departmentServiceImp");
		di.addDep(de1);
		
		
		
	}
}
