package exam.huawei0428;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/28 - 16:08
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();
        int left = 0, right = length - 1;
        StringBuilder stringBuilder = new StringBuilder();
        int flag = 0;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                stringBuilder.append(str.charAt(right));
                right--;
                flag++;
                continue;
            }
            stringBuilder.append(str.charAt(left));
            right--;
            left++;
        }
        if (flag == 0) {
            System.out.println(str);
            return;
        }
        String tmp = stringBuilder.toString();
        for (int i = tmp.length() - 2; i >= 0; i--) {
            stringBuilder.append(tmp.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
