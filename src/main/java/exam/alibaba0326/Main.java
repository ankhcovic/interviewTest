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
        // ��list��0��λ�ü�¼����������ԭ����ǰ���1��0������߽�
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0){
                list.add(i + 1);// ����ǰ�����1��0���Ұ�ԭ�����������������1
            }
        }
        list.add(len + 1);
        int numsOfZero = list.size();
        // ���ԭ�������鲻����0������һ��1����
        if (numsOfZero == 2){
            return len - 1;
        }
        // ���ԭ���������0����������ߵĳ���Ϊ0���ҵĵ�һ��0������֮���ټ�2 = ����0֮��1�ĳ���
        for (int i = 1; i < numsOfZero - 1; i++) {
            res = Math.max(list.get(i + 1) - list.get(i - 1) - 2, res);
        }
        return res;
    }
}

/**
 * ��������
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
