package com.bridgelabz.moodanalyser;

/*
    @desc: class for analysing mood based on message
 */
public class MoodAnalyser {

    private String message;

    /*
        @desc: constructor for class
        @params: none
        @void: none
     */
    public MoodAnalyser(){
        message = null;
    }

    /*
        @desc: parameterised constructor for the class
        @params: String(message)
        @return: none
     */
    public MoodAnalyser(String message){
        this.message = message;
    }

    /*
        @desc: function to analyse mood
        @params: message(String)
        @return: String
     */
    public String analyseMood(){
        try{
            if(message == null || message.isEmpty()){
                throw new IllegalArgumentException();
            }
            String lowercaseMessage = message.toLowerCase();
            if(lowercaseMessage.contains("sad")){
                return "Sad";
            }
            else{
                return "Happy";
            }
        }
        catch(IllegalArgumentException e){
            return "Happy";
        }
    }
}
