package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


 
public class Person implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
	private int id;
	
	private String city;
	
	private String firstName;
	
	private String lastName;
	
	@JsonManagedReference
	@OneToMany(mappedBy="person" , cascade=(CascadeType.ALL))
	private List<Order> orders;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String city, String firstName, String lastName, List<Order> orders) {
		super();
		this.id = id;
		this.city = city;
		this.firstName = firstName;
		this.lastName = lastName;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", city=" + city + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", orders=" + orders + "]";
	}
	
	

}
