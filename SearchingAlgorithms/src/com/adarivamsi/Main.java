package com.adarivamsi;
/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/25/2020
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Values
    static int[] arr = {1,152,78,123,151,26,79,161,114,110,144,38,32,54,126,118,50,109,162,165,184,69,45,160,157,116,158,187,119,113,141,163,117,142,172,40,136,127,130,5,112,199,55,124,96,148,17,52,154,156,31,15,143,181,194,102,21,61,147,153,63,0,175,68,66,74,128,104,168,177,159,3,43,145,24,35,120,34,46,49,146,166,106,4,8,58,183,7,207,132,211,139,138,200,83,111,133,97,48,20,206,14,189,56,209,169,23,210,129,170,60,16,195,188,155,2,173,182,213,75,57,150,99,108,179,204,30,94,100,121,201,134,149,44,140,198,65,115,59,70,190,196,33,185,62,39,167,174,125,22,95,6,197,178,27,193,202,135,42,67,164,137,214,122,89,11,186,47,205,180,25,171,41,9,18,103,10,51,72,191,176,36,53,28,212,82,192,37,29,80,12,208,19,203,131,88,98,76,85,91,92,64,90,84,107,105,73,87,77,86,93,71,81,101,13};
    static int find = 169;
    static int answer = 0;
    static long start, stop;

    //  Declare Classes
    static LinearSearch linearSearch = new LinearSearch();
    static BinarySearch binarySearch = new BinarySearch();
    static JumpSearch jumpSearch = new JumpSearch();
    static InterpolationSearch interpolationSearch = new InterpolationSearch();
    static ExponentialSearch exponentialSearch = new ExponentialSearch();
    static TernarySearch ternarySearch = new TernarySearch();

    public static void main(String[] args) {

        System.out.println("List of Search operations can be performed : ");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search - Iterative Approach");
        System.out.println("3. Binary Search - Recursive Approach");
        System.out.println("4. Binary Search - Java Api Approach (Arrays)");
        System.out.println("5. Jump Search");
        System.out.println("6. Interpolation Search");
        System.out.println("7. Exponential Search");
        System.out.println("8. Ternary Search");

        System.out.println("Enter the type of Search to be performed : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                start = System.currentTimeMillis();
                answer = linearSearch.search(arr,find);
                printOutput();
                break;
            case 2:
                start = System.currentTimeMillis();
                Arrays.sort(arr);
                answer = binarySearch.iterativeSearch(arr,find);
                printOutput();
                break;
            case 3:
                start = System.currentTimeMillis();
                Arrays.sort(arr);
                int i = 0, j = arr.length - 1;
                answer = binarySearch.recursiveSearch(arr,i,j,find);
                printOutput();
                break;
            case 4:
                start = System.currentTimeMillis();
                Arrays.sort(arr);
                answer = binarySearch.arraysSearch(arr,find);
                printOutput();
                break;
            case 5:
                start = System.currentTimeMillis();
                Arrays.sort(arr);
                answer = jumpSearch.search(arr,find);
                printOutput();
                break;
            case 6:
                start = System.currentTimeMillis();
                Arrays.sort(arr);
                answer = interpolationSearch.search(arr,find);
                printOutput();
                break;
            case 7:
                start = System.currentTimeMillis();
                Arrays.sort(arr);
                answer = exponentialSearch.search(arr,find);
                printOutput();
                break;
            case 8:
                start = System.currentTimeMillis();
                Arrays.sort(arr);
                answer = ternarySearch.search(arr,find);
                printOutput();
                break;
            default:
                start = System.currentTimeMillis();
                System.out.println("Invalid input");
                break;
        }

    }

    public static void printOutput() {

        //  Print elapsed time
        long stop = System.currentTimeMillis();
        long elapsedTime = stop - start;
        System.out.println("Total time to execute this search : " + elapsedTime + " ms");

        //  Output
        if (answer == -1)
            System.out.println("Number not found in the Array");
        else
            System.out.println("Found at index : " + answer);

    }
}