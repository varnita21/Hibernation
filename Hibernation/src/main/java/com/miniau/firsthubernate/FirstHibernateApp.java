package com.miniau.firsthubernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.miniau.firsthubernate.dao.EmployeeDao;
import com.miniau.firsthubernate.model.Address;
import com.miniau.firsthubernate.model.Employee;
import com.miniau.firsthubernate.model.Phone;

public class FirstHibernateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
		Employee e = new Employee();
//		e.setEmpID(2);
		e.setEmpName("Reena jain");
		e.setEmpAddress("New Delhi1");
		e.setSalary(11000);
		
		Address a = new Address();
		a.setStreetNo("231");
		a.setCity("Delhi");
		
		e.setAddress(a);
		
//		employeeDao.findById(1);
//		employeeDao.update(e);
		Phone p1 = new Phone();
		p1.setNumber(1234567);
		Phone p2 = new Phone();
		p2.setNumber(165432);
		
		Set<Phone> setPhone = new HashSet<Phone>();
		setPhone.add(p1);
		setPhone.add(p2);
		e.setPhone(setPhone);
		employeeDao.save(e);
		List<Employee> employee = employeeDao.getAllEmployee();
		System.out.println("The List is: ");
		for(Employee employees: employee) {
			System.out.println(employees);
			
		}
		context.close();
	}

}
