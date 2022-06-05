package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void eat(String meat) {
        food = meat;
    }

    public void giveNick(String nick) {
        name = nick;
    }

    public void show() {
        System.out.printf("%s ate %s.\n", name, food);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        gav.show();
        black.show();
    }
}
