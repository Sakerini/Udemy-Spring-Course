package com.sakerini.springbootdemo.dao;

import com.sakerini.springbootdemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
    public Employee findById(int Id);
    public void saveEmployee(Employee employee);
    public void deleteById(int Id);
}
