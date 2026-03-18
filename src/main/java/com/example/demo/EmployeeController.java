package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // POST METHOD API
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // GET METHOD API
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // GET METHOD API FOR ONE ID
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    // UPDATE METHOD API
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    // DELETE API
    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        return employeeService.deleteEmployeeById(id);
    }

    // PATCH UPDATE API
    @PatchMapping("/employees/{id}/salary")
    public Employee updateSalary(@PathVariable int id, @RequestParam double salary) {
        return employeeService.updateSalary(id, salary);
    }

    // API FOR SALARY RANGE
    @GetMapping("/employees/salary")
    public ResponseEntity<List<Employee>> getBySalaryRange(
            @RequestParam double min,
            @RequestParam double max) {
        return ResponseEntity.ok(
                employeeService.getEmployeesBySalaryRange(min, max));
    }

    // API FOR GET THE DETAILS BY NAME
    @GetMapping("/employees/search")
    public ResponseEntity<List<Employee>> getByName(@RequestParam String name) {
        return ResponseEntity.ok(employeeService.getEmployeeByName(name));
    }

    // API TO GET THE COUNT
    @GetMapping("/employees/count")
    public long getCount() {
        return employeeService.getCount();
    }

    // API FOR GET THE HIGH PAYING DETAILS
    @GetMapping("/employees/highpaying")
    public List<Employee> getHighPayingList() {
        return employeeService.getHighPayingList();
    }

    // API to get the low paying details
    @GetMapping("/employees/lowpaying")
    public List<Employee> getLowPayingList() {
        return employeeService.getLowPayingList();
    }

    // API to get the Employee details in sorted order
    @GetMapping("/employees/sorted")
    public List<Employee> getSortedDetails() {
        return employeeService.getSortedList();
    }

    // API to get the Employee details by exact name
    @GetMapping("/employees/find")
    public List<Employee> getDetailsByName(String name) {
        return employeeService.getByName(name);
    }

}