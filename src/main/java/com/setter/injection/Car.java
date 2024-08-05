package com.setter.injection;

public class Car {
    Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details : " + specification.toString());
    }
}
