package com.program.hibernate4.mapping.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class UniversityDTO {
	@Id
	private String name;
	private String city;
	private String website;
	private int noOFDepartment;
	private int established;
	
	@OneToMany
	private List<CollegeDTO> colleges;
}
