package com.l3ch3f;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        Zoo zoo = new Zoo();
        zoo.addAnimal("YogiBear", 12, new SimpleDateFormat("dd/MM/yyyy").parse("12/11/1999"));
        System.out.println(zoo.getAnimalList().get(0).getBirth());
        System.out.println(zoo.getAnimalList().get(0).getName());
        System.out.println(zoo.getAnimalList().get(0).getAge());
    }
}
