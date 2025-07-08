package com.learnspring.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        DatabaseProvider newDatabase = new NewDatabaseProvider();
//        UserManager userManager = new UserManager(newDatabase);
//        System.out.println(userManager.getUserDetails());
//
//        DatabaseProvider userDatabase = new UserDatabaseProvider();
//        UserManager userManager1 = new UserManager(userDatabase);
//        System.out.println(userManager1.getUserDetails());
//
//        DatabaseProvider webDatabase = new WebDatabaseProvider();
//        UserManager userManager2 = new UserManager(webDatabase);
//        System.out.println(userManager2.getUserDetails());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCouplingContext.xml");
        UserManager databaseProvider  = (UserManager) context.getBean("newUserManager");
        System.out.println(databaseProvider.getUserDetails());

        UserManager databaseProvider2  = (UserManager) context.getBean("userUserManager");
        System.out.println(databaseProvider2.getUserDetails());

        UserManager databaseProvider1  = (UserManager) context.getBean("webUserManager");
        System.out.println(databaseProvider1.getUserDetails());
    }
}
