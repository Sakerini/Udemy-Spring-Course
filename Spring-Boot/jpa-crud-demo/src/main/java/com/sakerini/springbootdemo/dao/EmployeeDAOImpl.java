package com.sakerini.springbootdemo.dao;

import com.sakerini.springbootdemo.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {

       Query query =
               entityManager.createQuery("from Employee");

       List<Employee> employees = query.getResultList();
       return employees;
    }

    @Override
    public Employee findById(int Id) {

        Employee employee = entityManager.find(Employee.class, Id);
        return employee;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Employee dbEmployee = entityManager.merge(employee);

        employee.setId(dbEmployee.getId());
    }

    @Override
    public void deleteById(int Id) {
        Query query = entityManager.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", Id);
        query.executeUpdate();
    }
}
