package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author gaoyouxin
 * @date 2021/4/18 - 12:22
 */
public class KthLargest {

    private int k;
    private int[] nums;
    ArrayList<Integer> list = new ArrayList<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return list.get(k - 1);
    }
}
