package com.autowire.constructor;

public class Car {
    private Specification specification1;

    public Car(Specification specification1) {
        this.specification1 = specification1;
    }

//    public void setSpecification1(Specification specification) {
//        this.specification1 = specification;
//    }

    public void displayDetails(){
        System.out.println("Car Details : " + specification1.toString());
    }

}
