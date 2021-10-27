package exam.huawei0414;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author gaoyouxin
 * @date 2021/4/14 - 19:14
 */
public class Main1 {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        // 输入的字符串
        //String s = in.nextLine();
        String s = "((jhku)(love)i)";
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        int[] pair = new int[n];

        // 先去找匹配的括号
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0, d = 1; i < n; i += d) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pair[i];
                d = -d;
            } else {
                res.append(s.charAt(i));
            }
        }
        System.out.println(res.toString());
    }
}
