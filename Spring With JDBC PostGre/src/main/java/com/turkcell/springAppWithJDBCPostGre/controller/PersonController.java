package com.turkcell.springAppWithJDBCPostGre.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.springAppWithJDBCPostGre.model.Person;
import com.turkcell.springAppWithJDBCPostGre.repository.PersonRepository;

@RestController
@RequestMapping(path = "person")
public class PersonController {
	
	@Autowired
	public PersonRepository personRepository;
	
	@GetMapping(path = "getAll")
	public ArrayList<Person> getAll() {
		return personRepository.getAll();
	}
	
	@GetMapping(path = "getById")
	public ResponseEntity<Object> getById(@RequestParam int personId) {
		if (personRepository.getById(personId) != null) {
			return ResponseEntity.status(HttpStatus.OK).body(personRepository.getById(personId));
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Not found in the database!!!");
		}
	}
	
	@PostMapping(path = "save")
	public ResponseEntity<String> save(@RequestBody Person person) {
		if (personRepository.save(person)) {
			return ResponseEntity.status(HttpStatus.CREATED).body(person.getPersonName() + " saved to person database");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Person could not be saved in the database ");
		}
	}
	
	@PostMapping(path = "update")
	public ResponseEntity<String> update(@RequestBody Person person) {
		if (personRepository.update(person)) {
			return ResponseEntity.status(HttpStatus.OK).body("Person is updated in the database.");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Person could not be updated in the database ");
		}
	}
	
	@DeleteMapping(path = "delete")
	public ResponseEntity<String> deleteById(@RequestParam int id) {
		if (personRepository.delete(id)) {
			return ResponseEntity.status(HttpStatus.OK).body("Person is deleted in the database.");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Person could not be deleted in the database ");
		}
	}

}
