package exam.zhaohangzzw0417;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/17 - 20:36
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // n, m��ʾһ������
        int n = in.nextInt(), m = in.nextInt();
        // q��ʾһ��ѯ�ʴ���
        int q = in.nextInt();
        for (int k = 0; k < q; k++) {
            // i, j��ʾ��Ҫ�ҵ���������
            int i = in.nextInt(), j = in.nextInt();
            int realRow = i;
            if ((n & 1) == 1) {// ���Ϊ�������м��л����ϰ벿��
                realRow = i > n / 2 + 1 ? (n - i + 1) * 2 : 2 * i - 1;
            } else {
                realRow = i > n / 2 ? (n - i + 1) * 2 : 2 * i - 1;
            }

            int realVal = m * (realRow - 1) + j;
            System.out.println(realVal);
        }
    }
}
