package com.example;

import java.util.Scanner;

public class Guess {
    private final Scanner scanner;
    private final int bound;

    public Guess(Scanner scanner, int bound) {
        this.scanner = scanner;
        this.bound = bound;
    }

    public int value() {
        System.out.print("Guess a number in 1.." + bound + " range: ");
        return scanner.nextInt();
    }
}
