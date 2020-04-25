package com.adarivamsi;

import java.util.Arrays;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/25/2020
 */
public class ExponentialSearch {

    /** Algorithm
     1. Find range where element is present
     2. Do Binary Search in above found range.
     **/

    public int search(int[] arr, int find) {

        // If the value is in the first location itself
        if (arr[0] == find)
            return 0;

        // Find the range of binary search by repeated doubling
        int i = 1;
        while (i < arr.length && arr[i] <= find)
            i = i * 2;

        return Arrays.binarySearch(arr, i/2, Math.min(i,arr.length), find);
    }
}
