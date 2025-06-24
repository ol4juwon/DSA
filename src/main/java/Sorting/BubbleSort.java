package Sorting;

import java.util.Arrays;

public class BubbleSort implements SortInterface {
    public static void main(String[] args) {
        int[] nums = {3,5,1,2,10,6,21,34,15};
        System.out.println("Before sorting"+Arrays.toString(nums) );
        sort(nums);

            System.out.println("After sorting"+Arrays.toString(nums) );

    }

    public static void sort(int[] nums) {
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
    }
}
