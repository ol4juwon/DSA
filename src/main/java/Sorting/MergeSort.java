package Sorting;

public class MergeSort implements SortInterface {

    // using a mid
    @Override
    public int[] sort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static int mid(int start, int end) {
        return (int) Math.floor((start + end) / 2.0);
    }

    private static void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = mid(start, end);
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }

    }

    private static void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        for (int i = 0; i < n1; i++) {
            lArr[i] = nums[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rArr[j] = nums[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                nums[k] = lArr[i];
                i++;
            } else {
                nums[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums[k] = rArr[j];
            j++;
            k++;
        }


    }
}
