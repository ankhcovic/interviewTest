package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/5/5 - 13:14
 */
public class RabbitsInForest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            answers[i] = in.nextInt();
        }
        if (answers == null || answers.length == 0) {
            System.out.println(0);
            return;
        }
        Arrays.sort(answers);
        int numsOfSameColor = 1, valueOfSameColor = answers[0];
        int minNumsOfRabbit = 0;
        for (int i = 1; i < answers.length; i++) {
            if (answers[i] != answers[i - 1]) {
                minNumsOfRabbit += (int) Math.ceil(numsOfSameColor / (valueOfSameColor + 1)) * (valueOfSameColor + 1);
                numsOfSameColor = 1;
                valueOfSameColor = answers[i];
                continue;
            }
            numsOfSameColor++;
        }
        minNumsOfRabbit += (int) Math.ceil(numsOfSameColor / (valueOfSameColor + 1)) * (valueOfSameColor + 1);
        System.out.println(minNumsOfRabbit);
    }
}
