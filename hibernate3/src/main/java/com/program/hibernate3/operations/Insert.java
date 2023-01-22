package com.program.hibernate3.operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.TransactionException;

public class Insert {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
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
				System.out.println("data inserted successfully...");
			}
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(1413);
			studentDTO.setName("mno");
			studentDTO.setEmail("mno1@gmail.com");
			studentDTO.setAddress("taj hotel");
			studentDTO.setCity("Mumbai");
			manager.persist(studentDTO);
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
