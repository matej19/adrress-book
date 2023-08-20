package com.matej19.hibernate.addressbook.model;

import javax.persistence.*;

@Entity
public class Email {

	public static enum Type {PERSONAL, BUSINESS}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//private Type emailType;
	private String address;
	
	@ManyToOne
	private Person owner;
	
	public Email() {};
	
	public Email(int id, Type emailType, String address) {
		super();
		this.id = id;
		//this.emailType = emailType;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Type getEmailType() {
//		return emailType;
//	}
//
//	public void setEmailType(Type emailType) {
//		this.emailType = emailType;
//	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
}
