package ru.job4j.inheritance;

public class HTMLReport extends TextReport {
    public String generate(String name, String body) {
        return String.format("<h1>%s</h1><br/><span>%s</span>",
                name, body);
    }
}
