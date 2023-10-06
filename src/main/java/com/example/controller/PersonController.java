package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.PersonService;
import com.example.entity.Person;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@GetMapping("/person/data")
	public ResponseEntity<Person> personDateById(@RequestParam int personId) {
		
		Person person=  service.personData(personId);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	
	@GetMapping("person/list")
	public List<Person> personDateById() {
		
		return service.personAllData();
	}
	
	@PostMapping("/person/save")
	public Person updateRecord(@RequestParam int personId , @RequestParam String name)
	{
		return service.updateRecord(personId, name);
	}


}
