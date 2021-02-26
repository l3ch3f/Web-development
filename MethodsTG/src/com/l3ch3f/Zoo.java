package com.l3ch3f;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Zoo {
    private List<Animal> animalList = new ArrayList<>();

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public Animal addAnimal(String name, Integer age, Date birthDay) {
        Animal addAnimal = new Animal(name, age, birthDay);
        animalList.add(addAnimal);
        return addAnimal;
    }


    public void removeAnimal(String name) {
        animalList.remove(animalList.contains("name"));
    }

    public void updateAnimal(Date date) {
        for(int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getBirth() == date) {
                System.out.println(animalList.get(i).getName());
            }
        }

    }
    public void feedAnimal() throws ParseException {
        animalList.add(addAnimal("Bob",22,  new SimpleDateFormat("dd/MM/yyyy").parse("12/11/1999")));
        animalList.get(0).feed();
    }

}
