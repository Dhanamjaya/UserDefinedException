package com.app.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class NoBookByIdException {

	@ExceptionHandler(value = NoBookFoundException.class)
	public String handNoBookFound() {

		return "CustomError";

	}
}
