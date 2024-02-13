package com.example.employees.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employees.Repository.Repo;
import com.example.employees.empl.Employee;

@Service
public class service {

	@Autowired
	private Repo employeeRepo;

	public void saveOneEmloyee(Employee employee) {
		employeeRepo.save(employee);
	}

	public Employee getemployee(Long id) {
		Optional<Employee>findById  = employeeRepo.findById(id);
		Employee employee = findById.get();
		return employee;
	}
	
	public Employee UpdateEmployee(Long id, Employee employee) {
		Optional<Employee> findById = employeeRepo.findById(id);
		Employee employee1 = findById.get();
		employee1.setFirstName(employee.getFirstName());
		employee1.setLastName(employee.getLastName());
		employee1.setLocation(employee.getLocation());
		employeeRepo.save(employee1);
		return employee;
	}

	public void DeleteEmployee(Long id) {
		employeeRepo.deleteById(id);
	}

	public List<Employee> getallemployee() {
		List<Employee> findAll = employeeRepo.findAll();
		return findAll;
	}

	public void save(Employee employee) {
		employeeRepo.save(employee);
		
	}

}