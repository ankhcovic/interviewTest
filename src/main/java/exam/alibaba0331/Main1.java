package exam.alibaba0331;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/3/31 - 19:45
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        String[] strs = s.split(" ");
        int len = strs.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.valueOf(strs[i]);
        }
        System.out.println(minDiff(nums, k));
    }
    private static int minDiff(int[] nums, int k){
        if (nums == null || nums.length < 0){
            return 0;
        }
        int length = nums.length;
        if (length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        int res = nums[length - 1] - nums[0];
        for (int i = 0; i < length - 1; i++) {
            int tmpMax = Math.max(nums[length - 1] - k, nums[i] + k);// 争最大值
            System.out.println(tmpMax);
            int tmpMin = Math.min(nums[0] + k, nums[i + 1] - k);// 争最值
            res = Math.min(tmpMax - tmpMin, res);
            System.out.println(tmpMin);
        }

        return res;
    }
}
