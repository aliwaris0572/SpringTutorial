package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AppConstants;
import com.example.demo.model.CommonModel;
import com.example.demo.model.Person;
import com.example.demo.service.IPersonService;
import com.example.demo.validator.PersonValidator;


@RestController
public class PersonController {

	@Autowired
	private CommonModel service;
	
	@Autowired
	private IPersonService iPersonService;
	
	@GetMapping("/getAllPersons")
	public CommonModel getAllPersons() {
		service.setCode(AppConstants.CODE_SUCCESS);
		service.setMessage("Details received successfully");
		service.setData(iPersonService.getAllPersons());
		return service;
	}
	
	@RequestMapping(value="/getPerson", params= {"id"}, method=RequestMethod.GET)
	public CommonModel getPerson(@RequestParam Long id) {
		try {
			service.setCode(AppConstants.CODE_SUCCESS);
			service.setMessage("Person details received");
			service.setData(iPersonService.getPerson(id));
		} catch (Exception e) {
			service.setCode(AppConstants.CODE_FAILURE);
			service.setMessage(e.getMessage());
			service.setData(null);
			e.printStackTrace();
			return service;
		}
		return service;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public CommonModel addPerson(@RequestBody Person p) {
		PersonValidator validator = new PersonValidator();
		CommonModel mValidated = validator.validate(p);
		
		if(mValidated.getCode() == AppConstants.CODE_FAILURE)
			return service = mValidated;
		else {
			//TODO
		return service = mValidated;
		}
	}
	
}
