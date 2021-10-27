package exam.ojinout;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:44
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = in.next();
        }
        Arrays.sort(strs);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(strs[i] + " ");
        }
        System.out.print(strs[n - 1]);
    }
}
