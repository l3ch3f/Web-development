package com.l3ch3f;

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

    public void addAnimal(String name, Integer age, Date birthDay) {
        Animal addAnimal = new Animal(name, age, birthDay);
        animalList.add(addAnimal);
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

}
