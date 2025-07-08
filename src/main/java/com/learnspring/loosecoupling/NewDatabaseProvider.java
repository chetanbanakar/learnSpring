package com.learnspring.loosecoupling;

public class NewDatabaseProvider implements DatabaseProvider{

    @Override
    public String getUserDetails() {
        return "New Database";
    }
}
