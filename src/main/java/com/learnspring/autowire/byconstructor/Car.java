package com.learnspring.autowire.byconstructor;

public class Car {

    private Specification specification;

    public Car(Specification specification){
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Car{" +
                "specification=" + specification +
                '}';
    }
}
