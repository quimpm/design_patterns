package Adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTokenizerAdapterTest {

    StringTokenizerAdapter stringIterator;

    @BeforeEach
    public void setUp(){
        stringIterator = new StringTokenizerAdapter("Hola hem dic quim");
    }

    @Test
    public void hasNextTest(){
        assertTrue(stringIterator.hasNext());
    }

    @Test
    public void nextTest(){
        assertEquals("Hola", stringIterator.next());
    }

}
