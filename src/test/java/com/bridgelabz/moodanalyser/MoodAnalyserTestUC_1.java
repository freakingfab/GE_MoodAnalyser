package com.bridgelabz.moodanalyser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class MoodAnalyserTestUC_1 {
    private MoodAnalyser moodAnalyser;
    /*
        @desc: test case 1 for sad mood
        @params: none
        @return: void
     */
    @Test
    public void TestCaseSad(){
        moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("Sad", mood);
    }

    /*
        @desc: test case 2 for happy mood;
        @params: none
        @return void;
     */
    @Test
    public void TestCaseHappy(){
        moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("Happy", mood);
    }
}
