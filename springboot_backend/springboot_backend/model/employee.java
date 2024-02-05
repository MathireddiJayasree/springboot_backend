package springboot.backend.springboot_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long rollNo;
	
	@Column(name="sur_Name")
	private String surName;
	@Column(name="actual_Name")
	private String actualName;
	@Column(name="email")
	private String email;
	
	
	
	public employee(long rollNo, String surName, String actualName, String email) {
		super();
		this.rollNo = rollNo;
		this.surName = surName;
		this.actualName = actualName;
		this.email = email;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
