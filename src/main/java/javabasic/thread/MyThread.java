package javabasic.thread;

/**
 * @author gaoyouxin
 * @date 2021/4/7 - 22:33
 */
public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public MyThread() {

    }
    /*@Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "ÕýÔÚÖ´ÐÐ£¡" + i);
        }
    }*/

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if ((i) % 10 == 0){
                System.out.println("----------" + i);
            }
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
