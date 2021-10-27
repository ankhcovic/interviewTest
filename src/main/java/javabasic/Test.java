package javabasic;

/**
 * @author gaoyouxin
 * @date 2021/4/29 - 19:28
 */
public class Test {

    public int weight;
    public static void main(String[] args) {
        double percent = 0.8361;
        double left = 1.0;
        for (int i = 1; i < 400; i++) {
            left = percent * i - (int)(percent * i);
            if (left <= 0.01){
                System.out.println(i + " " + left);
            }
        }
    }

    @Override
    public String toString() {
        return "Test{" +
                "weight=" + weight +
                '}';
    }
}
