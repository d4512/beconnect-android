package com.android.beconnect;

/**
 * Created by pritamkarmakar on 6/22/15.
 */
public class User {
    String firstName, lastName, email, password, token;
    int age;

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.token = "";
    }

    public User(String email, String password) {
        this("", "", email, password);
    }
}
