package com.componentscan.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// by default component with register bean with class name with small caps
// employee1, employee2 won't work, unless you change the name in getBean() method
// custom name is possible

@Component("employee")
public class Employee {

    @Value("123")
    private int employeeId;
    @Value("Harry")
    private String firstName;
    @Value("${java.home}")
    private String lastName;
    @Value("#{2*1000}")
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
