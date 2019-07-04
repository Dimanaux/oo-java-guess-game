package com.example;

public class Secret implements Comparable<Integer> {
    private final int secretNumber;

    public Secret(int bound) {
        secretNumber = (int) (Math.random() * bound) + 1;
    }

    public boolean contains(int value) {
        return secretNumber == value;
    }

    public boolean greater(int value) {
        return secretNumber > value;
    }

    @Override
    public int compareTo(Integer o) {
        return Integer.compare(secretNumber, o);
    }
}
