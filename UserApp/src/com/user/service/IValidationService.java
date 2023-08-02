package com.user.service;

import com.user.exception.NameExistsException;
import com.user.exception.TooLongException;
import com.user.exception.TooShortException;

public interface IValidationService {
	 boolean validateUserName(String username) throws NameExistsException;
	 boolean validatePassword(String password) throws TooLongException,TooShortException;
}
