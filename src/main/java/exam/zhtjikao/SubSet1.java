package exam.zhtjikao;

import java.util.Scanner;

/**
 * LC494
 * @author gaoyouxin
 * @date 2021/3/29 - 14:44
 */
public class SubSet1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        String[] strs = str.split(" ");
        int[] nums = new int[strs.length];
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.valueOf(strs[i]);
        }
        System.out.println(findTargetSumWays(nums, e));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum < target || sum < -target || (target + sum) % 2 == 1) {
            return 0;
        }
        target = (target + sum) / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] + dp[i - num];
            }
        }
        return dp[target];
    }
}
