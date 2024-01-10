package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMoodShouldReturnSad(){
        MoodAnalyserMain ma = new MoodAnalyserMain();
        String actual = ma.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",actual);

    }
    @Test
    public void givenmoodShouldreturnHappy(){
        MoodAnalyserMain ma = new MoodAnalyserMain();
        String actual = ma.analyseMood("I am in Happy Mood");
        Assert.assertEquals("HAPPY",actual);
    }
}
