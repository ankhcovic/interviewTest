package exam.huawei0827;

import java.util.Arrays;

/**
 * @author gaoyouxin
 * @date 27/8/2021 - ????7:58
 */
public class InTest2 {
    public static void main(String[] args) {
        int[] weights = new int[]{1,2,3,1,1};
        int day = 4;
        System.out.println(minLoad(weights, day));

    }

    private static int minLoad(int[] weight, int day){
        int sum = Arrays.stream(weight).sum();
        int temp = sum % day;
        int minLoad = 0;
        // ???????????????
        if (temp == 0){
            minLoad = sum / day;
        } else{
            minLoad = sum / day + 1;
        }
        // ?????????????????????????????????1?????§³???????????????????????
        while (!canLoad(weight, minLoad, day)){
            minLoad++;
        }
        return minLoad;
    }

    private static boolean canLoad(int[] weight, int minLoad, int day){
        int tempLoad = minLoad;
        int i = weight.length - 1;
        while (i > 0) {
            if (tempLoad < weight[i]){
                return false;
            }
            while(i >= 0 && tempLoad >= weight[i]){
                tempLoad -= weight[i];
                i--;
            }
            tempLoad = minLoad;
            day--;
        }
        return day >= 0;
    }
}
