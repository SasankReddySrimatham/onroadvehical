 package com.onroadvehilclebreakdownassistance.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin")
public class AdminModel {
	
	@Column(name="admin_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int admin_id;
	@Column(name="admin_name")
	private String admin_name;
	@Column(name="customer_id")
	private int customer_id;
	@Column(name="mechanic_id")
	private int mechanic_id;
	@Column(name="cust_feedback")
	private String cust_feedback;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getMechanic_id() {
		return mechanic_id;
	}
	public void setMechanic_id(int mechanic_id) {
		this.mechanic_id = mechanic_id;
	}
	public String getCust_feedback() {
		return cust_feedback;
	}
	public void setCust_feedback(String cust_feedback) {
		this.cust_feedback = cust_feedback;
	}
	@Override
	public String toString() {
		return "AdminModel [admin_id=" + admin_id + ", admin_name=" + admin_name + ", customer_id=" + customer_id
				+ ", mechanic_id=" + mechanic_id + ", cust_feedback=" + cust_feedback + "]";
	}
}

