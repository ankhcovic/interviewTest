package exam.ojinout;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:52
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String[] strs = in.nextLine().split(" ");
            Arrays.sort(strs);
            for (int i = 0; i < strs.length; i++) {
                System.out.print(strs[i] + " ");
            }
            System.out.println("");
        }
    }
}
