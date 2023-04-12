package com.company;

public class Main {

    public static void main(String[] args) {
        ClipBoard clipBoard = new ClipBoard();
        clipBoard.copy("A");
        System.out.println(clipBoard.paste());
    }
}
