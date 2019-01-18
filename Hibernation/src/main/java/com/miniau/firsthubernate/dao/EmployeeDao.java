package com.miniau.firsthubernate.dao;

import java.util.List;

import com.miniau.firsthubernate.model.Employee;

public interface EmployeeDao {
	
	public Boolean save(Employee e);
	
	public List<Employee> getAllEmployee();
	
	public Boolean delete(int empID);
	
	public Boolean update(Employee e);
	
	public Employee findById(int empID);


}
