package com.matej19.hibernate.addressbook.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String surname;
	
	@OneToMany(mappedBy = "owner")
	private List<Phone> phones = new ArrayList<Phone>();
	
	@OneToMany(mappedBy = "owner")
	private List<Email> emails = new ArrayList<Email>();
	
	
	public Person() {};
	
	public Person(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhone_numbers(List<Phone> phones) {
		this.phones = phones;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	
	@Override
    public String toString() {
		if (phones != null && phones.size() > 0) {
			return name + " " + surname + " " + phones.get(0).getNumber();
		}
		
        return name + " " + surname;
    }

}
