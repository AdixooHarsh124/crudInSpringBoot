package com.crudoperation.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.demo.model.EmployeeModel;
import com.crudoperation.demo.repository.EmployeeRepository;
@Service
public class EmployeeSevices {

	@Autowired
	private EmployeeRepository repo;
	
	public List<EmployeeModel> getAllEmployee()
	{
		return repo.findAll();
	}
	public void saveEmployee(EmployeeModel employee) 
	{
		repo.save(employee);
	}
	public EmployeeModel getEmployeeById(int id) 
	{
		return repo.findById(id).get();
	}
	public void deleteEmployeeById(int id) 
	{
		repo.deleteById(id);
	}
	public void updateEmployeeById(EmployeeModel employee) 
	{
		repo.save(employee);
	}
	public updateEmployeeByIdbyPatch() 
	{
		
	}
}
