package com.codeclan.example.EmployeeTrackerService.repositories;

import com.codeclan.example.EmployeeTrackerService.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
