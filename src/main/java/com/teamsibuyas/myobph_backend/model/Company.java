package com.teamsibuyas.myobph_backend.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long companyId;
	private String companyName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_owner")
	private AppUser companyOwner;
	
	private String buildingNo;
	private String streetAddress;
	private String barangayAddress;
	private String cityAddress;
	private String regionalAddress;
	private String contactNumber;
	private String email;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_companyId", nullable = false)
	private List<Department> department;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "transactionId")
	private Transaction transaction;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public AppUser getCompanyOwner() {
		return companyOwner;
	}

	public void setCompanyOwner(AppUser companyOwner) {
		this.companyOwner = companyOwner;
	}

	public String getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyOwner=" + companyOwner
				+ ", buildingNo=" + buildingNo + ", streetAddress=" + streetAddress + ", barangayAddress="
				+ barangayAddress + ", cityAddress=" + cityAddress + ", regionalAddress=" + regionalAddress
				+ ", contactNumber=" + contactNumber + ", email=" + email + ", department=" + department
				+ ", transaction=" + transaction + "]";
	}

	
	
}
