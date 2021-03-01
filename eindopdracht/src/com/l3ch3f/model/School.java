package com.l3ch3f.model;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> listOfTeachers;
    private ArrayList<Student> listOfStudents;
    private String schooltype;
    private ArrayList<String> curriculum;

    public ArrayList<Teacher> getListOfTeachers() {
        return listOfTeachers;
    }

    public void setListOfTeachers(ArrayList<Teacher> listOfTeachers) {
        this.listOfTeachers = listOfTeachers;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public String getSchooltype() {
        return schooltype;
    }

    public void setSchooltype(String schooltype) {
        this.schooltype = schooltype;
    }

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        this.curriculum = curriculum;
    }

    public void addTeacher(User user, ArrayList<String> curriculum) {
        Teacher newTeacher = new Teacher(user, curriculum);
        listOfTeachers.add(newTeacher);
    }

    public void addStudent(User user, String nationality) {
        Student newStudent = new Student(user, nationality);
        listOfStudents.add(newStudent);
    }
}
