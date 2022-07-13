package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BookingEntity {
	private String firstname;
	private String lastname;
	private String name;
	private Long flightid;
	private String status; // Pending/Booked/Cancelled
	private String mobileno;
	private String mail;
	@Id
	private String  pnr;
	private Integer seatno;
	private String gender;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getFlightid() {
		return flightid;
	}
	public void setFlightid(Long flightid) {
		this.flightid = flightid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public Integer getSeatno() {
		return seatno;
	}
	public void setSeatno(Integer seatno) {
		this.seatno = seatno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BookingEntity [firstname=" + firstname + ", lastname=" + lastname + ", name=" + name + ", flightid="
				+ flightid + ", status=" + status + ", mobileno=" + mobileno + ", mail=" + mail + ", pnr=" + pnr
				+ ", seatno=" + seatno + ", gender=" + gender + "]";
	}
	

}
