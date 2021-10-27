package leetcode;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/2 - 20:08
 */
public class ThrowEggs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numsOfEggs = in.nextInt();
        int floors = in.nextInt();
        int minTimes = minTimes(floors);
        System.out.println(minTimes);
        int throwFloor = minTimes;
        int incre = throwFloor;
        while (throwFloor <= floors){
            System.out.print(throwFloor + " ");
            throwFloor += --incre;
        }
        if(throwFloor - incre < floors){
            System.out.print(floors + "");
        }
    }
    private static int minTimes(int floors){
        double res = 0;
        res = (-1 + Math.sqrt(8 * floors + 1)) / 2;
        return (int) Math.ceil(res);
    }
}
