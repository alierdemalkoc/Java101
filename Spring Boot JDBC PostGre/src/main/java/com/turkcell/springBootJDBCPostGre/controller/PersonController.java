package com.turkcell.springBootJDBCPostGre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.springBootJDBCPostGre.model.Person;
import com.turkcell.springBootJDBCPostGre.service.abstracts.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Person>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(personService.getAll());
	}
	
	@GetMapping("/getById")
	public ResponseEntity<Person> getById(@RequestParam int personId){
		return ResponseEntity.status(HttpStatus.FOUND).body(personService.getById(personId));
	}
	
	@GetMapping("/getByName")
	public ResponseEntity<Person> getByName(@RequestParam String personName){
		return ResponseEntity.status(HttpStatus.FOUND).body(personService.getByName(personName));
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestParam Person person){
		if(personService.save(person)) {
			return ResponseEntity.ok("Person saved succesfully!");
		} else {
			return ResponseEntity.internalServerError().body("Person could not be saved!");
		}
	}
	
	@PostMapping("/update")
	public ResponseEntity<String> update(@RequestParam Person person){
		if(personService.update(person)) {
			return ResponseEntity.ok("Person updated!");
		} else {
			return ResponseEntity.internalServerError().body("Person could not be update!");
		}
	}
	
	@PostMapping("/delete")
	public ResponseEntity<String> delete(@RequestParam int personId){
		if(personService.delete(personId)) {
			return ResponseEntity.ok("Person deleted!");
		} else {
			return ResponseEntity.internalServerError().body("Person could not be delete!");
		}
	}

}
