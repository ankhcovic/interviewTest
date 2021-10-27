package javabasic.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 字节码随用随创建，随用随加载。是在运行期增强，所以叫做动态代理
 *
 * 使用JDK官方的Proxy类创建代理对象
 * @author gaoyouxin
 * @date 2021/4/2 - 10:20
 */
public class ClientByProxy implements InvocationHandler {

    private IActor iActor;// 被代理的接口不能用final修饰

    ClientByProxy(IActor iActor){
        this.iActor = iActor;
    }

    /**
     * @param proxy 调用这个方法的代理实例
     * @param method 要调用的方法
     * @param args 方法调用时所需要的参数
     * @return 方法调用的结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //进行method过滤，如果是其他方法就不调用
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
     * 获取被代理接口实例对象
     * ClassLoader：和被代理对象使用相同的类加载器。
     * Interfaces：和被代理对象具有相同的行为。实现相同的接口。
     * InvocationHandler：如何代理。
     */
    public IActor getProxyActor(){
        return (IActor) Proxy.newProxyInstance(iActor.getClass().getClassLoader(),
                iActor.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        IActor iActor = new Actor();
        ClientByProxy client = new ClientByProxy(iActor);
        IActor actorByClient = client.getProxyActor();
        //没有经纪公司的时候，直接找演员。
        iActor.basicAct(1000f);
        iActor.dangerAct(5000f);
        //剧组无法直接联系演员，而是由经纪公司找的演员
        actorByClient.basicAct(8000f);
        actorByClient.dangerAct(50000f);
    }


}
