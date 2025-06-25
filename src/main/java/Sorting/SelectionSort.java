package Sorting;

import java.util.Arrays;

public class SelectionSort implements SortInterface {


    public int[] sort(int[] nums) {

        int size = nums.length;
        int steps = 0;
        int temp;
        for (int i = 0; i < size - 1; i++) {
            steps++;
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

//        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("steps: " + steps);

        return nums;
    }
}
