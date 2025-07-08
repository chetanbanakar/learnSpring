package com.learnspring.setterinjection;

public class Car {

    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Car{" +
                "specification=" + specification +
                '}';
    }
}
