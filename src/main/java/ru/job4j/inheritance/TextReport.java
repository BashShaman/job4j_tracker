package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return String.format("%s%s%s", name, System.lineSeparator(), body);
    }
}
