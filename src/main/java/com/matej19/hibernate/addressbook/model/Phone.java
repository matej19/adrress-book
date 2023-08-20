package com.matej19.hibernate.addressbook.model;

import javax.persistence.*;

@Entity(name = "Phone")
public class Phone {
	
	public static enum Type {MOBILE, PERSONAL, BUSINESS, LANDLINE, FAX}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//private Type type;
	private String number;
	
	@ManyToOne
	private Person owner;
	
	public Phone() {};
	
	public Phone(int id, Type type, String number) {
		super();
		this.id = id;
		//this.type = type;
		this.number = number;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
//	public Type getType() {
//		return type;
//	}
//	public void setType(Type type) {
//		this.type = type;
//	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
}
