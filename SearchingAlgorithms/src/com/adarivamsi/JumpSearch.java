package com.adarivamsi;
/**
 * Copyright
 */

public class JumpSearch {

    /** Algorithm
     1. Start from the leftmost element in the Array to the end of the Array
     2. Jump from index 0 to index 4;
     3. Jump from index 4 to index 8;
     4. Jump from index 8 to index 12;
     5. Since the element at index 12 is greater than 55 we will jump back a step to come to index 8.
     6. Perform linear search from index 8 to get the element 55.
     **/

    public int search(int[] arr, int find) {

       int k = (int)Math.floor(Math.sqrt(arr.length));
       int i = 0;
       while(arr[Math.min(k,arr.length)-1] < find) {
            i = k;
            k += k;
            // The value reached end of the array -> not found
            if (i >= arr.length)
                return -1;
       }

       // Performing linear search for finding value in array
       while (arr[i] < find){
         i++;
         // Reached end of the array -> not found
         if (i == Math.min(k,arr.length))
            return -1;
       }

       // If value is found
       if (arr[i] == find)
           return i;

       return -1;
    }
}
