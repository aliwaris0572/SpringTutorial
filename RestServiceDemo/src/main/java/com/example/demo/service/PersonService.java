package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Persons;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonsRepo;

@Service
public class PersonService implements IPersonService {
	
	@Autowired
	private PersonsRepo repo;

	@Override
	public List<Person> getAllPersons() {
		List<Person> personsList  = new ArrayList<>();
		List<String> hobbies = new ArrayList<>();
		hobbies.add("Singing");
		hobbies.add("Reading");
		hobbies.add("Playing games");
		
		for (Persons p: repo.findAll()) {
			personsList.add(new Person(p.getId(), p.getAge(), p.getName(), p.getGender(), hobbies));
		}
		return personsList;
	}

	@Override
	public Person getPerson(Long id) throws Exception {
		Optional<Persons> opt = repo.findById(id);
		Persons p = opt.get();
		Person person = new Person(p.getId(), p.getAge(), p.getName(), p.getGender(),null);
		return person;
	}

}
