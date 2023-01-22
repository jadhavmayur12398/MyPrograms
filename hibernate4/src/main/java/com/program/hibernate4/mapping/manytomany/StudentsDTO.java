package com.program.hibernate4.mapping.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class StudentsDTO {
	@Id
	private String name;
	private int stdID;
	
	@ManyToMany
	private List<SubjectsDTO> subjects;
}
