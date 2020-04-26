package com.adarivamsi;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/25/2020
 */
public class SelectionSort {

    /** Algorithm
         1. Start
         2. Read the array in arr
         3. Find the minimum element in arr
         4. Place it at the beginning by swapping
         5. Repeat Step 3 and 4 until the array is sorted
     **/

    public int[] sort(int[] arr) {

        int min_index;

        for (int i = 0; i < arr.length - 1; i++) {
            min_index  = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        return arr;

    }

}