package com.codeclan.example.EmployeeTrackerService.repositories;

import com.codeclan.example.EmployeeTrackerService.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
