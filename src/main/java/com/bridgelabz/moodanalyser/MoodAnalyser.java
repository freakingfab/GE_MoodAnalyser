package com.bridgelabz.moodanalyser;

/*
    @desc: class for analysing mood based on message
 */
public class MoodAnalyser {

    /*
        @desc: function to analyse mood
        @params: message(String)
        @return: String
     */
    public String analyseMood(String message){
        String lowercaseMessage = message.toLowerCase();
        if(lowercaseMessage.contains("sad")){
            return "Sad";
        }
        else{
            return "Happy";
        }
    }
}
