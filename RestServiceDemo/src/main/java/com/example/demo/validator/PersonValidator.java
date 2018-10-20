package com.example.demo.validator;

import com.example.demo.AppConstants;
import com.example.demo.model.CommonModel;
import com.example.demo.model.Person;

public class PersonValidator {
	
	private CommonModel mResponse;
	
	public CommonModel validate(Person p) {
		mResponse = new CommonModel();
		
		if(p == null
				|| p.getId() == null
				|| p.getName().isEmpty()
				|| p.getAge() == null
				|| p.getGender().isEmpty()
				|| p.getHobbies() == null) {
			mResponse.setCode(AppConstants.CODE_FAILURE);
			mResponse.setMessage("Insufficient data provided.");
		}
		else {
			mResponse.setCode(AppConstants.CODE_SUCCESS);
			mResponse.setMessage("Person added successfully.");
		}
		return mResponse;
	}
}
