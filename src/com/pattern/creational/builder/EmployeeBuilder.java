package com.pattern.creational.builder;

public class EmployeeBuilder {
    private String id;
    private String name;
    private String dept;
    private double salary;

    public EmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setDept(String dept) {
        this.dept = dept;
        return this;
    }

    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee build(){
        return new Employee(id,name,dept,salary);
    }
}