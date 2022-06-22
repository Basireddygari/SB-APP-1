package com.example.controller;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Entityy;
import com.example.repo.Repoo;

@RestController
public class FlightController {
	
	@Autowired
	private Repoo r;
		@GetMapping("/hello")
	public String welcomeMessage() {
		return "hello suguna,welcome to cts.....";
	}
	
	@PostMapping(value="/dbb",consumes= {"application/json"})
	public ResponseEntity<String> load(@RequestBody Entityy t) {
	 r.save(t);
		System.out.println(t);
		return new ResponseEntity<String>("succ",HttpStatus.CREATED);
	}
	@DeleteMapping("/deletee")
	public ResponseEntity<String> deleteeee(@RequestParam("id") Integer id) {
		
		r.deleteById(id);
		System.out.println(id);
		return new ResponseEntity<>("deleted succesfully",HttpStatus.OK);
	}
					@PutMapping(value="/putt",consumes= {"application/json"})
					public ResponseEntity<String> putt( @RequestParam("idd") Integer idd,@Valid @RequestBody Entityy ttt) throws ResourceNotFoundException {
						Entityy t9=r.findById(idd).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: "));
						t9.setAirlinename(ttt.getAirlinename());
						t9.setFlightname(ttt.getFlightname());
						r.save(t9);
					
						return new ResponseEntity<>("succesfully updated",HttpStatus.OK);
					}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
	
	@GetMapping("/flightPrice")
	public Double getFlightPrice() {
		HttpHeaders h=new HttpHeaders();
		HttpEntity<String> entity=new HttpEntity<String>(h);
		RestTemplate rt=new RestTemplate();
		Double price=rt.exchange("http://localhost:9090/getPrice",HttpMethod.GET,entity,Double.class).getBody();
	return price;
	}
}
