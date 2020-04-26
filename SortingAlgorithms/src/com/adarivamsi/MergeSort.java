package com.adarivamsi;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/26/2020
 */
public class MergeSort {

    /** Algorithm
     1. Start
     2. Read the array in arr
     3. Find the middle point to divide the array in two halves middle = (initial + end) / 2
     4. Call mergeSort for first half sort(arr, initial, middle)
     5. Call mergeSort for second half sort(arr, middle+1, end)
     6. Merge two halves from from step 4 & 5 merge(arr, initial, middle, end)
     7. End
     **/

    public int[] sort(int[] arr, int initial, int end) {

        if (initial < end) {
            int middle = (initial + end)/2;

            // Sort first and second halves
            sort(arr,initial,middle);
            sort(arr,middle+1,end);

            // Merge two halves
            merge(arr,initial,middle,end);
        }

        return arr;
    }

    private void merge(int[] arr, int initial, int middle, int end) {

        // Sizes of the Arrays
        int size1 = middle - initial + 1;
        int size2 = end - middle;

        int[] left = new int[size1];
        int[] right = new int[size2];

        // Copy data to two arrays
        for (int i = 0; i < size1; i++)
            left[i] = arr[initial+i];
        for (int j = 0; j < size2; j++)
            right[j] = arr[middle + 1 + j];

        // Merge arrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = initial;
        while (i < size1 && j < size2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining left array elements
        while (i < size1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining left array elements
        while (j < size2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

}
