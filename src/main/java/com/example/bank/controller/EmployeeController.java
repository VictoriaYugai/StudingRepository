package com.example.bank.controller;

import com.example.bank.entity.Employee;
import com.example.bank.service.EmpoloyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/employee")
public class EmployeeController {

    EmpoloyeeService empoloyeeService;

    public EmployeeController(@Autowired EmpoloyeeService empoloyeeService) {
        this.empoloyeeService = empoloyeeService;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.empoloyeeService.addEmployee(employee);
    }

    @PutMapping
    public Employee editEmployeeName(String name, Long id) {
        return this.empoloyeeService.editEmployeeName(name, id);
    }

    @GetMapping
    public List<Employee> getAll(){
        return this.empoloyeeService.getAll();
    }
}
