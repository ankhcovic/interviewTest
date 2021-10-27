package javaBasic.singleton;

/**
 * 对静态字段实现线程安全延迟初始化
 * @author gaoyouxin
 * @date 2021/4/13 - 13:03
 */
public class SingleTon3 {
    private static class SingleTonHolder {
        public static final SingleTon3 instance = new SingleTon3();
    }

    private SingleTon3() {
    }

    public static final SingleTon3 getInstance() {
        return SingleTonHolder.instance;
    }
}
