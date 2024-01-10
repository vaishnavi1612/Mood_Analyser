package com.bridgelabz;

public class MoodAnalyserMain {
    String msg ;
    MoodAnalyserMain(String msg ){
        this.msg=msg;
    }
    public String analyseMood(){
        if(msg.contains("Sad")){
            return "SAD";
        }
        //return "Happy";
        else {
            msg.contains("Happy");
                return "HAPPY";
            }
        }
    }

