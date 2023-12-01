package com.bridgelabz.moodanalyser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser!!");
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String messageTestCase1 = "I am in sad mood";
        System.out.println("Message: " + messageTestCase1 + "has mood -> " + moodAnalyser.analyseMood(messageTestCase1));

        String messageTestCase2 = "I am in any mood";
        System.out.println("Message: " + messageTestCase2 + "has mood -> " + moodAnalyser.analyseMood(messageTestCase2));
    }
}