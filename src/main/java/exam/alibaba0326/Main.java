package exam.alibaba0326;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/3/31 - 17:43
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int[] results = new int[total];
        for (int i = 0; i < total; i++) {
            int nums = in.nextInt();
            int[] numsArr = new int[nums];
            for (int j = 0; j < nums; j++) {
                numsArr[j] = in.nextInt();
            }
            results[i] = maxLen(numsArr);
        }
        for (int result : results){
            System.out.println(result);
        }
    }
    private static int maxLen(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int len = nums.length, res = 0;
        // 用list将0的位置记录下来，并将原数组前后加1个0，处理边界
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0){
                list.add(i + 1);// 由于前面加了1个0，我把原来数组的索引都加了1
            }
        }
        list.add(len + 1);
        int numsOfZero = list.size();
        // 如果原来的数组不存在0，拿走一个1即可
        if (numsOfZero == 2){
            return len - 1;
        }
        // 如果原来数组存在0，最长可以拿走的长度为0左右的第一个0的索引之差再减2 = 三个0之间1的长度
        for (int i = 1; i < numsOfZero - 1; i++) {
            res = Math.max(list.get(i + 1) - list.get(i - 1) - 2, res);
        }
        return res;
    }
}

/**
 * 测试用例
 * 5
 * 2
 * 1 1
 * 5
 * 0 0 0 0 0
 * 7
 * 1 0 1 0 1 0 1
 * 9
 * 0 1 1 0 1 1 0 1 1
 * 11
 * 0 0 1 1 1 1 1 0 1 0 0
 */
