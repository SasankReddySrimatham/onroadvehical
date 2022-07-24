package com.onroadvehilclebreakdownassistance.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class CustomerModel {
	
	@Column(name="cust_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cust_id;
	@Column(name="cust_name")
	private String cust_name;
	@Column(name="cust_pno")
	private int cust_pno;
	@Column(name="cust_location")
	private String cust_location;
	@Column(name="cust_feedback")
	private String cust_feedback;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getCust_pno() {
		return cust_pno;
	}
	public void setCust_pno(int cust_pno) {
		this.cust_pno = cust_pno;
	}
	public String getCust_location() {
		return cust_location;
	}
	public void setCust_location(String cust_location) {
		this.cust_location = cust_location;
	}
	public String getCust_feedback() {
		return cust_feedback;
	}
	public void setCust_feedback(String cust_feedback) {
		this.cust_feedback = cust_feedback;
	}
	@Override
	public String toString() {
		return "CustomerModel [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_pno=" + cust_pno
				+ ", cust_location=" + cust_location + ", cust_feedback=" + cust_feedback + "]";
	}
}
