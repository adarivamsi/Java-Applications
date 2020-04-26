package com.adarivamsi;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/26/2020
 */
public class InsertionSort {

    /** Algorithm
     1. Start
     2. Read the array in arr
     3. Loop from i = 1 to n-1
     4. Pick element arr[i] and insert it into sorted sequence arr[0...i-1]
     5. Repeat Step 3 and 4 until the array is sorted
     **/

    public int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements in the array to one position which are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }

        return arr;
    }
}
