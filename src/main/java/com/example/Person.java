package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Person {
	private int age;

	private String fullName;

	private Date dateOfBirth;
}
