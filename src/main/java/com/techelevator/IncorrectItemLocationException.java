package com.techelevator;

public class IncorrectItemLocationException extends Exception{
    public IncorrectItemLocationException(String errorMessage){
        super(errorMessage);
    }
}
