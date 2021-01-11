
  package com.demo.controller;
  
  import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.demo.exception.ErrorDetails;
import com.demo.exception.EventNotFound;


  @ControllerAdvice
  @RestController 
  public class ExceptionHandlerController extends ResponseEntityExceptionHandler{
  
 @ExceptionHandler(Exception.class) public final ResponseEntity<Object>
  handleAllExceptions(Exception ex, WebRequest request) { 
	 ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
  request.getDescription(false),"ks@gmail.com"); 
  return new ResponseEntity<Object>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR); }
  
  @ExceptionHandler(EventNotFound.class)
  public ResponseEntity<Object> handleBookNotFoundEx( EventNotFound ex,WebRequest req) {
   ErrorDetails details = new ErrorDetails(new Date(),"resource not found", req.getDescription(false),"ks@gmail.com"); return new
  ResponseEntity<Object>(details, HttpStatus.NOT_FOUND); }
  
  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
          HttpHeaders headers, HttpStatus status, WebRequest request) {
      ErrorDetails detail=new ErrorDetails();
      detail.setContact("ks@gmail.com");
      detail.setDetails("invalid search");
      detail.setMessage(ex.getMessage());
      detail.setTimestamp(new Date());
      return new ResponseEntity<Object>(detail, HttpStatus.BAD_REQUEST);
  }
 
  
  }
  
 