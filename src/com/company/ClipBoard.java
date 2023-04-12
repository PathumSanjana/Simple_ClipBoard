package com.company;

public class ClipBoard {

    //lets try to make this class singleton
    private String content;
    private static ClipBoard instance;

    //create a private constructor to this class
    private ClipBoard(){
    }

    //create a method to get an object of this class
    public static ClipBoard getInstance(){
        if(instance == null){
            instance = new ClipBoard();
        }
        return instance;
    }

    //functions in this clipboard class
    public void copy( String newContent){
        this.content = newContent; //setter
    }

    public String paste(){
        return this.content; //getter
    }
}
