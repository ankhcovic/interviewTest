package exam.huawei0827;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 27/8/2021 - ����6:44
 */
public class InTest {
    /**
     * ��Ŀ����n����Χ��һȦ��˳���źš�
     * �ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ����ʼ����λΪ1��ʼ
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
