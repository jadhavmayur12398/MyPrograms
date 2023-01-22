package com.program.hibernate4.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class CarDTO {
	@Id
	private String no;
	private String color;
	private int seats;
	private int loadCapasity;
	
	@OneToOne
	private EngineDTO engine;
	
}
