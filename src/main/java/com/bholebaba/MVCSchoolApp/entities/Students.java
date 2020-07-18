package com.bholebaba.MVCSchoolApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

	@Id
	@Column(unique=true)
	private int admnnumber;
	
	private String name;
	private String gender;
	private String address;
	private String mailid;
	private String password;

	public int getAdmnnumber() {
		return admnnumber;
	}

	public void setAdmnnumber(int admnnumber) {
		this.admnnumber = admnnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
