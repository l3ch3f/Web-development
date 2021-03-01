package com.l3ch3f.model;

import java.util.ArrayList;
import java.util.Date;

public class Student extends User{
    private String nationality;
    private Course course;
    private ArrayList<ArrayList<String>>grades;
    private String profile;
    private ArrayList<Date> datesAbsent;

    public Student(User user, String nationality) {
        super(user);
        this.nationality = nationality;
    }



    public Student(String name, Date dateOfBirth, String nationality, String profile) {
        super(name, dateOfBirth);
        this.nationality = nationality;
        this.profile = profile;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<ArrayList<String>> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<ArrayList<String>> grades) {
        this.grades = grades;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public ArrayList<Date> getDatesAbsent() {
        return datesAbsent;
    }

    public void setDatesAbsent(ArrayList<Date> datesAbsent) {
        this.datesAbsent = datesAbsent;
    }
}
