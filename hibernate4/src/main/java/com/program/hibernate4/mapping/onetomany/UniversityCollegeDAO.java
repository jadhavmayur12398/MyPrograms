package com.program.hibernate4.mapping.onetomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

public class UniversityCollegeDAO {
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
			
			UniversityDTO universityDTO = new UniversityDTO();
			universityDTO.setName("savitribai phule pune university");
			universityDTO.setEstablished(1949);
			universityDTO.setCity("pune");
			universityDTO.setNoOFDepartment(46);
			universityDTO.setWebsite("unipune.ac.in");
			manager.persist(universityDTO);
			
			CollegeDTO collegeDTO = new CollegeDTO();
			collegeDTO.setName("sanghavi college of enginnering");
			collegeDTO.setNoOfDepartment(5);
			collegeDTO.setLocation("nashik");
			manager.persist(collegeDTO);
			
			CollegeDTO collegeDTO2 = new CollegeDTO();
			collegeDTO2.setName("kkw");
			collegeDTO2.setLocation("nashik");
			collegeDTO2.setNoOfDepartment(7);
			manager.persist(collegeDTO2);
			
			CollegeDTO collegeDTO3 = new CollegeDTO();
			collegeDTO3.setName("sandip foundation");
			collegeDTO3.setNoOfDepartment(8);
			collegeDTO3.setLocation("nashik");
			manager.persist(collegeDTO3);
			
			List<CollegeDTO> colleges = Arrays.asList(collegeDTO,collegeDTO2,collegeDTO3);
			universityDTO.setColleges(colleges);
			
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
