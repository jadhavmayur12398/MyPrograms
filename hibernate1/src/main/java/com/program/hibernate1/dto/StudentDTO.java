package com.program.hibernate1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentDTO {
	@Id
	private int Id;
	private String Name;
	private String Email;
	private String Address;
	private String City;
}
