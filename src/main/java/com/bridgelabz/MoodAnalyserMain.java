package com.bridgelabz;

public class MoodAnalyserMain {
    String msg;

    MoodAnalyserMain(String msg) {
        this.msg = msg;
    }

    public String analyseMood() {
        try {
            if (msg.contains("Sad")) {
                return "SAD";
            } else if (msg == null) {
                throw new NullPointerException();
            } else {
                msg.contains("Happy");
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
