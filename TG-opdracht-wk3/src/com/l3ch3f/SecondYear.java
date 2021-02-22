package com.l3ch3f;
public class SecondYear extends Student {
    private String[] lessen = {"Engels2", "Nederlands2", "Wiskunde2"};
    private Integer[] cijfers= {8,6,6};
    private String[] note = {"Telaat", "Slordig"};
    @Override
    public void passYear() {
        System.out.println("Hello from SecondYear");
    }

    public SecondYear(String[] lessen, Integer[] cijfers, String[] note) {
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

    public class SecondYearHonorStudent implements com.l3ch3f.HonorStudent {

    }
}