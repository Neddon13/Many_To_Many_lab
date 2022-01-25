package com.codeclan.example.EmployeeTrackerService.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
    
    @Column(name = "name")
    private String name;
    
}
