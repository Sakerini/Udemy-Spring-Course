package com.sakerini.employees.controller;

import com.sakerini.employees.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    private void loadData() {
        Employee empl1 = new Employee(1, "Roman", "Hubert", "hubertjon@gmail.com");
        Employee empl2 = new Employee(2, "Centurian", "Rickstofy", "Rickou@gmail.com");
        Employee empl3 = new Employee(3, "Alexandr", "Chaushev", "chaushevak@yandex.ru");
        Employee empl4 = new Employee(4, "Ubert", "Huberto", "hubertuberto@gmail.com");

        this.employeeList = new ArrayList<>();
        employeeList.add(empl1);
        employeeList.add(empl2);
        employeeList.add(empl3);
        employeeList.add(empl4);
    }

    @GetMapping("/list")
    public String showEmplyees(Model theModel) {

        theModel.addAttribute("theEmployees", employeeList);

        return "employees-list";
    }
}
