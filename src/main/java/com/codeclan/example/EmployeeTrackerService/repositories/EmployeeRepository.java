package com.codeclan.example.EmployeeTrackerService.repositories;

import com.codeclan.example.EmployeeTrackerService.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
