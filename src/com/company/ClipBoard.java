package com.company;

public class ClipBoard {


    private String content;


    //functions in this clipboard class
    public void copy( String newContent){
        this.content = newContent; //setter
    }

    public String paste(){
        return this.content; //getter
    }
}
