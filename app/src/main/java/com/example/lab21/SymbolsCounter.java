package com.example.lab21;

public class SymbolsCounter {
//    chars counting function
    public static int getChars(String text) {
        if (text == null){
            return -1;
        } else
        return text.length();
    }
//words counting function
    public static int getWords(String words) {


        if (words == null){
            return -1;
        } else {      String trueText = "Test " + words;
                String[] splitWords = trueText.split("[\\s.,:?!]+");

        return (splitWords.length - 1);}
    }
}