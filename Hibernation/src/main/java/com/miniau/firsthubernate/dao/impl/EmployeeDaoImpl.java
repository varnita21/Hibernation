package com.miniau.firsthubernate.dao.impl;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.miniau.firsthubernate.dao.EmployeeDao;
import com.miniau.firsthubernate.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	private SessionFactory sessionFactory;
	public Boolean save(Employee e) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		session.close();
		return true;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<Employee> employee =(List<Employee>)session.createQuery("from Employee").list();
		session.close();
		return employee;
	}

	public Boolean delete(int empID) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction ts= session.beginTransaction();
		Employee e = (Employee) session.load(Employee.class, empID);
		if(e!=null) {
			session.delete(e);
		}
		ts.commit();
		session.close();
		return true;
	}

	public Boolean update(Employee e) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction ts= session.beginTransaction();
		Employee e1 = (Employee) session.load(Employee.class, e.getEmpID());
		if(e1!=null) {
			session.update(e);
			System.out.println("updated");
		}
		ts.commit();
		session.close();
		return true;
	}

	public Employee findById(int empID) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Employee e1 = new Employee();
		Employee e = (Employee) session.load(Employee.class, empID);
		if(e!=null) {
			System.out.println("\nFound\n");
			System.out.println(e);
			session.close();
			
			return e;
		}
		else
			System.out.println("Sorry not found!");
		session.close();
		return null;
		
	}
	

}
