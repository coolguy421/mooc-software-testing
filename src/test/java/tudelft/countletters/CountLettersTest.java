package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void oneWordEndsWithSOtherWithR() {
        int words = new CountLetters().count("cats2dogr  ");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void wordsNotEndingWithSorR() {
        int words = new CountLetters().count(" cats dogx");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void singleLetters() {
        int words = new CountLetters().count(" s ! r & sr  %  1");
        Assertions.assertEquals(3, words);
    }


}