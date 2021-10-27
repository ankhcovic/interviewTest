package javabasic.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * �ֽ��������洴������������ء�������������ǿ�����Խ�����̬����
 *
 * ʹ��JDK�ٷ���Proxy�ഴ���������
 * @author gaoyouxin
 * @date 2021/4/2 - 10:20
 */
public class ClientByProxy implements InvocationHandler {

    private IActor iActor;// ������Ľӿڲ�����final����

    ClientByProxy(IActor iActor){
        this.iActor = iActor;
    }

    /**
     * @param proxy ������������Ĵ���ʵ��
     * @param method Ҫ���õķ���
     * @param args ��������ʱ����Ҫ�Ĳ���
     * @return �������õĽ��
     * @throws Throwable �쳣
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //����method���ˣ���������������Ͳ�����
        String name = method.getName();
        Float money = (Float) args[0];
        Object rtValue = null;
        if ("basicAct".equals(name)){
            if (money > 2000){
                rtValue = method.invoke(iActor, money / 2);
            }
        }
        if ("dangerAct".equals(name)){
            if (money > 5000){
                rtValue = method.invoke(iActor, money / 2);
            }
        }
        return rtValue;
    }

    /**
     * ��ȡ������ӿ�ʵ������
     * ClassLoader���ͱ��������ʹ����ͬ�����������
     * Interfaces���ͱ�������������ͬ����Ϊ��ʵ����ͬ�Ľӿڡ�
     * InvocationHandler����δ���
     */
    public IActor getProxyActor(){
        return (IActor) Proxy.newProxyInstance(iActor.getClass().getClassLoader(),
                iActor.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        IActor iActor = new Actor();
        ClientByProxy client = new ClientByProxy(iActor);
        IActor actorByClient = client.getProxyActor();
        //û�о��͹�˾��ʱ��ֱ������Ա��
        iActor.basicAct(1000f);
        iActor.dangerAct(5000f);
        //�����޷�ֱ����ϵ��Ա�������ɾ��͹�˾�ҵ���Ա
        actorByClient.basicAct(8000f);
        actorByClient.dangerAct(50000f);
    }


}
