package com.adarivamsi;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/25/2020
 */
public class InterpolationSearch {

    /** Algorithm
     * pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]
     * arr[] ==> Array where elements need to be searched
     * x     ==> Element to be searched
     * lo    ==> Starting index in arr[]
     * hi    ==> Ending index in arr[]
     1. In a loop, calculate the value of “find” using the probe position formula.
     2. If it is a match, return the index of the item, and exit.
     3. If the item is less than arr[pos], calculate the probe position of the left sub-array. Otherwise calculate the same in the right sub-array.
     4. Repeat until a match is found or the sub-array reduces to zero.
     **/

    public int search(int[] arr, int find) {

        int i = 0, j = arr.length - 1;
        while (i <= j && find >= arr[i] && find <= arr[j]){
            if (i == j){
                if (arr[i] == find)
                    return i;
                return -1;
            }
            // Probing the position with keeping
            int index = i + (((j - i) / (arr[j] - arr[i])) * (find - arr[i]));
            if (arr[index] == find)
                return  index;
            // If value is larger than the index value
            if (arr[index] < find)
                i = index + 1;
            else
                j = index - 1;
        }
        return -1;
    }
}
