package exam.zhtjikao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * LC494
 * @author gaoyouxin
 * @date 2021/3/29 - 13:40
 */
public class SubSet {
    public List<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<Integer> list = new ArrayList<>();   //用于存放求取子集中的元素
    //求取数组链表中元素和
    public int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i = 0;i < list.size();i++) {
            sum += list.get(i);
        }
        return sum;
    }
    /*
     * 参数step：选中数组A中第step个元素为子集元素
     * 函数功能：求取数组A中一个子集元素，其相加之和等于m
     */
    public void getSubSet(int[] A, int m, int step) {
        while(step < A.length) {
            list.add(A[step]);   //递归执行语句，向数组链表中添加一个元素
            if(getSum(list) == m){   //链表中元素和等于m
                res.add(list);
                System.out.println(list);
            }
            step++;
            getSubSet(A, m, step);
            list.remove(list.size() - 1);   //回溯执行语句，删除数组链表最后一个元素
        }
    }

    public static void main(String[] args) {
        SubSet test = new SubSet();
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        String[] strs = str.split(" ");
        int[] nums = new int[strs.length];
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.valueOf(strs[i]);
            sum += nums[i];
        }
        if (sum < e || sum < -e){
            System.out.println(0);
            return;
        }
        int m = (sum - e) / 2;// (sum - e)/2可以由x的子集组合
        test.getSubSet(nums, m, 0);
        System.out.println(test.res.size());
    }
}
