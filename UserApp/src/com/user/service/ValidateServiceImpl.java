package com.user.service;

import java.util.Iterator;

import com.user.exception.NameExistsException;
import com.user.exception.TooLongException;
import com.user.exception.TooShortException;

public class ValidateServiceImpl implements IValidationService {

	@Override
	public boolean validateUserName(String username) throws NameExistsException {
		String[] usernames= {"lokesh","rakesh"};
		for(String user:usernames)
		{
			if(user.equals(username)) {
				throw new NameExistsException("Name Already Exists");
			}
		}
			return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooLongException, TooShortException {
		if(password.length()<6) {
			throw new TooShortException("Password is too short");
		}
		if(password.length()>15) {
			throw new TooLongException("Password is too long");
		}
		return true;
	}
	
}
