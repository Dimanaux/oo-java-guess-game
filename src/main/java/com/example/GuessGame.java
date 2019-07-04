package com.example;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int maxAttempts = 7;
        int bound = 100;

        Secret secret = new Secret(bound);
        Farewell farewell = new Farewell(
                new Attempts(
                        new VerboseDiff(
                                new Diff(
                                        secret,
                                        new Guess(
                                                new Scanner(System.in),
                                                bound
                                        )
                                )
                        ),
                        maxAttempts
                ),
                secret
        );
        farewell.say();
    }
}
