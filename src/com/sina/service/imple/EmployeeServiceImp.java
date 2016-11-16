package com.sina.service.imple;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



import org.springframework.transaction.annotation.Transactional;

import com.sina.domain.Department;
import com.sina.domain.Employee;
import com.sina.service.inter.EmployeeServiceInter;

@Transactional
public class EmployeeServiceImp implements EmployeeServiceInter {
	private SessionFactory  sessionFactory; 
	
	public void add(Employee employee) {
		//一定要是当前session,注解生效
		Session s=sessionFactory.getCurrentSession();
		
		s.save(employee);
		
		
	}
	//@Transactional,如果在这里配,就是管理这个函数的事务
	public List<Employee> showEmployee() {
		
		return null;
	}

	public void updateEmployee(Employee employee) {
		
		
	}

	public void delEmployee(Serializable id) {
		
		
	}

	

	public void setSessionFactory(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	public Employee checkEmployee(Employee employee) {
		
		String hql="from Employee where name=? and id=?";
		//System.out.println("++++++++++"+employee.getName());
		List<Employee> list=sessionFactory.getCurrentSession().createQuery(hql).setString(0, employee.getName())
		.setString(1, employee.getId()+"").list();
		//解决懒加载的方案一:预先加载代理对象
		//方案一和方案二都不好.因为后面用不用都查
		//Hibernate.initialize(Department.class);
		if(list.size()==1){
			Employee e=list.get(0);
			//System.out.println(e.getDepartment().getName());
			return e;
		}else{
			return null;
		}
		
	}

}
