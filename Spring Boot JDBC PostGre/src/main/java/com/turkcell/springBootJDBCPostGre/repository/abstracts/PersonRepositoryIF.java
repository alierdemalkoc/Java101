package com.turkcell.springBootJDBCPostGre.repository.abstracts;

import java.util.ArrayList;

import com.turkcell.springBootJDBCPostGre.model.Person;

public interface PersonRepositoryIF {
	
	public boolean save(Person person) ;
	public boolean update(Person person);
	public boolean delete(int personId);
	public ArrayList<Person> getAll();
	public Person getById(int personId);
	public Person getByName(String personName);
	
}
