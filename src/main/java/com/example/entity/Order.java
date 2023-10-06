package com.example.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity
@Table(name="orders")

public class Order implements Serializable  {
	
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="ord_date")
	private String ordDate;
	
   @Column(name="purch_amt")
	private int purchAmt;
   
   @ManyToOne
   @JoinColumn(name="customer_id")
   private Person person;

public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public Order(int orderId, String ordDate, int purchAmt, Person person) {
	super();
	this.orderId = orderId;
	this.ordDate = ordDate;
	this.purchAmt = purchAmt;
	this.person = person;
}

public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public String getOrdDate() {
	return ordDate;
}

public void setOrdDate(String ordDate) {
	this.ordDate = ordDate;
}

public int getPurchAmt() {
	return purchAmt;
}

public void setPurchAmt(int purchAmt) {
	this.purchAmt = purchAmt;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", ordDate=" + ordDate + ", purchAmt=" + purchAmt + ", person=" + person + "]";
}
	
   
	

}
