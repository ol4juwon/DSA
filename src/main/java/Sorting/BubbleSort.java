package Sorting;

import java.util.Arrays;

public class BubbleSort implements SortInterface {

    public  int[] sort(int[] nums) {
        int size = nums.length;
        int steps =0;
        // iterate over  values
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                steps++;
                if (nums[j - 1] > nums[j]) {
                    // swap values
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("steps: "+steps);
        System.out.println("Array: " + Arrays.toString(nums));
        return nums;
    }
}
