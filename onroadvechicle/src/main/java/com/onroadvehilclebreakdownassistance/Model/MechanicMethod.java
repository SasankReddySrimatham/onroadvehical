package com.onroadvehilclebreakdownassistance.Model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Mechanic")
public class MechanicMethod {
	
	@Column(name="mechanic_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mechanic_id;
	@Column(name="mechanic_name")
	private String mechanic_name;
	@Column(name="mechanic_pno")
	private int mechanic_pno;
	@Column(name="mechanic_location")
	private String mechanic_location;
	@Column(name="mechanic_feedback")
	private String mechanic_feedback;
	public int getMechanic_id() {
		return mechanic_id;
	}
	public void setMechanic_id(int mechanic_id) {
		this.mechanic_id = mechanic_id;
	}
	public String getMechanic_name() {
		return mechanic_name;
	}
	public void setMechanic_name(String mechanic_name) {
		this.mechanic_name = mechanic_name;
	}
	public int getMechanic_pno() {
		return mechanic_pno;
	}
	public void setMechanic_pno(int mechanic_pno) {
		this.mechanic_pno = mechanic_pno;
	}
	public String getMechanic_location() {
		return mechanic_location;
	}
	public void setMechanic_location(String mechanic_location) {
		this.mechanic_location = mechanic_location;
	}
	public String getMechanic_feedback() {
		return mechanic_feedback;
	}
	public void setMechanic_feedback(String mechanic_feedback) {
		this.mechanic_feedback = mechanic_feedback;
	}
	@Override
	public String toString() {
		return "MechanicMethod [mechanic_id=" + mechanic_id + ", mechanic_name=" + mechanic_name + ", mechanic_pno="
				+ mechanic_pno + ", mechanic_location=" + mechanic_location + ", mechanic_feedback=" + mechanic_feedback
				+ "]";
	}

	}


