package com.cars.ColorService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid Excel Formate")
public class InvalidDetailsException extends Exception {

	public InvalidDetailsException(String message) {
	}

}
