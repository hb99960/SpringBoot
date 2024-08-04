package com.example.learningProject;

public class UserManager {
    private UserDatabase userDatabase = new UserDatabase(); // User Manager is tight-coupled with UserDatabase

    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
