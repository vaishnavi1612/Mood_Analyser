package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMoodShouldReturnSad(){
        MoodAnalyserMain ma = new MoodAnalyserMain("I am in Sad Mood");
        String actual = ma.analyseMood();
        Assert.assertEquals("SAD",actual);

    }
    @Test
    public void givenmoodShouldreturnHappy(){
        MoodAnalyserMain ma = new MoodAnalyserMain("I am in Happy Mood");
        String actual = ma.analyseMood();
        Assert.assertEquals("HAPPY",actual);
    }
    @Test
    public void passingNullShouldReturnHappy(){
        MoodAnalyserMain ma = new MoodAnalyserMain(null);
        try {
            String actual = ma.analyseMood();
            Assert.assertEquals("HAPPY",actual);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
