package com.example.employees.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employees.Service.service;
import com.example.employees.empl.Employee;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class restController {

	@Autowired
	private service employeeservice;

	@PostMapping("/SaveEmployee")
	public void saveemployee(@RequestBody Employee employee) {
		employeeservice.saveOneEmloyee(employee);
	}

	@GetMapping("/GetEmployee/{id}")
	public Employee getemployee(@PathVariable Long id) {
		Employee oneemployee = employeeservice.getemployee(id);
		return oneemployee;
	}
	
	@GetMapping("/GetEmployee")
	public List<Employee> getallemployee(){
		List<Employee> getallemployee = employeeservice.getallemployee();
		return getallemployee;
				
	}
	
	@PutMapping("/UpdateEmployee/{id}")
	public Employee UpdateEmployee(@PathVariable Long id,@RequestBody Employee employee) {
		Employee UpdateEmployee = employeeservice.UpdateEmployee(id , employee);
		return UpdateEmployee;
	}
	
	@DeleteMapping("/DeleteEMployee/{id}")
	public void DeleteEmployee(@PathVariable Long id) {
		employeeservice.DeleteEmployee(id);
	}	
	
	@RequestMapping("/Register")
	 public void saveEmployee(@ModelAttribute("employee") Employee employee, Model model) {
		 employeeservice.save(employee);
	 }
	        
	 
}