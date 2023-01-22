package com.program.hibernate4.mapping.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class StatesDTO {
	@Id
	private String name;
	private String chiefMinister;
	private String governor;
	private String officialDance;
	private String sport;
	
	@ManyToOne
	private CountryDTO country;
}
