package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class College {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setFullName("Elon Reeve Musk");
        student.setGroup("T84E69S83L76A65");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        student.setDateOfEntry(LocalDate.parse("13/07/1990", formatter));
        System.out.printf("Student's name: %s, group: %s, date of entry: %s.\n",
                student.getFullName(),
                student.getGroup(),
                formatter.format(student.getDateOfEntry()));
    }
}
