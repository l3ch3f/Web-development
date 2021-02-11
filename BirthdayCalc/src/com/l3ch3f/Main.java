package com.l3ch3f;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scan.nextLine(); // Bug als je next() gebruikt dan slaat hij lastname over
        System.out.println("------------");
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();
        System.out.println("------------");
        System.out.println("Wich year were you born?");
        Integer year = scan.nextInt();
        System.out.println("------------");
        System.out.println("Wich month were you born?");
        System.out.println("Expected input: the number of the month: Es. 3=march");
        Integer month = scan.nextInt();
        System.out.println("------------");
        System.out.println("On wich day were you born?");
        Integer day = scan.nextInt();




        LocalDate today = LocalDate.now(); // Todays date
        LocalDate birthday = LocalDate.of(year,month , day); // Birthday input

        Period p = Period.between(birthday,today); // eerste parameter ten opzichte van tweede parameter

        System.out.println("Hello and gooday "+ firstName + " " + lastName + " you are " + p.getYears() + " old");
    }
}
