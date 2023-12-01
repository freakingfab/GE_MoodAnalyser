package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception{
    private final MoodError error;

    /*
        @desc: constructor for the class
        @params: none
        @return: none
     */
    public MoodAnalysisException(MoodError error) {
        super(error.getMessage());
        this.error = error;
    }

    /*
        @desc: getter for error
        @params: none
        @return: none
     */
    public MoodError getError() {
        return error;
    }
}
