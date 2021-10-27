package exam.zhaohangzzw0417;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 一维数组找到最小的只出现一次的元素的下标
 * @author gaoyouxin
 * @date 2021/4/17 - 21:17
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 表示有T行输入
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            // 表示这道题目有n个数字
            int n = in.nextInt();
            int[] nums = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                nums[j] = in.nextInt();
                if (map.containsKey(nums[j])){
                    map.put(nums[j], -1);
                    continue;
                }
                map.put(nums[j], j + 1);
            }
            int count = 0;
            for (int num : nums){
                if (map.get(num) != -1){
                    System.out.println(map.get(num));
                    break;
                }
                count++;
            }
            if (count == n){
                System.out.println(-1);
            }
        }
    }
}
