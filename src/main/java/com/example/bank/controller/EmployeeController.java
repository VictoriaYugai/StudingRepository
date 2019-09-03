package com.example.bank.controller;

import com.example.bank.entity.Employee;
import com.example.bank.service.DefaultEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/employee")
public class EmployeeController {

    DefaultEmployeeService defaultEmployeeService;

    public EmployeeController(@Autowired DefaultEmployeeService defaultEmployeeService) {
        this.defaultEmployeeService = defaultEmployeeService;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.defaultEmployeeService.addEmployee(employee);
    }

    @PutMapping
    public Employee editEmployeeName(String name, Long id) {
        return this.defaultEmployeeService.editEmployeeName(name, id);
    }

    @GetMapping ("/all")
    public List<Employee> getAll(){
        return this.defaultEmployeeService.getAll();
    }
}
