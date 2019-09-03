package com.example.bank.service;

import com.example.bank.entity.Employee;
import com.example.bank.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultEmployeeService implements EmployeeService{

    EmployeeRepository employeeRepository;

    public DefaultEmployeeService(@Autowired EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;

    }

    public Employee addEmployee(Employee employee){
        return this.employeeRepository.save(employee);
    }

    public Employee editEmployeeName(String name, Long id){
        Employee employee = this.employeeRepository.getOne(id);
        employee.setName(name);
        Employee save = this.employeeRepository.save(employee);
        return save;
    }

    public List<Employee> getAll(){
        return this.employeeRepository.findAll();
    }
}
