package exam.zhaohangzzw0417;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * һά�����ҵ���С��ֻ����һ�ε�Ԫ�ص��±�
 * @author gaoyouxin
 * @date 2021/4/17 - 21:17
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ��ʾ��T������
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            // ��ʾ�����Ŀ��n������
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
