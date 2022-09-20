package com.example.lab21;

public class SymbolsCounter {
//    chars counting function
    public static int getChars(String text) {
        return text.length();
    }
//words counting function
    public static int getWords(String words) {
        String[] splitWords = words.split("[\\s.,]+");
        return splitWords.length;
    }
}