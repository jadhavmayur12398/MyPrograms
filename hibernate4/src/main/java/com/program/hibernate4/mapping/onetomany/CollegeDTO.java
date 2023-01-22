package com.program.hibernate4.mapping.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CollegeDTO {
	@Id
	private String name;
	private String location;
	private int noOfDepartment;
}
