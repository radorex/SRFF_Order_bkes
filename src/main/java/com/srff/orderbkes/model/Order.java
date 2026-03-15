package com.srff.orderbkes.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Scope("Prototype")
@Entity
@Table(name = "Orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String custName;
	private String reamrks;
	public Order(int orderId, String custName, String reamrks) {
		super();
		this.orderId = orderId;
		this.custName = custName;
		this.reamrks = reamrks;
	}
	public Order() {
		super();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getReamrks() {
		return reamrks;
	}
	public void setReamrks(String reamrks) {
		this.reamrks = reamrks;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", custName=" + custName + ", reamrks=" + reamrks + "]";
	}
	
	
}
