package com.program.hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import org.hibernate.TransactionException;

import com.program.hibernate1.dto.StudentDTO;

public class StudentDAO {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		StudentDTO student = new StudentDTO();
		student.setId(121);
		student.setName("Abc");
		student.setEmail("abc143@gmail.com");
		student.setAddress("dange chowk, pune");
		student.setCity("Pune");
		
		entityManager.persist(student);
		entityTransaction.commit();
		
		entityManagerFactory.close();
		entityManager.close();
		
		try {
			entityTransaction.rollback();
		} catch (Exception e) {
			System.out.println("transaction is commited...");
		}
	}
}
