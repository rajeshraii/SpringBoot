package com.example.demo;

public class Employee {
    private String name;
    private int id;
    private int salary;
    private String result;

    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    if(salary>50000){
        this.result="High Payning Job";
    }
    else{
        this.result="Low Paying Job";
    }
}
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    public String getResult(){
        return result;
    }

}
