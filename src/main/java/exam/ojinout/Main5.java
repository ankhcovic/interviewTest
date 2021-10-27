package exam.ojinout;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:32
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            int n = in.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += in.nextInt();
            }
            System.out.println(sum);
        }
    }
}
