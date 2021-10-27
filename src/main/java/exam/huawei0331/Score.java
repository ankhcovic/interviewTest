package exam.huawei0331;

import java.util.*;

/**
 * 题目描述
 * 足球比采用双循环赛制（印任意两队之间分主喜场进行两场比），胜平负分别得分3、1、0分。
 * 设计个足球比自动排名系统，以数组形式輸入比赛信息，如 Stringl str="ab21","ac3:4"。
 * 假设队伍名为a-2的26个英文字母，比球队最多26只。出各个参球队的积分并由高到低排名
 * （积分相同的按照球队名进行字典序排序）
 * @author gaoyouxin
 * @date 2021/4/8 - 16:08
 */
public class Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        while(true){
            String str = in.nextLine();
            if (str.equals("")){
                break;
            }
            int val1 = str.charAt(4) - '0';
            if (map.containsKey(str.charAt(0))){
                val1 += map.get(str.charAt(0));
            }
            map.put(str.charAt(0), val1);
            int val2 = str.charAt(6) - '0';
            if (map.containsKey(str.charAt(2))){
                val2 += map.get(str.charAt(2));
            }
            map.put(str.charAt(2), val2);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(list.get(i).getKey() + " " + list.get(i).getValue() + ",");
        }
        System.out.print(list.get(size - 1).getKey() + " " + list.get(size - 1).getValue());
    }
}
