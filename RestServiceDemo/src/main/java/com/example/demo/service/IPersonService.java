package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Persons;
import com.example.demo.model.Person;

public interface IPersonService {
	public List<Person> getAllPersons();
	public Person getPerson(Long id) throws Exception;
	public boolean addPerson(Persons personData);
	public boolean removePerson(Long id);
}
