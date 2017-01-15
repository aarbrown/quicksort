package com.abrown.app;

public class Quicksort {
    private static int partition(int[] arr, int low, int high) {
        int pivotValue = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivotValue && i <= high) i++;
            while (arr[j] > pivotValue) j--;

            if (i < j) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                break;
            }
        }

        arr[low] = arr[j];
        arr[j] = pivotValue;

        return j;
    }

    private static void sortRecursive(int[] arr, int low, int high) {
        if (high > low) {
            int pivotIndex = partition(arr, low, high);

            sortRecursive(arr, low, pivotIndex - 1);
            sortRecursive(arr, pivotIndex + 1, high);
        }
    }

    public static void sort(int[] arr) {
        sortRecursive(arr, 0, arr.length - 1);
    }
}
