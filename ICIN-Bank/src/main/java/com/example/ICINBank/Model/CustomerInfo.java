package com.example.ICINBank.Model;

public class CustomerInfo {
	private long CustomerID;
	private long RegMobileNo;
	private String FirstName;
	private String LastName;
	private String Address;
	private String password;
	
	
	
	public CustomerInfo()
	{}
	
	
	public CustomerInfo(long customerID, long regMobileNo, String firstName, String lastName, String address,
			String password) {
		super();
		CustomerID = customerID;
		RegMobileNo = regMobileNo;
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		this.password = password;
	}
	public long getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(long customerID) {
		CustomerID = customerID;
	}
	public long getRegMobileNo() {
		return RegMobileNo;
	}
	public void setRegMobileNo(long regMobileNo) {
		RegMobileNo = regMobileNo;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
