package com.miniau.firsthubernate.model;

import java.security.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="empId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empID;
	
	@Column(name="empName")
	String empName;
	@Column(name="empAddress")
	String empAddress;
	@Column(name="salary")
	int salary;
	@Column(name="create_at")
	Timestamp created_at;
	@Column(name="update_at")
	Timestamp updated_at;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	@OneToMany(mappedBy="employee")
	Set<Phone> phone;
	
	public Set<Phone> getPhone() {
		return phone;
	}

	public void setPhone(Set<Phone> phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Employee() {
		super();
	}

	public int getEmpID() {
		return empID;
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + ", salary=" + salary
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + ", address=" + address + "]";
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

}
