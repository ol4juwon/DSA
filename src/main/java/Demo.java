import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        int[] nums = new int[10000];

        java.util.Set<Integer> numSet = new java.util.HashSet<>();
        while (numSet.size() < nums.length) {
            numSet.add((int) (Math.random() * 10000000) + 1);
        }
        int index = 0;
        for (int num : numSet) {
            nums[index++] = num;
        }
        nums = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(nums));
        int target = 2433;
        int start = (int) (Instant.now().toEpochMilli());
        int result = linearSearch(nums, target);
        int end = (int) (Instant.now().toEpochMilli());
        System.out.println("Linear Search Time taken: " + (end - start) + " ms");
        if (result != -1)
            System.out.println("element found at " + result);
        else
            System.out.println("element not found");

        int start2 = (int) (Instant.now().toEpochMilli());
        int binaryResult = binarySearch(nums, target);
        int end2 = (int) (Instant.now().toEpochMilli());
        System.out.println("Binary Search Time taken: " + (end2 - start2) + " ms");
        if (result != -1)
            System.out.println("Binary element found at " + binaryResult);
        else
            System.out.println("element not found");


        int start3 = (int) (Instant.now().toEpochMilli());
        int recursiveBinaryResult = recursiveBinarySearch(nums, target, 0, nums.length - 1);
        int end3 = (int) (Instant.now().toEpochMilli());
        System.out.println("Recursive Binary Search Time taken: " + (end3 - start3) + " ms");
        if (result != -1)
            System.out.println("Recursive Binary element found at " + recursiveBinaryResult);
    }

    public static int linearSearch(int[] nums, int target) {
        int steps =0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("steps: "+steps);
                return i;
            }
        }
        System.out.println("steps: "+steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps =0;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("steps: "+steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("steps: "+steps);
        return -1;
    }

    public static int recursiveBinarySearch(int[] nums, int target, int left, int right) {
        if (left <=right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                return recursiveBinarySearch(nums, target, mid + 1, right);
            }
            else
                return recursiveBinarySearch(nums, target, left, mid - 1);
        }
        return -1;

    }
}
