package com.example.tracysteinberg.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by tracysteinberg on 08/08/2017.
 */

public class CountingWordTest {

    CountingWord cw;

    @Before
    public void before() {
        cw = new CountingWord("this is a string");
    }

    @Test
    public void testWordCounterHasWords() {
        assertNotNull( cw.getWords() );
    }

    @Test
    public void testCanCountWords() {
        assertEquals(4, cw.wordCounter() );
    }

    @Test
    public void testCanCountWordsLargeString() {
        CountingWord cw = new CountingWord("this is a string a very big big big string");
        assertEquals(10, cw.wordCounter() );
    }
}
