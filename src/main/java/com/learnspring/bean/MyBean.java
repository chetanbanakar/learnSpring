package com.learnspring.bean;

public class MyBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage(){
        System.out.println("Meaasge: " + message);
    }

    @Override
    public String toString() {
        return "My First Bean Class message: " + message;
    }
}
