package com.codeclan.example.EmployeeTrackerService;

import com.codeclan.example.EmployeeTrackerService.models.Department;
import com.codeclan.example.EmployeeTrackerService.models.Employee;
import com.codeclan.example.EmployeeTrackerService.models.Project;
import com.codeclan.example.EmployeeTrackerService.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeTrackerService.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeTrackerService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeTrackerServiceApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testTracker(){
		Department department1 = new Department("Finance");
		departmentRepository.save(department1);

		Employee employee = new Employee("John", "Smith", 654321, department1);
		employeeRepository.save(employee);

		Project project = new Project("GetGood", 365);
		projectRepository.save(project);
	}

}
