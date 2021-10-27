package exam.huawei0827;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 27/8/2021 - 下午6:44
 */
public class InTest {
    /**
     * 题目：有n个人围成一圈，顺序排号。
     * 从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。起始索引位为1开始
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, i);
        }
        System.out.println(order(n, map));
    }

    private static int order(int n, Map<Integer, Integer> map){
        if (n == 1){
            return 1;
        }
        if (n == 2 || n == 3){
            return 2;
        }

        int temp = n % 3;

        int nullFlag = 0;
        for (int i = 1; i <= n - temp; i++) {
            if (map.get(i) % 3 == 0){
                map.put(i, null);
                nullFlag++;
                continue;
            }
            map.put(i, n - nullFlag + temp);
        }
        for (int i = n - temp; i <= n; i++) {
            map.put(i, i - (n - temp) + 1);
        }

        n = 0;
        for (int i = 1; i <= map.size(); i++) {
            if (map.get(i) != null){
                n++;
            }
        }
        return order(n, map);
    }
}
