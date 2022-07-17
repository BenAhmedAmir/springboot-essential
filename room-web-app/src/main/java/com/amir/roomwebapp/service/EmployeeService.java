package com.amir.roomwebapp.service;

import com.amir.roomwebapp.data.EmployeeRepository;
import com.amir.roomwebapp.model.Employee;
import com.amir.roomwebapp.model.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
}
