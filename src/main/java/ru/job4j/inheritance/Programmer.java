package ru.job4j.inheritance;

public class Programmer extends Engineer {
    public String programLange;

    public Programmer(String programLange, int experience, boolean degree) {
        super(experience, degree);
        this.programLange = programLange;
    }
}
