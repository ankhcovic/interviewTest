package javabasic.thread;

/**
 * @author gaoyouxin
 * @date 2021/4/7 - 22:35
 */
public class Demo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread("新的线程！");
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("新线程！" + i);
        }
    }
}
