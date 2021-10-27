package exam.alibaba0406;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/6 - 15:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(), y = in.nextInt(), sum = 0;
        in.nextLine();// È¥³ý¿Õ¸ñ
        String[] strs = in.nextLine().split(" ");
        int len = strs.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.valueOf(strs[i]);
            sum += nums[i];
        }
    }

}
