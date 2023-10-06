package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repo.PersonRepo;
import com.example.entity.Person;
import com.example.exception.ResourceNotFound;

@Service
public class PersonService {
	
	@Autowired
	PersonRepo repo;
	
	public Person personData(int id)
	{
		Person person =repo.findById(id).orElseThrow(() -> new ResourceNotFound("Record Not Found"));
	    
	    return person;
	}
	
	public List<Person> personAllData()
	{
		return repo.findAll();
	}
	
	public Person updateRecord(int id , String name)
	{
		Person person =new Person();
		person.setId(id);
		person.setFirstName(name);
		
		return repo.save(person);
	}
	
	/*
	 * public Person createPerson(int id) { Person person= new Person();
	 * person.setId(id); person.setFirstName("Abhay"); return person;
	 * 
	 * }
	 */

}
