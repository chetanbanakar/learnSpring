package com.learnspring.autowire.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationAutoWireByConstructor.xml");
        Car myCar= (Car) context.getBean("myCar");

        System.out.println(myCar);
    }
}
