package com.crudoperation.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="employees")
public class EmployeeModel {
	
	public EmployeeModel() {
		super();
	}
	public EmployeeModel(int empId, String empName, String empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	@Column(name="empName")
	private String empName;
	
	 @Column(name="empSalary")
	 private String empSalary;
	 
	 public void setEmpId(int empId) 
	 {
		 this.empId=empId;
	 }
	 public int getEmpId() 
	 {
		 return empId;
	 }
	
	 public void setEmpName(String empName) 
	 {
		 this.empName=empName;
	 }
	 public String getEmpName() 
	 {
		return empName; 
	 }
	 public void setEmpSalary(String empSalary ) 
	 {
		this.empSalary=empSalary; 
	 }
	 public String getEmpSalary() 
	 {
		 return empSalary;
	 }
	 
	 public String toString() 
	 {
		 return "Emplyee [empId="+ empId +", empName="+empName+" empSalary="+empSalary+"]";
	 }
	 

}
