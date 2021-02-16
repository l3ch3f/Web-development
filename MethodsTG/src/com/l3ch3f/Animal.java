package com.l3ch3f;

public class Animal {
    private String name;
    private Integer age;
    static String type = "Animal";

    public Animal(String name, Integer age, String type) {
        this.name = name;
        this.age = age;
        Animal.type = type;
    }



    public void feed(){
        System.out.println("Animal is being Fed");
    }

    public void vistiVet() {
        System.out.println("Animal is visiting Vet");
    }

}
