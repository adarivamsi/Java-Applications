package com.adarivamsi;
/**
 * Copyright
 */
import java.util.Arrays;

public class BinarySearch {

    /** Iterative Approach Algorithm
        1. Start from the leftmost element in the Array to the end of the Array
        2. Create a mid element as the center by initial + last / 2
        3. Check the middle index value If matches return index of the value located
        4. If the middle index value is greater than the value set initial element to middle + 1
        5. If the middle index value is lesser than the value set last element to middle - 1
        6. If not found return -1
     **/

    // Iterative Approach
    public int iterativeSearch(int[] arr, int find) {

        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int k = (i + j)/2;
            // Check if value is present in middle
            if (arr[k] == find)
                return k;
            // Check if value is present in right half, value is greater
            if (arr[k] < find)
                i = k + 1;
            // Check if value is present in left half, value is lesser
            else
                j = k - 1;
        }

        return -1;
    }

    /** Recursive Approach Algorithm
         1. Start from the leftmost element in the Array to the end of the Array
         2. Create a mid element as the center by initial + last / 2
         3. Check the middle index value If matches return index of the value located
         4. If the middle index value is greater than the value return initial element to middle + 1
         5. If the middle index value is lesser than the value return last element to middle - 1
         6. If not found return -1
     **/

    // Recursive Approach
    public int recursiveSearch(int[] arr, int i, int j, int find) {

        if (i <= j) {
            int k = (i + j)/2;
            // Check if the value is present in middle
            if (arr[k] == find)
                return k;
            // Check if the value is present in right half, value is greater
            if (arr[k] < find)
                return recursiveSearch(arr,k+1,j,find);
            else
                return recursiveSearch(arr,i,k-1,find);
        }
        return -1;
    }

    // Java Arrays approach
    public int arraysSearch(int[] arr, int find) {
        return Arrays.binarySearch(arr, find);
    }

}
