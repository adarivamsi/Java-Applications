package com.adarivamsi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Global values
//    static int[] arr = {1,152,78,123,151,26,79,161,114,110,144,38,32,54,126,118,50,109,162,165,184,69,45,160,157,116,158,187,119,113,141,163,117,142,172,40,136,127,130,5,112,199,55,124,96,148,17,52,154,156,31,15,143,181,194,102,21,61,147,153,63,0,175,68,66,74,128,104,168,177,159,3,43,145,24,35,120,34,46,49,146,166,106,4,8,58,183,7,207,132,211,139,138,200,83,111,133,97,48,20,206,14,189,56,209,169,23,210,129,170,60,16,195,188,155,2,173,182,213,75,57,150,99,108,179,204,30,94,100,121,201,134,149,44,140,198,65,115,59,70,190,196,33,185,62,39,167,174,125,22,95,6,197,178,27,193,202,135,42,67,164,137,214,122,89,11,186,47,205,180,25,171,41,9,18,103,10,51,72,191,176,36,53,28,212,82,192,37,29,80,12,208,19,203,131,88,98,76,85,91,92,64,90,84,107,105,73,87,77,86,93,71,81,101,13};
    static int[] arr = {3,7,4,1,5,6,2};
    static int[] answer;
    static long start, stop;

    public static void main(String[] args) {

        System.out.println("List of Sort operations can be performed : ");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Heap Sort");
        System.out.println("6. Quick Sort");
        System.out.println("7. Radix Sort");

        System.out.println("Enter the type of Sort to be performed : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // Declaring classes
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();
        QuickSort quickSort = new QuickSort();
        RadixSort radixSort = new RadixSort();

        switch (input) {
            case 1:
                start = System.currentTimeMillis();
                answer = selectionSort.sort(arr);
                printOutput();
                break;
            case 2:
                start = System.currentTimeMillis();
                answer = bubbleSort.sort(arr);
                printOutput();
                break;
            case 3:
                start = System.currentTimeMillis();
                answer = insertionSort.sort(arr);
                printOutput();
                break;
            case 4:
                start = System.currentTimeMillis();
                int initial = 0;
                int end = arr.length-1;
                answer = mergeSort.sort(arr,initial,end);
                printOutput();
                break;
            case 5:
                start = System.currentTimeMillis();
                answer = heapSort.sort(arr);
                printOutput();
                break;
            case 6:
                start = System.currentTimeMillis();
                initial = 0;
                end = arr.length-1;
                answer = quickSort.sort(arr,initial,end);
                printOutput();
                break;
            case 7:
                start = System.currentTimeMillis();
                answer = radixSort.sort(arr);
                printOutput();
                break;
            default:
                start = System.currentTimeMillis();
                System.out.println("Invalid input");
                break;
        }

    }

    private static void printOutput() {

        //  Print elapsed time
        stop = System.currentTimeMillis();
        long elapsedTime = stop - start;
        System.out.println("Total time to execute this search : " + elapsedTime + " ms");

        //  Output
        System.out.println("Sorted Array : " + Arrays.toString(answer));

    }
}
