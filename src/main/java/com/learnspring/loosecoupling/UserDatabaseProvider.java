package com.learnspring.loosecoupling;

public class UserDatabaseProvider implements DatabaseProvider{
    @Override
    public String getUserDetails() {
        return "User Database";
    }
}
