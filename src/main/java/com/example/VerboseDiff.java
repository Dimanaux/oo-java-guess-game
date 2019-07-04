package com.example;

public class VerboseDiff {
    private final Diff diff;

    public VerboseDiff(Diff diff) {
        this.diff = diff;
    }

    public boolean isDifferent() {
        int result = diff.guessCompareToSecret();
        String verboseMessage;
        if (result < 0) {
            verboseMessage = "Too small.";
        } else if (result > 0) {
            verboseMessage = "Too big.";
        } else {
            verboseMessage = "Bingo!";
        }
        System.out.println(verboseMessage);
        return result != 0;
    }
}
