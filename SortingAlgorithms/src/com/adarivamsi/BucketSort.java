package com.adarivamsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Objects.hash;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/26/2020
 */
public class BucketSort {
    public int[] sort(int[] arr) {
        // get hash codes
        final int[] code = hash(arr);

        // create and initialize buckets to ArrayList: O(n)
        List[] buckets = new List[code[1]];
        for (int i = 0; i < code[1]; i++) {
            buckets[i] = new ArrayList();
        }

        // distribute data into buckets: O(n)
        for (int i : arr) {
            buckets[hash(i, code)].add(i);
        }

        // sort each bucket O(n)
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int ndx = 0;
        // merge the buckets: O(n)
        for (int b = 0; b < buckets.length; b++) {
            for (Object v : buckets[b]) {
                arr[ndx++] = (int) v;
            }
        }
        return arr;
    }

    private int[] hash(int[] input) {
        int m = input[0];
        for (int i = 1; i < input.length; i++) {
            if (m < input[i]) {
                m = input[i];
            }
        } return new int[] { m, (int) Math.sqrt(input.length) };
    }

    private int hash(int i, int[] code) {
        return (int) ((double) i / code[0] * (code[1] - 1));
    }
}
