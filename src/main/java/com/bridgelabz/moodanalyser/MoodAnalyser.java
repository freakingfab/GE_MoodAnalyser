package com.bridgelabz.moodanalyser;

/*
    @desc: class for analysing mood based on message
 */
public class MoodAnalyser {

    private final String message;

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
            if (message == null) {
                throw new MoodAnalysisException(MoodError.NULL_MESSAGE);
            } else if (message.isEmpty()) {
                throw new MoodAnalysisException(MoodError.EMPTY_MESSAGE);
            }
            String lowercaseMessage = message.toLowerCase();
            if(lowercaseMessage.contains("sad")){
                return "Sad";
            }
            else{
                return "Happy";
            }
        }
        catch(MoodAnalysisException e){
            System.out.println("Invalid Mood: " + e.getError().getMessage());
            return "Happy";
        }
    }
}
