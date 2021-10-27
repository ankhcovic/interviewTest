package javaBasic.singleton;

/**
 * �Ծ�̬�ֶ�ʵ���̰߳�ȫ�ӳٳ�ʼ��
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
