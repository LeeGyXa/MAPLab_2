package com.example.lab21;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Test01GetCharsCount() {
        String givenString = "abc4";
        int expectedResult = 4;
        int actualResult = SymbolsCounter.getChars(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test02GetWordsCount() {
        String givenString = "Hello   world   with    extra    empty spaces  ";
        int expectedResult = 6 ;
        int actualResult = SymbolsCounter.getWords(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test03GetWordsCount() {
         String givenString = null;
         int expectedResult = -1;
         int actualResult = SymbolsCounter.getWords(givenString);

         assertEquals(expectedResult, actualResult);

    }

    @Test
    public void Test04GetCharsCount(){
        String givenString = "";
        int expectedResult = 0;
        int actualResult = SymbolsCounter.getChars(givenString);

        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void test05GetWordsCount(){
        String givenString = null;
        int expectedResult = -1;
        int actualResult = SymbolsCounter.getWords(givenString);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test06GetWordsCount(){
        String givenString = "  .Category: student, Status: studying, .";
        int expectedResult = 4;
        int actualResult = SymbolsCounter.getWords(givenString);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test07GetWordsCount(){
        String givenString = ". ? ! , ...";
        int expectedResult = 0;
        int actualResult = SymbolsCounter.getWords(givenString);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test08GetCharsCount(){
        String givenString = "Text. , .  , ?";
        int expectedResult = 14;
        int actualResult = SymbolsCounter.getChars(givenString);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Test09GetCharsCount(){
        String givenString = "     ";
        int expectedResult = 5;
        int actualResult = SymbolsCounter.getChars(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test10GetWordsCount(){
        String givenString = "    ";
        int expectedResult = 0;
        int actualResult = SymbolsCounter.getWords(givenString);

        assertEquals(expectedResult, actualResult);
    }
}

