package com.turkcell.springBootJDBCPostGre.repository.concretes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turkcell.springBootJDBCPostGre.model.Person;
import com.turkcell.springBootJDBCPostGre.model.PersonRowMapper;
import com.turkcell.springBootJDBCPostGre.repository.abstracts.PersonRepositoryIF;

@Repository
public class PersonRepository implements PersonRepositoryIF {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public boolean save(Person person) {
		String sql = "insert into person (name) values (:name)";
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("name", person.getPersonName());
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
	}
	
	@Override
	public boolean update(Person person) {
		String sql = "update person set name = :name where id = :id";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("name", person.getPersonName());
		paramMap.put("id", person.getPersonId());
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
	}
	
	@Override
	public boolean delete(int personId) {
		String sql = "delete from person where id = :id";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", personId);
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
	}
	
	@Override
	public ArrayList<Person> getAll() {
		String sql = "select * from person";
		ArrayList<Person> liste = (ArrayList<Person>) namedParameterJdbcTemplate.query(sql, new PersonRowMapper());
		return liste;
	}
	
	@Override
	public Person getById(int personId) {
		String sql = "select * from person where id = :id";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", personId);
		
		try {
			Person person = namedParameterJdbcTemplate.queryForObject(sql, paramMap, new PersonRowMapper());
			return person;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public Person getByName(String personName) {
		String sql = "select * from person where name = :name";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("name", personName);
		
		try {
			Person person = namedParameterJdbcTemplate.queryForObject(sql, paramMap, new PersonRowMapper());
			return person;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
