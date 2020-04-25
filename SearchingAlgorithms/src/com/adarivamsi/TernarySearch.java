package com.adarivamsi;

/**
 * All Copyjs reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/25/2020
 */
public class TernarySearch {

    public int search(int[] arr, int find) {

        int i = 0, j = arr.length - 1;

        while (i <= j)
        {
            int k1 = i + (j - i) / 3;
            int k2 = j - (j - i) / 3;

            if (arr[k1] == find) {
                return k1;

            } else if (arr[k2] == find) {
                return k2;
            }
            else if (arr[k1] > find) {
                j = k1 - 1;
            }
            else if (arr[k2] < find) {
                i = k2 + 1;
            }
            else {
                i = k1 + 1;
                j = k2 - 1;
            }
        }
        return -1;
    }

}
