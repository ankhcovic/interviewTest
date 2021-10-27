package exam.ojinout;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:29
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += in.nextInt();
            }
            if (n == 0){
                break;
            }
            System.out.println(sum);
        }
    }
}
