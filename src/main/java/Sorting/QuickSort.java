package Sorting;

import java.util.Arrays;

public class QuickSort implements SortInterface{
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    @Override
    public int[] sort(int[] nums) {

        return quickSort(nums,0, nums.length -1);
    }

    public int[] sort(int[] nums,boolean isAsc){
        if(isAsc){
            return quickSort(nums,0, nums.length -1);
        }else{
            int[] sortedNums = quickSort(nums,0, nums.length -1);
            Arrays.sort(sortedNums);
            return sortedNums;
        }
    }
    private int[] quickSort(int[] nums,int low,int high){
        if(low<high){
            int p = partition(nums,low,high);
            quickSort(nums,low,p-1);
            quickSort(nums,p+1,high);
        }

        return nums;
    }

    private int partition(int[] nums,int low,int high){

        int pivot = nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){

            if(nums[j]>=pivot){
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,high);
        return i+1;
    }


}
