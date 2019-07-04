package com.example;

public class Farewell {
    private final Attempts attempts;
    private final Secret secret;

    public Farewell(Attempts attempts, Secret secret) {
        this.attempts = attempts;
        this.secret = secret;
    }

    public void say() {
        attempts.all();
        System.out.println("Thanks for playing with me!");
    }
}
