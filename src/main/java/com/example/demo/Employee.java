package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double salary;
    private String result;

    public Employee() {
    }

    public Employee(String name,double salary) {
        this.name = name;
        this.salary = salary;
        if (salary > 50000) {
            this.result = "High Paying Job";
        } else {
            this.result = "Low Paying Job";
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public String getResult() {
        return result;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        if (salary > 50000) {
            this.result = "High Paying Job";
        } else {
            this.result = "Low Paying Job";
        }
    }

}
