package com.sakerini.employeedirectory.controller;

import com.sakerini.employeedirectory.dao.EmployeeRepository;
import com.sakerini.employeedirectory.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeService;
    private List<Employee> employees;

    @GetMapping("/list")
    public String showEmployees(Model theModel) {
        employees = employeeService.findAllByOrderByLastNameAsc();
        theModel.addAttribute("theEmployees", employees);
        return "employee-list";
    }

    @GetMapping("/showFormForAdd")
    public String showAddForm(Model theModel) {
        Employee theEmployee = new Employee();
        theModel.addAttribute("employee", theEmployee);
        return "employee-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showUpdateForm(@RequestParam("employeeId") int theId,
                                 Model theModel) {
        Optional<Employee> theEmployee = employeeService.findById(theId);
        theModel.addAttribute("employee", theEmployee);
        return "employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
        employeeService.save(theEmployee);

        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId) {
        employeeService.deleteById(theId);
        return "redirect:/employees/list";
    }
}
