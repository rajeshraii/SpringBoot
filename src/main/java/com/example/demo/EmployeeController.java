package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService=new EmployeeService();

    @GetMapping("/employees")
        public List<Employee> getEmployee(){
            return employeeService.getAllEmployees();
        }

    @PostMapping("/employee")
    public List<Employee> getNewEmployee(@RequestBody List<Employee> employeeslist){
        return employeeService.addEmployee(employeeslist);
    }
}