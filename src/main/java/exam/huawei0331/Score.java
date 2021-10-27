package exam.huawei0331;

import java.util.*;

/**
 * ��Ŀ����
 * ����Ȳ���˫ѭ�����ƣ�ӡ��������֮�����ϲ�����������ȣ���ʤƽ���ֱ�÷�3��1��0�֡�
 * ��Ƹ�������Զ�����ϵͳ����������ʽݔ�������Ϣ���� Stringl str="ab21","ac3:4"��
 * ���������Ϊa-2��26��Ӣ����ĸ����������26ֻ������������ӵĻ��ֲ��ɸߵ�������
 * ��������ͬ�İ�������������ֵ�������
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
