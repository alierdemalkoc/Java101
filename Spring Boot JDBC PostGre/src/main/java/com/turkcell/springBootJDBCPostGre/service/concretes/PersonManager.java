package com.turkcell.springBootJDBCPostGre.service.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkcell.springBootJDBCPostGre.model.Person;
import com.turkcell.springBootJDBCPostGre.repository.abstracts.PersonRepositoryIF;
import com.turkcell.springBootJDBCPostGre.service.abstracts.PersonService;

@Service
public class PersonManager implements PersonService {
	
	@Autowired
	PersonRepositoryIF personRepositoryIF;

	@Override
	public List<Person> getAll() {
		return personRepositoryIF.getAll();
	}

	@Override
	public Person getById(int personId) {
		Person person = personRepositoryIF.getById(personId);
		if (person !=null) {
			return person;
		} else {
			return null;
		}
	}

	@Override
	public Person getByName(String personName) {
		Person person = personRepositoryIF.getByName(personName);
		if (person !=null) {
			return person;
		} else {
			return null;
		}
	}

	@Override
	public boolean save(Person person) {
		return personRepositoryIF.save(person);
	}

	@Override
	public boolean update(Person person) {
		if (isExistById(person.getPersonId())) {
			return personRepositoryIF.update(person);
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(int personId) {
		if (isExistById(personId)) {
			return personRepositoryIF.delete(personId);
		} else {
			return false;
		}
	}
	
	private boolean isExistById(int personId) {

		return personRepositoryIF.getById(personId) != null;
	}

}
