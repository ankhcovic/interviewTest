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
    public ArrayList<Integer> list = new ArrayList<>();   //���ڴ����ȡ�Ӽ��е�Ԫ��
    //��ȡ����������Ԫ�غ�
    public int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i = 0;i < list.size();i++) {
            sum += list.get(i);
        }
        return sum;
    }
    /*
     * ����step��ѡ������A�е�step��Ԫ��Ϊ�Ӽ�Ԫ��
     * �������ܣ���ȡ����A��һ���Ӽ�Ԫ�أ������֮�͵���m
     */
    public void getSubSet(int[] A, int m, int step) {
        while(step < A.length) {
            list.add(A[step]);   //�ݹ�ִ����䣬���������������һ��Ԫ��
            if(getSum(list) == m){   //������Ԫ�غ͵���m
                res.add(list);
                System.out.println(list);
            }
            step++;
            getSubSet(A, m, step);
            list.remove(list.size() - 1);   //����ִ����䣬ɾ�������������һ��Ԫ��
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
        int m = (sum - e) / 2;// (sum - e)/2������x���Ӽ����
        test.getSubSet(nums, m, 0);
        System.out.println(test.res.size());
    }
}
