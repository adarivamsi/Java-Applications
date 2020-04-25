package com.adarivamsi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

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
