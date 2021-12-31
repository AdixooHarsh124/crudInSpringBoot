package com.crudoperation.demo.controller;

import com.crudoperation.demo.model.EmployeeModel;
import com.crudoperation.demo.services.EmployeeSevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class EmployeeController {
    
	@Autowired 
	EmployeeSevices Service;
	
	@GetMapping("/employeeGet")
	public List<EmployeeModel> getAllEmployee()
	{
		System.out.println("Get Mapping");
		return Service.getAllEmployee();
	}
	
	@PostMapping("/employeePost")
	public void saveEmployee(@RequestBody EmployeeModel employee) 
	{
		Service.saveEmployee(employee);
	}
	@GetMapping("/employee/{empId}")
	public EmployeeModel getEmployeeById(@PathVariable("empId") int empId) 
	{
		return Service.getEmployeeById(empId);
	}
	
	@DeleteMapping("/employeeDelete/{empId}")
	public void deleteEmployeeById(@PathVariable("empId") int empId) 
	{
		Service.deleteEmployeeById(empId);
	}
	@PutMapping("/employeePut/{empId}")
	public void updateEmployeeById(@RequestBody EmployeeModel employee) 
	{
		System.out.println(employee);
		Service.updateEmployeeById(employee);
	}
	@PutMapping("/employeePut/{empId}")
	public void updateEmployeeById(@RequestBody EmployeeModel employee,@PathVariable("empId") int empId) 
	{
		
		Service.updateEmployeeByIdbyPatch(employee,empId);
	}
	
}
