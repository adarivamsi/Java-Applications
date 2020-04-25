package com.adarivamsi;

public class LinearSearch {

    public int search(int[] arr, int find) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }

        return -1;
    }
}
