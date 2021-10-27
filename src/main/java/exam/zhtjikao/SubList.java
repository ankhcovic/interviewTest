package exam.zhtjikao;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/3/29 - 17:37
 */
public class SubList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int max = 0;
        if (n < 1) {
            return;
        }
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0){
                sum = 0;
                continue;// 如果nums等于0，那么sum清0
            }
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
