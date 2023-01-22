package com.program.hibernate4.mapping.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

public class StudentSubjectDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("unit");
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
				System.out.println("transaction is committed...");
			}
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			StudentsDTO studentsDTO = new StudentsDTO();
			studentsDTO.setStdID(1);
			studentsDTO.setName("mayur");
						
			StudentsDTO studentsDTO2 = new StudentsDTO();
			studentsDTO2.setStdID(2);
			studentsDTO2.setName("shubham");
						
			SubjectsDTO subjectsDTO = new SubjectsDTO();
			subjectsDTO.setNo(11);
			subjectsDTO.setName("j2ee");
			subjectsDTO.setMaxMarks(50);
			
			SubjectsDTO subjectsDTO2 = new SubjectsDTO();
			subjectsDTO2.setNo(12);
			subjectsDTO.setName("web tech");
			subjectsDTO.setMaxMarks(50);
			
			List<SubjectsDTO> subjects = Arrays.asList(subjectsDTO,subjectsDTO2);
			studentsDTO.setSubjects(subjects);
			studentsDTO2.setSubjects(subjects);
			
			manager.persist(subjectsDTO);
			manager.persist(subjectsDTO2);
			manager.persist(studentsDTO);
			manager.persist(studentsDTO2);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}		
	}
}
