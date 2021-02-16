package com.l3ch3f;

public class Bear extends Animal{
    private static String type;

    public Bear(String name, Integer age, String type) {
        super(name, age,type);
        this.type = type;
    }

    public static void main(String[] args) {
        Bear bearYogi = new Bear("Yogi", 22,"BrownBear");
        Bear bearBoeBoe = new Bear("Boeboe", 22,"PolarBear");
        Animal.type = "Animal";
//        Animal willy = new Animal("willy",13,"");
        Bear[] beren = {bearBoeBoe, bearYogi};
        Animal[] dieren = {bearBoeBoe,bearYogi};



        System.out.println(bearYogi.type);
        bearBoeBoe.feed();
        bearYogi.showType();


    }

    public void showType(){
        System.out.println(type);
        System.out.println(super.type);
    }



}
