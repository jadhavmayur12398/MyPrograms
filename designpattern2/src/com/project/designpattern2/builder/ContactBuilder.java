package com.project.designpattern2.builder;

public class ContactBuilder {
	private String firstName;
	private String middleName;
	private String lastName;
	private Long mobileNo;
	private String email;
	private String address;
	private String company;
	private String dob;
	
	public ContactBuilder FName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public ContactBuilder MName(String middleName) {
		this.middleName = middleName;
		return this;
	}
	public ContactBuilder LName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public ContactBuilder MNo(Long mobileNo) {
		this.mobileNo = mobileNo;
		return this;
	}
	public ContactBuilder email(String email) {
		this.email = email;
		return this;
	}
	public ContactBuilder address(String address) {
		this.address = address;
		return this;
	}
	public ContactBuilder dob(String dob) {
		this.dob = dob;
		return this;
	}
	public ContactBuilder company(String company) {
		this.company = company;
		return this;
	}
	public Contact getContact() {
		Contact contact = new Contact(this.firstName, this.middleName, this.lastName, this.mobileNo,
				this.email, this.address, this.company, this.dob);
		return contact;
	}
}
