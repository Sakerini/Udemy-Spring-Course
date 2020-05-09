package com.sakerini.springbootdemo.dao;

import com.sakerini.springbootdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // CRUD METHOS FOR FREE BEAUTIFUL
}
