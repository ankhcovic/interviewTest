package javaBasic.Thread;

/**
 * @author gaoyouxin
 * @date 2021/4/7 - 22:43
 */
public class Demo2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr, "Сǿ");
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("����" + i);
        }
    }
}
