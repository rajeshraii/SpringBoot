package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // POST METHOD TO ADD EMPLOYEE
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // GET METHOD TO GET ALL EMPLOYEES
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // GET METHOD TO GET ONE EMPLOYEE BY ID
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // DELETE METHOD TO DELETE EMPLOYEE BY ID
    public String deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
        return "The Employee with id " + id + " has been deleted";
    }

    // THE UPDATE OPERATION
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        Employee existing = employeeRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedEmployee.getName());
            existing.setSalary(updatedEmployee.getSalary());
            return employeeRepository.save(existing);
        }
        return null;
    }

    // THE PATCHUP OPERATION
    public Employee updateSalary(int id, double salary) {
        Employee existing = employeeRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setSalary(salary);
            return employeeRepository.save(existing);
        }
        return null;
    }

    // GET EMPLOYEES BY SALARY RANGE
    public List<Employee> getEmployeesBySalaryRange(double min, double max) {
        return employeeRepository.findBySalaryBetween(min, max);
    }


    // API FOR GET THE DETAILS BY NAME
    public List<Employee> getEmployeeByName(String name){
        return employeeRepository.findByNameContaining(name);
    }

    //API TO GET THE EMPLOYEE COUNT
    public long getCount(){
        return employeeRepository.count();
    }

    //CALLING 
    public List<Employee> getHighPayingList(){
        return employeeRepository.findByResult("High Paying Job");
    }

    //New Service to get the LowPaying details
    public List<Employee> getLowPayingList(){
        return employeeRepository.findByResult("Low Paying Job");
    }

    //New Service to get the details in sorted order
    public List<Employee> getSortedList(){
        return employeeRepository.findAllByOrderBySalaryDesc();
    }

    //New Service to get the details by exact name
    public List<Employee> getByName(String name){
        return employeeRepository.findByName(name);
    }
}