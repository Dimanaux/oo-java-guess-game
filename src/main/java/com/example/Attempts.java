package com.example;

public class Attempts {
    private final VerboseDiff verboseDiff;
    private int attemptsLeft;

    public Attempts(VerboseDiff verboseDiff, int maxAttempts) {
        this.verboseDiff = verboseDiff;
        this.attemptsLeft = maxAttempts;
    }

    public void all() {
        while (attemptsLeft > 0 && verboseDiff.isDifferent()) {
            attemptsLeft -= 1;
        }
        sorry();
    }

    private void sorry() {
        if (attemptsLeft == 0) {
            System.out.println("You lost, sorry.");
        }
    }
}
