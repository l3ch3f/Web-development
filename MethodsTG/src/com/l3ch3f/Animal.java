package com.l3ch3f;

import java.util.Date;

public class Animal {
    private String name;
    private Integer age;
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getLastFed() {
        return lastFed;
    }

    public void setLastFed(Date lastFed) {
        this.lastFed = lastFed;
    }

    private Date lastFed;
    static String type = "Animal";

    public Animal(String name, Integer age, String type) {
        this.name = name;
        this.age = age;
        Animal.type = type;
    }

    public Animal(String name, Integer age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }


    public void feed(){
        System.out.println("Animal is being Fed");
    }

    public void vistiVet() {
        System.out.println("Animal is visiting Vet");
    }

}
