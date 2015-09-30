package com.headcrest.sorting.ex;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mbe on 30/09/15.
 */
public class PatternMatchingTest {

    @Test
    public void matchString(){
        PatternMatching matcher = new PatternMatching();
        int indexOfMatch = matcher.matchString("Hello World", "or");
        assertEquals(7, indexOfMatch);
    }

    @Test
    public void matchString_PelleAndPatternEL_matches(){
        PatternMatching matcher = new PatternMatching();
        int indexOfMatch = matcher.matchString("Pelle", "el");
        assertEquals(1, indexOfMatch);
    }
}