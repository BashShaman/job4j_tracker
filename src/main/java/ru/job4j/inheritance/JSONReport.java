package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        return "{"
                + ln
                + String.format("\t\"name\" : \"%s\",", name)
                + ln
                + String.format("\t\"body\" : \"%s\"", body)
                + ln
                + "}";
    }
}
