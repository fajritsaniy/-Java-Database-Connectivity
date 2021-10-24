package com.bioskop.main.model;

import java.sql.Date;

public class CustomerModel extends Model {
	private int customerid;
	private String firstname;
	private String lastname;
	private String nohp;
	private String address;
	private String email;
	private Date birthdate;
	
	
	
	public CustomerModel() {
		
	}


	public CustomerModel(int customerid, String firstname, String lastname, String nohp, String adress, String email,
			Date birthdate) {
		super();
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nohp = nohp;
		this.address = adress;
		this.email = email;
		this.birthdate = birthdate;
	}






	public int getCustomerid() {
		return customerid;
	}



	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getNohp() {
		return nohp;
	}



	public void setNohp(String nohp) {
		this.nohp = nohp;
	}



	public String getAddress() {
		return address;
	}



	public void setAdress(String adress) {
		this.address = adress;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}