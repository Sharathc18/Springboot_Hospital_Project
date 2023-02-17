package com.ty.springboot_hospitalproject.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "name not be null")
	@NotBlank(message = "name not be Blank")
	private String name;
	
	@NotNull(message = "age not be null")
	@NotBlank(message = "age not be Blank")
	private int age;
	
	@NotNull(message = "address not be null")
	@NotBlank(message = "address not be Blank")
	private String address;
	
	@NotNull(message = "phone not be null")
	@NotBlank(message = "phone not be Blank")
	private long phone;
	

	
}
