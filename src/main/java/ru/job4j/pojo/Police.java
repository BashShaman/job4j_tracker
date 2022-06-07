package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Bob Seger");
        license.setModel("Ford Mustang");
        license.setCode("xx111x");
        license.setCreated(new Date());
        System.out.printf("%s has a car - %s : %s",
                license.getOwner(), license.getModel(), license.getCode());
    }
}
