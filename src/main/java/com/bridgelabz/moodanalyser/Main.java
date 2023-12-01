package com.bridgelabz.moodanalyser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser!!");


        MoodAnalyser moodAnalyserSad = new MoodAnalyser();
        System.out.println("Message: "  + " has mood -> " + moodAnalyserSad.analyseMood());

        String messageTestCase2 = "";
        MoodAnalyser moodAnalyserHappy = new MoodAnalyser(messageTestCase2);
        System.out.println("Message: empty has mood -> " + moodAnalyserHappy.analyseMood());
    }
}