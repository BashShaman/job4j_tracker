package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("I'm a great oracle."
                + " What do you want to know? ");
        new Scanner(System.in).nextLine();
        String answer = switch (new Random().nextInt(3)) {
            case 0 -> "Yep";
            case 1 -> "Nope";
            default -> "Maybe";
        };
        System.out.println(answer);
    }
}
