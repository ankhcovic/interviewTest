package exam.ojinout;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:56
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String[] strs = in.nextLine().split(",");
            Arrays.sort(strs);
            for (int i = 0; i < strs.length - 1; i++) {
                System.out.print(strs[i] + ",");
            }
            System.out.print(strs[strs.length - 1]);
            System.out.println("");
        }
    }
}
