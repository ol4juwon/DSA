package Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        QuickSort quickSort = new QuickSort();
        int[] nums = {7,2,64,35,6,27,18,39,10};
        System.out.println("Unsorted"+Arrays.toString(nums));
        int[] snums = quickSort.sort(nums);
        System.out.println("Sorted"+Arrays.toString(snums));

    }
}
