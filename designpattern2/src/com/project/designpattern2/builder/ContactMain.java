package com.project.designpattern2.builder;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact = new ContactBuilder().FName("Name").MNo(9876543210L).getContact();
		System.out.println(contact);
		System.out.println();
		
		Contact contact2 = new ContactBuilder().MNo(9876543211L).LName("ABC").getContact();
		System.out.println(contact2);
	}
}
