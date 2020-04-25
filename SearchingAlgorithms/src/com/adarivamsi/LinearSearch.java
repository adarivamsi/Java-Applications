package com.adarivamsi;
/**
 * Copyright
 */
public class LinearSearch {

    /** Algorithm
        1. Start from the leftmost element in the Array
        2. Compare each and every element to the value to be found
        3. If matches return index of the value located
        4. If not found return -1
    **/

    public int search(int[] arr, int find) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }

        return -1;
    }
}
