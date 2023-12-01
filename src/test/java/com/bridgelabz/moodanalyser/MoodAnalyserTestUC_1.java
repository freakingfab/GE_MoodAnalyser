package com.bridgelabz.moodanalyser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class MoodAnalyserTestUC_1 {
    private MoodAnalyser moodAnalyser;
    @Before
    public void initialiser(){
        moodAnalyser = new MoodAnalyser();
    }

    /*
        @desc: test case 1 for sad mood
        @params: none
        @return: void
     */
    @Test
    public void TestCaseSad(){
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        assertEquals("Sad", mood);
    }

    /*
        @desc: test case 2 for happy mood;
        @params: none
        @return void;
     */
    @Test
    public void TestCaseHappy(){
        String mood = moodAnalyser.analyseMood("I am in any mood");
        assertEquals("Happy", mood);
    }
}
