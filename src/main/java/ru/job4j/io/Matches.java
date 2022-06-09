package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game Eleven");
        System.out.println("-----------");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "The 1-st player" : "The 2-nd player";
            int matches = obtainMatches(player, input, count);
            turn = !turn;
            count -= matches;
            System.out.printf("There are %s matches left.\n", count);
        }
        if (!turn) {
            System.out.println("The 1-st player won!");
        } else {
            System.out.println("The 2-nd player won!");
        }
    }

    private static int obtainMatches(String player, Scanner input, int count) {
        String message = player + ", enter the number from 1 to 3: ";
        int number;
        boolean isInvalid;
        do {
            System.out.print(message);
            number = Integer.parseInt(input.nextLine());
            isInvalid = number < 1 || number > 3 || number > count;
            if (isInvalid) {
                System.out.println("Your number is NOT valid. Try again.");
            }
        } while (isInvalid);
        return number;
    }
}
