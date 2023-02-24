package com.teamsibuyas.myobph_backend.model;

import java.time.LocalDate;

import com.teamsibuyas.myobph_backend.enumeration.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "appUserId", nullable = false)
	private Long appUserId;
	private String employeeId;
	private String  username;
	private String email;
	private String password;
	private String firstname;
	private String middlename;
	private String lastname;
	private String gender;;
	private LocalDate birthdate;
	private String contactNumber;
	private String houseNo;
	private String streedAddress;
	private String brgyAddress;
	private String cityAddress;
	private String regionalAddress;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "companyId")
	private Company company;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "departmentId")
	private Department department;
	private Role role;
	private String profileImage;
	private Boolean isActive;
	public Long getAppUserId() {
		return appUserId;
	}
	public void setAppUserId(Long appUserId) {
		this.appUserId = appUserId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getStreedAddress() {
		return streedAddress;
	}
	public void setStreedAddress(String streedAddress) {
		this.streedAddress = streedAddress;
	}
	public String getBrgyAddress() {
		return brgyAddress;
	}
	public void setBrgyAddress(String brgyAddress) {
		this.brgyAddress = brgyAddress;
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
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "AppUser [appUserId=" + appUserId + ", employeeId=" + employeeId + ", username=" + username + ", email="
				+ email + ", password=" + password + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", gender=" + gender + ", birthdate=" + birthdate + ", contactNumber="
				+ contactNumber + ", houseNo=" + houseNo + ", streedAddress=" + streedAddress + ", brgyAddress="
				+ brgyAddress + ", cityAddress=" + cityAddress + ", regionalAddress=" + regionalAddress + ", company="
				+ company + ", department=" + department + ", role=" + role + ", profileImage=" + profileImage
				+ ", isActive=" + isActive + "]";
	}
	
	
}
