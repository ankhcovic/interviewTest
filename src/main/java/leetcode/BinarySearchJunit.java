package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/6/8 - 17:45
 */
public class BinarySearchJunit {
    public int[] nums;
    public int target;

    public BinarySearchJunit(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public BinarySearchJunit() {
    }

    public int binarySearch() {
        int low = 0, high = nums.length;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return -1;
    }
}
