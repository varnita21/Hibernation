package com.miniau.firsthubernate.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="address")
public class Address {
	@Id	
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="streetNo")
	private String streetNo;
	
	@Column(name="city")
	private String city;
	
	@Column(name="createdAt")
	private Timestamp createdAt;
	
	@Column(name="updatedAt")
	private Timestamp updatedAt;
	
//	@OneToOne(mappedBy="employee")
//	private Employee employee;
//	
	public Address() {
		super();
	}

	public int getId() {
		return id;
	}
	
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", streetNo=" + streetNo + ", city=" + city + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
}
