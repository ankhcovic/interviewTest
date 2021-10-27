package exam.ojinout;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 17:29
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLong()){
            long a = in.nextLong(), b = in.nextLong();
            System.out.println(a + b);
        }
    }
}
