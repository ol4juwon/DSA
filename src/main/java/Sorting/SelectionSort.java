package Sorting;

import java.util.Arrays;

public class SelectionSort implements SortInterface {

    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 2, 10, 6, 21, 34, 15};
        System.out.println("Before sorting" + Arrays.toString(nums));

        sort(nums);
        System.out.println("After sorting" + Arrays.toString(nums));
    }

    public static void sort(int[] nums) {

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

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("steps: " + steps);
    }
}
