package com.pattern.creational.builder;

public class BuilderApp {
    public static void main(String []args){
        Employee employee = new EmployeeBuilder().setId("001").setName("emp").build();
        System.out.println(employee.toString());
    }
}