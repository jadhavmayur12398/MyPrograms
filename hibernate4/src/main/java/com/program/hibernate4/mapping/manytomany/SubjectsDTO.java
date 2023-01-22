package com.program.hibernate4.mapping.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SubjectsDTO {
	@Id
	private String name;
	private int no;
	private int maxMarks;	
}
