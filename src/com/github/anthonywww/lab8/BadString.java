package com.github.anthonywww.lab8;

public class BadString {

    public static void main(String[] args) {
        processWord("banana");
    }

    public static void processWord(String s) {
        char c = getLastLetter(s);
        System.out.println(c);
    }

    public static char getLastLetter(String s) {
        int index = s.length()-1;
        char c = s.charAt(index);
        return c;
    }
}
