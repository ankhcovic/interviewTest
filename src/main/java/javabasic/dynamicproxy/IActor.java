package javabasic.dynamicproxy;

/**
 * @author gaoyouxin
 * @date 2021/4/2 - 10:16
 */
public interface IActor {
    /**
     * �����ݳ�
     * @param money
     */
    public void basicAct(float money);

    /**
     * Σ���ݳ�
     * @param money
     */
    public void dangerAct(float money);
}

