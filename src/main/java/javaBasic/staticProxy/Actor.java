package javaBasic.staticProxy;

import javaBasic.dynamicProxy.IActor;

/**
 * ʵ���˽ӿ�
 * @author gaoyouxin
 * @date 2021/4/2 - 10:19
 */
public class Actor implements IActor {

    @Override
    public void basicAct(float money) {
        System.out.println("�õ�Ǯ����ʼ�������ݣ�" + money);
    }

    @Override
    public void dangerAct(float money) {
        System.out.println("�õ�Ǯ����ʼΣ�ձ��ݣ�" + money);
    }
}