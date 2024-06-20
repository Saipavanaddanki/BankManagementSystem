package com.nit.bank;

public class BankRegistration {

	public BankRegistration() {
		System.out.println("User is Going to Register....");
	}
	private int bankId;
	private String bankName;
	private String name;
	private int age;
	private String email;
	private String state;
	private String address;
	private long mobile;
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "BankRegistration [bankId=" + bankId + ", bankName=" + bankName + ", name=" + name + ", age=" + age
				+ ", email=" + email + ", state=" + state + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
	
}
