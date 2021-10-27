package leetcode;

/**
 * @author gaoyouxin
 * @date 2021/6/14 - 17:28
 */
public class SpaceComplex {
    public static void main(String[] args) {
        SpaceComplex spaceComplex = new SpaceComplex();
        System.out.println(spaceComplex.sumIteration(10));
        System.out.println(spaceComplex.sumRecursion(10));
    }

    public int sumIteration(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumRecursion(int n) {
        if(n == 0){
            return 0;
        }
        return n + sumRecursion(n - 1);
    }

}
