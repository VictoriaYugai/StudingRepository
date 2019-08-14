package com.example.bank.repository;

import com.example.bank.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

//    Employee findEmployeeById(Long id);

    List<Employee> findAll();
}
