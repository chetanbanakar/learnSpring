package com.learnspring.loosecoupling;

public class UserManager {
    DatabaseProvider databaseProvider;

    public UserManager(DatabaseProvider databaseProvider){
        this.databaseProvider = databaseProvider;
    }

    public String getUserDetails(){
        return this.databaseProvider.getUserDetails();
    }
}
