package com.l3ch3f;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scan.nextLine(); // Bug als je next() gebruikt dan slaat hij lastname over
        System.out.println("------------");
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();
        System.out.println("------------");
        System.out.println("What is your day of birth ?");
        System.out.println("Expected input: dd/mm/yyyy");
        String birthDayInput = scan.next();
//        Integer year = scan.nextInt();
//        System.out.println("------------");
//        System.out.println("Which month were you born?");
//        System.out.println("Expected input: the number of the month: Es. 3=march");
//        Integer month = scan.nextInt();
//        System.out.println("------------");
//        System.out.println("On which day were you born?");
//        Integer day = scan.nextInt();
        String[] parts = birthDayInput.split("/");

        int day = parseInt(parts[0]);
        int month = parseInt(parts[1]);
        int year = parseInt(parts[2]);



        LocalDate today = LocalDate.now(); // Todays date
        LocalDate birthday = LocalDate.of(year,month , day); // Birthday input

        Period p = Period.between(birthday,today); // eerste parameter ten opzichte van tweede parameter

        System.out.println("Hello and good day "+ firstName + " " + lastName + " you are " + p.getYears() + " old");
        System.out.println("Zoveel dagen oud "+ firstName + " " + lastName + " you are " + p.getDays() + " old");
        System.out.println("Zoveel maanden oud "+ firstName + " " + lastName + " you are " + p.getMonths()+ " old");
    }
}
