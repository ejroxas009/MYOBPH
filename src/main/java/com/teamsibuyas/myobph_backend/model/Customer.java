package com.teamsibuyas.myobph_backend.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;
	private LocalDate registerDate;
	@ManyToOne(optional = false)
	@JoinColumn (name = "companyId")
	private Company company;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String status;
	private String occupation;
	private LocalDate birthdate;
	private String contactNumber;
	private String houseNo;
	private String streetAddress;
	private String barangayAddress;
	private String cityAddress;
	private String regionalAddress;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public LocalDate getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getBarangayAddress() {
		return barangayAddress;
	}
	public void setBarangayAddress(String barangayAddress) {
		this.barangayAddress = barangayAddress;
	}
	public String getCityAddress() {
		return cityAddress;
	}
	public void setCityAddress(String cityAddress) {
		this.cityAddress = cityAddress;
	}
	public String getRegionalAddress() {
		return regionalAddress;
	}
	public void setRegionalAddress(String regionalAddress) {
		this.regionalAddress = regionalAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", registerDate=" + registerDate + ", company=" + company
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", gender=" + gender
				+ ", status=" + status + ", occupation=" + occupation + ", birthdate=" + birthdate + ", contactNumber="
				+ contactNumber + ", houseNo=" + houseNo + ", streetAddress=" + streetAddress + ", barangayAddress="
				+ barangayAddress + ", cityAddress=" + cityAddress + ", regionalAddress=" + regionalAddress + "]";
	}
	
	
	
}
