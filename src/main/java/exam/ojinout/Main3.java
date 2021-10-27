package exam.ojinout;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 16:21
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt(), b = in.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a + b);
        }
    }
}
