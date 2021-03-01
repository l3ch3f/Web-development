package com.l3ch3f.model;

import java.util.ArrayList;
import java.util.Date;

public class Teacher extends User{
    private ArrayList<String> curriculum;
    private Course mentor;

    public Teacher(User user, ArrayList<String> curriculum) {
        super(user);
        this.curriculum = curriculum;
    }

    public Teacher(String name, Date dateOfBirth, ArrayList<String> curriculum, Course mentor) {
        super(name, dateOfBirth);
        this.curriculum = curriculum;
        this.mentor = mentor;
    }

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        this.curriculum = curriculum;
    }

    public Course getMentor() {
        return mentor;
    }

    public void setMentor(Course mentor) {
        this.mentor = mentor;
    }
}
