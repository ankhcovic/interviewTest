package exam.ojinout;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:36
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++){
                sum += in.nextInt();
            }
            System.out.println(sum);
        }
    }
}
