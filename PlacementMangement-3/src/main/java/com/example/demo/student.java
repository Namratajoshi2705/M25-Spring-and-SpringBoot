package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class student {
	@Id
	
	private int id;
	private String name;
	private int roll;
	private String qualification;
	private String course;
	private int year;
	private int halltikitno;
	
	//default constructor
	public student() {
		super();
		
		
	}
	//parameterized constructor

	public student(int id, String name, int roll, String qualification, String course, int year, int halltikitno) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.halltikitno = halltikitno;
	}
	//setters and getters method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHalltikitno() {
		return halltikitno;
	}

	public void setHalltikitno(int halltikitno) {
		this.halltikitno = halltikitno;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", halltikitno=" + halltikitno + "]";
	}
	
	

}
