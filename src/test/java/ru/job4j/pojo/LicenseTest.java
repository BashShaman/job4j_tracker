package ru.job4j.pojo;

import org.junit.Test;

import static org.junit.Assert.*;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertEquals(first, second);
    }
}
