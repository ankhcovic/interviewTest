package exam.huawei0414;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/14 - 18:58
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 产生多少次速度数据
        int N = in.nextInt();
        int[] speeds = new int[N];
        for (int i = 0; i < N; i++) {
            speeds[i] = in.nextInt();
        }
        if (N == 1) {
            System.out.println(speeds[0]);
            return;
        }
        System.out.println(speeds[0] + ",");
        for (int i = 1; i < N; i++) {
            if ((i % 60 == 0) && (speeds[i] - speeds[i - 1] >= 9)) {

            }
        }
    }
}
