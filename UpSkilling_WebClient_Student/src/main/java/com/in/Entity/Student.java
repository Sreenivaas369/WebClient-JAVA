package com.in.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Studenttable")
@Entity
public class Student {
	
	@Id
	private int studentId;
	private String studentName;
	private String studentLocation;
	private int collegeId;

}
