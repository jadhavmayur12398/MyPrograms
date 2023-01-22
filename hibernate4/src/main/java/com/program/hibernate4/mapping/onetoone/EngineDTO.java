package com.program.hibernate4.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EngineDTO {
	@Id
	private int hp;
	private int waight;
	private String manufacturer;
	private int noOFCylinder;
	private String fuel;
}
