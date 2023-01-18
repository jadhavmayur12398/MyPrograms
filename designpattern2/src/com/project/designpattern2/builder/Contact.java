package com.project.designpattern2.builder;

public class Contact {
	String firstName;
	String middleName;
	String lastName;
	Long mobileNo;
	String email;
	String address;
	String company;
	String dob;
	
	public Contact(	String firstName,
	String middleName,
	String lastName,
	Long mobileNo,
	String email,
	String address,
	String company,
	String dob) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
		this.company = company;
		this.dob = dob;
	}
//		public String toString() {
//			return Contact ("firstName = " firstName + "middleName = " middleName +
//					" lastName = " lastName + 
//					"mobileNo = " mobileNo + "email =" email + "address = " address + 
//					"company = " company + "dob = " dob);
//		
//	}
}
