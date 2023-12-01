package com.bridgelabz.moodanalyser;

public enum MoodError {
    NULL_MESSAGE("Message cannot be null"),
    EMPTY_MESSAGE("Message cannot be empty");

    private final String message;

    /*
        @desc: constructor for the enum
        @params: none
        @void: none
     */
    MoodError(String message) {
        this.message = message;
    }

    /*
        @desc: getter for message
        @params: none
        @return: String
     */
    public String getMessage() {
        return message;
    }

}
