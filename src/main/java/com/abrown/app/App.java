package com.abrown.app;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        // pre-sorted
        int[] arr = { 55, 23, 26, 2, 18, 78, 23, 8, 2, 3 };
        System.out.println("Pre-sorted: " + Arrays.toString(arr) );

        // post-sorted
        Quicksort.sort(arr);
        System.out.println("Post-sorted: " + Arrays.toString(arr) );
    }
}
