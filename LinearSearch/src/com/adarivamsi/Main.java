package com.adarivamsi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int find = 100;

        LinearSearch linearSearch = new LinearSearch();
        int answer = linearSearch.search(arr,find);
        if (answer == -1)
            System.out.println("Number not found in the Array");
        else
            System.out.println("Found at index : " + linearSearch.search(arr,find));
    }
}
