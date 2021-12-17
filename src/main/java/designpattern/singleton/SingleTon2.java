package designpattern.singleton;

/**
 * 对实例字段实现线程安全的延迟初始化，基于volatile双重校验锁
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
