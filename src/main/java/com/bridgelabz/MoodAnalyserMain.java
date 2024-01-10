package com.bridgelabz;

public class MoodAnalyserMain {
    public String analyseMood(String msg){
        if(msg.contains("Sad")){
            return "SAD";
        }
        return "Happy";
    }
}
