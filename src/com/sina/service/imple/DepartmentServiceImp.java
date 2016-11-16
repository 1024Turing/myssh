package com.sina.service.imple;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.sina.domain.Department;
import com.sina.service.inter.DepartmentServiceInter;
@Transactional
public class DepartmentServiceImp implements DepartmentServiceInter {
	private SessionFactory  sessionFactory; 
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addDep(Department dep) {
		
		Session s=sessionFactory.getCurrentSession();
		s.save(dep);
	}
	public List<Department> queryAllDep() {
		Session s=sessionFactory.getCurrentSession();
		List<Department> list=s.createQuery("from Department").list();
		return list;
	}
	public Department getDepartmentById(Serializable id) {
		Session s=sessionFactory.getCurrentSession();
		Department department=(Department) s.createQuery("from Department where id='"+id+"'").list().get(0);
		return department;
	}

}
