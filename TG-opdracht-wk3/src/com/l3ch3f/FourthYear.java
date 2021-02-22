package com.l3ch3f;


public class FourthYear extends Student {
    private String[] lessen = {"Engels4", "Nederlands4", "Wiskunde4"};
    private String[] note = {"Leider", "Trots"};
    private Integer[] cijfers= {5,6,6};
    @Override
    public void passYear() {
        System.out.println("Hello from FourthYear");
    }

    public FourthYear(String[] lessen, String[] note, Integer[] cijfers) {
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

    public class FourYearthHonorStudent implements com.l3ch3f.HonorStudent {

    }
}