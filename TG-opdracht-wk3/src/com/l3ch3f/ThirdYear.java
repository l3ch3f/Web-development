package com.l3ch3f;
public class ThirdYear extends Student {
    private String[] lessen = {"Engels3", "Nederlands3", "Wiskunde3"};
    private String[] note = {"Discipline", "Meewerkend"};
    private Integer[] cijfers= {9,7,5};
    @Override
    public void passYear() {
        System.out.println("Hello from ThirdYear");
    }

    public ThirdYear(String[] lessen, String[] note, Integer[] cijfers) {
        this.lessen = lessen;
        this.note = note;
        this.cijfers = cijfers;
    }

    public String[] getLessen() {
        return lessen;
    }

    public void setLessen(String[] lessen) {
        this.lessen = lessen;
    }

    public String[] getNote() {
        return note;
    }

    public void setNote(String[] note) {
        this.note = note;
    }

    public Integer[] getCijfers() {
        return cijfers;
    }

    public void setCijfers(Integer[] cijfers) {
        this.cijfers = cijfers;
    }

    public class ThirdYearHonorStudent implements com.l3ch3f.HonorStudent {

    }
}