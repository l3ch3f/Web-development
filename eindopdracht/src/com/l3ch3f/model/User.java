package com.l3ch3f.model;

import java.util.Date;

public class User {
    private String name;
    private Date dateOfBirth;

    public User(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public User(User user) {
        this.name = user.name;
        this.dateOfBirth = user.dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
