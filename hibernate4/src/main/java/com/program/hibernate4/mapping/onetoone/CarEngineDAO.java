package com.program.hibernate4.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

public class CarEngineDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaciton;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("unit");
		manager = factory.createEntityManager();
		transaciton = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory!=null) {
			factory.close();
		}
		if (manager!=null) {
			manager.close();
		}
		if (transaciton!=null) {
			try {
				transaciton.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction is committed....");
			}
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaciton.begin();
			
			CarDTO carDTO = new CarDTO();
			carDTO.setNo("MH15AB1234");
			carDTO.setSeats(7);
			carDTO.setColor("black");
			carDTO.setLoadCapasity(500);
			manager.persist(carDTO);
			
			EngineDTO engineDTO = new EngineDTO();
			engineDTO.setHp(50);
			engineDTO.setFuel("Deasel");
			engineDTO.setManufacturer("TATA");
			engineDTO.setNoOFCylinder(4);
			engineDTO.setWaight(600);
			manager.persist(engineDTO);
			
			carDTO.setEngine(engineDTO);
			
			transaciton.commit();
		} finally {
			closeConnection();
		}
	}
}
