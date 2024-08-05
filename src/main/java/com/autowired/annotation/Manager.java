package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

//    Here is the field injection
//    @Autowired
//    @Qualifier("employee")
    private Employee employee;

//    Spring framework automatically injecting bean,
//    here is the constructor injection
//    preferred over field injection, though additional boiler plate code
    @Autowired
    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
