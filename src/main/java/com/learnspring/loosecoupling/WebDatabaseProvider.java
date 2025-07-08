package com.learnspring.loosecoupling;

public class WebDatabaseProvider implements DatabaseProvider{
    @Override
    public String getUserDetails() {
        return "Web Database";
    }
}
