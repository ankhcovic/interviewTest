package javaBasic.Thread;

/**
 * @author gaoyouxin
 * @date 2021/4/7 - 22:42
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
