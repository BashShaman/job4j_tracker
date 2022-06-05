package ru.job4j.oop;

public class DummyDic {

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String rsl = dictionary.engToRus("hello");
        System.out.println(rsl);
    }

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }
}
