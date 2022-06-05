package ru.job4j.oop;

import java.util.Arrays;

public class Jukebox {

    public void music(int position) {
        String rsl;
        if (position == 1) {
            rsl = "Пусть бегут неуклюже";
        } else if (position == 2) {
            rsl = "Спокойной ночи";
        } else {
            rsl = "Песня не найдена";
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        System.out.print("Pressing 1: ");
        jukebox.music(1);
        System.out.print("Pressing 2: ");
        jukebox.music(2);
        System.out.print("Pressing 3: ");
        jukebox.music(3);
    }
}
