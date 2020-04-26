package com.adarivamsi;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/26/2020
 */
public class BubbleSort {

    /** Algorithm
         1. Start
         2. Read the array in arr
         3. Compare two adjacent elements
         4. If first value is less than previous swap values
         5. Repeat Step 3 and 4 until the array is sorted
     **/

    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;

    }
}
