package exam.ojinout;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:11
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int a = in.nextInt(), b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
