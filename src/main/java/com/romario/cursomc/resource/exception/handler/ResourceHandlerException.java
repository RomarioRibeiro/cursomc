package com.romario.cursomc.resource.exception.handler;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.annotations.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.romario.cursomc.resource.exception.objectionException;

import javassist.tools.rmi.ObjectNotFoundException;

@ControllerAdvice
public class ResourceHandlerException {

	@ExceptionHandler(objectionException.class)
	public ResponseEntity<Standarerror> objectnotfound(ObjectNotFoundException e, HttpServletRequest request){
		Standarerror err = new Standarerror(HttpStatus.NOT_FOUND.value(),e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
}
