package com.hila;
import java.util.Date;

public class MyPerson implements Person {
	//This class I created in order to test PersonCollection methods
	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private int height;
	
	public MyPerson(int id, String name,Date date) {
		this.dateOfBirth = date;
		this.firstName = name;
		this.id = id;
	}
	@Override
	public int getId() {
		return id;
	}
	@Override
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String getLastName() {
		return lastName;
	}
	@Override
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public int getHeight() {
		return height;
	}

	
}
