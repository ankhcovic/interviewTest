package exam.ojinout;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:38
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String s = in.nextLine();
            int sum = 0;
            String[] strs = s.split(" ");
            for (int i = 0; i < strs.length; i++) {
                sum += Integer.valueOf(strs[i]);
            }
            System.out.println(sum);
        }
    }
}
