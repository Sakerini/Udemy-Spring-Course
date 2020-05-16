package com.sakerini.employeedirectory.dao;

import com.sakerini.employeedirectory.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Free Crud Methods
    public List<Employee> findAllByOrderByLastNameAsc();
}
