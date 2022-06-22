package com.example.entity;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Entityy {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotBlank(message = "Name is mandatory")
	private String flightname;
	@NotBlank(message = "Name is mandatory")
	private String airlinename;
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Entityy [id=" + id + ", flightname=" + flightname + ", airlinename=" + airlinename + "]";
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public Entityy(Integer id, String flightname, String airlinename) {
		super();
		this.id = id;
		this.flightname = flightname;
		this.airlinename = airlinename;
	}
	public Entityy() {
		super();
	}
	
	

}
