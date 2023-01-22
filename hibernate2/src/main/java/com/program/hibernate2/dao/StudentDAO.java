package com.program.hibernate2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.TransactionException;

import com.program.hibernate2.dto.StudentDTO;

public class StudentDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection(){
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory!=null) {
			factory.close();
		}
		if (manager!=null) {
			manager.close();
		}
		if (transaction!=null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction is commited....");
			}
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			StudentDTO dto = new StudentDTO();
			dto.setId(523);
			dto.setName("Xyz");
			dto.setEmail("xyz@gmail.com");
			dto.setAddress("Nashik");
			manager.persist(dto);
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
