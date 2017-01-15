package com.abrown.app;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class QuicksortTest {

    private int[] input = {6,2,5,8,3,1};

    @Test
    public void sortTest() {
        int[] expectedOutput = {1,2,3,5,6,8};
        Quicksort.sort(input);

        assertArrayEquals(input, expectedOutput);
    }
}
