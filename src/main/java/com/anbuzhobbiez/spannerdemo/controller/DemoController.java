package com.anbuzhobbiez.spannerdemo.controller;

import com.anbuzhobbiez.spannerdemo.model.Employee;
import com.anbuzhobbiez.spannerdemo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DemoController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        employeeRepository.save(new Employee(
                UUID.randomUUID().toString(),
                name
        ));
        return "Hello "+name;
    }
}
