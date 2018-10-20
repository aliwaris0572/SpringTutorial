package com.example.demo.model;

import java.util.List;

public class Person {
	private Long id;
	private Integer age;
	private String name, gender;
	private List<String> hobbies;
	
	
	
	public Person(Long id, Integer age, String name, String gender, List<String> hobbies) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.hobbies = hobbies;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	

}
