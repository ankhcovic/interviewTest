package exam.zhaohangzzw0417;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/17 - 20:36
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // n, m表示一个矩阵
        int n = in.nextInt(), m = in.nextInt();
        // q表示一个询问次数
        int q = in.nextInt();
        for (int k = 0; k < q; k++) {
            // i, j表示所要找的数的索引
            int i = in.nextInt(), j = in.nextInt();
            int realRow = i;
            if ((n & 1) == 1) {// 如果为奇数，中间行划到上半部分
                realRow = i > n / 2 + 1 ? (n - i + 1) * 2 : 2 * i - 1;
            } else {
                realRow = i > n / 2 ? (n - i + 1) * 2 : 2 * i - 1;
            }

            int realVal = m * (realRow - 1) + j;
            System.out.println(realVal);
        }
    }
}
