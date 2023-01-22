package com.program.hibernate4.mapping.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CountryDTO {
	@Id
	private String name;
	private String nationalAnthem;
	private String capital;
	private String currency;
}
