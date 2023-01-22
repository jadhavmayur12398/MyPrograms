package com.program.hibernate4.mapping.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

public class StateCountryDAO {
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
			
			CountryDTO countryDTO = new  CountryDTO();
			countryDTO.setName("India");
			countryDTO.setCapital("New Delhi");
			countryDTO.setCurrency("the indian ruppe");
			countryDTO.setNationalAnthem("jana gana mana");
			manager.persist(countryDTO);
			
			StatesDTO statesDTO = new StatesDTO();
			statesDTO.setName("maharashtra");
			statesDTO.setChiefMinister("eknath shinde");
			statesDTO.setGovernor("bhagat singh koshyari");
			statesDTO.setOfficialDance("lavani");
			statesDTO.setSport("kabaddi");
			manager.persist(statesDTO);
			
			StatesDTO statesDTO2 = new StatesDTO();
			statesDTO2.setName("telangana");
			statesDTO2.setChiefMinister("kalvankuntla chandrashekhar rao");
			statesDTO2.setGovernor("tamilisai soundararajan");
			statesDTO2.setOfficialDance("perini shivathandavam");
			statesDTO2.setSport("kabaddi");
			manager.persist(statesDTO2);
			
			statesDTO.setCountry(countryDTO);
			statesDTO2.setCountry(countryDTO);
			
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
