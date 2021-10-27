package exam.netease0327;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/3/27 - 15:13
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 满减门槛， y优惠金额
        int t = in.nextInt(), y = in.nextInt(), sum = 0;
        in.nextLine();// 去除空格
        String[] strs = in.nextLine().split(" ");
        int len = strs.length;
        // 商品的价格表
        int[] prices = new int[len];
        for (int i = 0; i < len; i++) {
            prices[i] = Integer.valueOf(strs[i]);
            sum += prices[i];
        }
        if (sum < t) {
            System.out.println(-1);
            return;
        }
        // 背包问题，尽可能多放
        int m = sum - t;
        int[] dp = new int[m + 1];
        for (int i = 0; i < len; i++) {
            for (int j = m; j >= 0; j--) {
                if (prices[i] > j) {// 该商品必须添加
                    break;
                }
                dp[j] = Math.max(dp[j - prices[i]] + prices[i], dp[j]);
            }
        }
        System.out.println(sum - dp[m] - y);
    }
}
