package exam.huawei0414;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/14 - 19:46
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = in.nextInt();
        }
        int[] dis = new int[total];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < total; i++) {
            dis[i] = i + arr[i];
            map.put(dis[i], i);
        }
        int res = 1;
        int max = dis[0];
        for (int i = 0; i < total; ) {
            if (max >= total) {
                System.out.println(res);
                break;
            } else {
                int temp = 0;
                for (int j = i + 1; j < max; j++) {
                    temp = Math.max(temp, dis[j]);
                }
                max = temp;
                res++;
                i = map.get(temp);
            }
        }
    }
}
