package exam.netease0410;

import java.util.Scanner;

/**
 * in: {1, 2, 4},{-1, 2, 3}
 * @author gaoyouxin
 * @date 2021/4/10 - 14:52
 */
import java.util.*;


class Solution {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     * <p>
     * ���������������������������������Ľ�������ͨ��������ʽ���ء�
     *
     * @param minuendList    ListNode�� ����������ͷ
     * @param subtrahendList ListNode�� ��������ͷ
     * @return ListNode��
     */
    public ListNode minusList(ListNode minuendList, ListNode subtrahendList) {
        // write code here
        StringBuilder sb1 = new StringBuilder();
        for (ListNode l1 = minuendList; l1 != null; l1 = l1.next) {
            sb1.append(l1.val);
        }
        int num1 = Integer.valueOf(sb1.toString());
        StringBuilder sb2 = new StringBuilder();
        for (ListNode l2 = minuendList; l2 != null; l2 = l2.next) {
            sb2.append(l2.val);
        }
        int num2 = Integer.valueOf(sb2.toString());
        int res = num1 - num2;
        boolean flag = res >= 0 ? true : false;
        String resStr = String.valueOf(res);
        int length = resStr.length();
        ListNode resNode = new ListNode(-1);
        ListNode cur = resNode;
        if (true) {
            for (int i = 0; i < length; i++) {
                int tmpValue = Integer.valueOf(resStr.charAt(i));
                ListNode tmp = new ListNode(tmpValue);
                cur.next = tmp;
                cur = cur.next;
            }
        } else {
            for (int i = 1; i < length; i++) {
                int tmpValue = Integer.valueOf(resStr.charAt(i));
                if (i == 1) {
                    tmpValue = -tmpValue;
                }
                ListNode tmp = new ListNode(tmpValue);
                cur.next = tmp;
                cur = cur.next;
            }
        }

        return resNode.next;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
