package designpattern.singleton;

/**
 * ��ʵ���ֶ�ʵ���̰߳�ȫ���ӳٳ�ʼ��������volatile˫��У����
 * @author gaoyouxin
 * @date 2021/4/13 - 12:59
 */
public class SingleTon2 {
    private SingleTon2() {
    }

    private volatile static SingleTon2 instance;

    public static SingleTon2 getInstance() {
        if (instance == null) {
            synchronized (SingleTon2.class) {
                if (instance == null) {
                    instance = new SingleTon2();
                }
            }
        }
        return instance;
    }
}
