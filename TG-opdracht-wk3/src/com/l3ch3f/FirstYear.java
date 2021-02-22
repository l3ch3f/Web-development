package com.l3ch3f;

public class FirstYear extends Student {
    private String[] lessen = {"Engels1", "Nederlands1", "Wiskunde1"};
    private Integer[] cijfers= {8,10,3};
    private String[] note = {"Lekker bezig", "netjes"};
    @Override
    public void passYear() {
        System.out.println("Hello from FirstYear");
    }

    public FirstYear(String[] lessen, Integer[] cijfers, String[] note) {
        this.lessen = lessen;
        this.cijfers = cijfers;
        this.note = note;
    }

    public String[] getLessen() {
        return lessen;
    }

    public void setLessen(String[] lessen) {
        this.lessen = lessen;
    }

    public Integer[] getCijfers() {
        return cijfers;
    }

    public void setCijfers(Integer[] cijfers) {
        this.cijfers = cijfers;
    }

    public String[] getNote() {
        return note;
    }

    public void setNote(String[] note) {
        this.note = note;
    }

    public class FirstYearHonorStudent implements com.l3ch3f.HonorStudent {

    }

}
