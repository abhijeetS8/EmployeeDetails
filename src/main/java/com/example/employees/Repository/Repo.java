package com.example.employees.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employees.empl.Employee;


public interface Repo extends JpaRepository<Employee, Long> {

}
