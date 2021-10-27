package exam.ojinout;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:17
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(), b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
