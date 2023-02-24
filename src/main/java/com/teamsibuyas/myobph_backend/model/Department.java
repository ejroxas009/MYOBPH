package com.teamsibuyas.myobph_backend.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Department{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_head")
	private AppUser departmentHead;
	private Boolean isDepartmentActive;
	
	

	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public AppUser getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(AppUser departmentHead) {
		this.departmentHead = departmentHead;
	}
	public Boolean getIsDepartmentActive() {
		return isDepartmentActive;
	}
	public void setIsDepartmentActive(Boolean isDepartmentActive) {
		this.isDepartmentActive = isDepartmentActive;
	}
	
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentHead="
				+ departmentHead + ", isDepartmentActive=" + isDepartmentActive + "]";
	}
}
