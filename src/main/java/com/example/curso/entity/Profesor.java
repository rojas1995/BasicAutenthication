package com.example.curso.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor extends DomainEntity{

	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
