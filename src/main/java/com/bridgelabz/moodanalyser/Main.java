package com.bridgelabz.moodanalyser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser!!");


        String messageTestCase1 = "I am in sad mood";
        MoodAnalyser moodAnalyserSad = new MoodAnalyser(messageTestCase1);
        System.out.println("Message: " + messageTestCase1 + " has mood -> " + moodAnalyserSad.analyseMood());

        String messageTestCase2 = "I am in any mood";
        MoodAnalyser moodAnalyserHappy = new MoodAnalyser(messageTestCase2);
        System.out.println("Message: " + messageTestCase2 + " has mood -> " + moodAnalyserHappy.analyseMood());
    }
}