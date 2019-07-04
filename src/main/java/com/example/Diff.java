package com.example;

public class Diff {
    private final Secret secret;
    private final Guess guess;

    public Diff(Secret secret, Guess guess) {
        this.secret = secret;
        this.guess = guess;
    }

    public int secretCompareToGuess() {
        return secret.compareTo(guess.value());
    }

    public int guessCompareToSecret() {
        return -secretCompareToGuess();
    }
}
