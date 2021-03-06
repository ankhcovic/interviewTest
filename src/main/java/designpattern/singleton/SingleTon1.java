package designpattern.singleton;

/**
 * @author gaoyouxin
 * @date 2021/4/13 - 12:56
 */
public class SingleTon1 {
    private SingleTon1() {
    }

    private static SingleTon1 instance;

    public static synchronized SingleTon1 getInstance() {
        if (instance == null) {
            instance = new SingleTon1();
        }
        return instance;
    }
}
