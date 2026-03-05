package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class EmployeeService {
    public List<Employee> getAllEmployees(){
        List<Employee> employees =new ArrayList<>();
        employees.add(new Employee("Alice",01,60000));
        employees.add(new Employee("Trupthi",02,100000));
        employees.add(new Employee("Bob",03,50000));
        employees.add(new Employee("Soumya",04,70000));
        employees.add(new Employee("Srujan",05,110000));
        return employees;
    }

    public List<Employee> addEmployee(List<Employee> employeelist){
        return employeelist;

    }
}
