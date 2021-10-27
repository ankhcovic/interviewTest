package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/6/8 - 17:45
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = in.nextLine().split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(strs[i]);
        }

        int target = in.nextInt();
        int res = binarySearch(nums, target);
        System.out.println(res);
    }

    private static int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
