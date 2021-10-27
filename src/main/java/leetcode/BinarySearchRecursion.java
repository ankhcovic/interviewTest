package leetcode;

/**
 * @author gaoyouxin
 * @date 2021/6/14 - 22:24
 */
public class BinarySearchRecursion {
    public static void main(String[] args) {
        BinarySearchRecursion binarySearchRecursion = new BinarySearchRecursion();
        int[] arr = new int[]{1,2,4,5,6,8};
        int res = binarySearchRecursion.binarySearch(arr, 0, 2, 4);
        System.out.println(res);
    }

    public int binarySearch(int[] arr, int l, int r, int target) {
        if (l > r) {
            return -1;
        }
        int mid = l + (r - l) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {// ����м��Ŀ��ֵС����ô�������Ұ��Ѱ��
            return binarySearch(arr, mid + 1, r, target);
        } else {// ����м��Ŀ��ֵ����ô����������Ѱ��
            return binarySearch(arr, l, mid - 1, target);
        }
    }
}
