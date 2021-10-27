package leetcode;

import java.util.Arrays;

/**
 * @author gaoyouxin
 * @date 2021/4/9 - 12:53
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        char[] chars = new char[]{'e', 'a', 't'};
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        String s = String.valueOf(chars);
        System.out.println(s);
    }
}
