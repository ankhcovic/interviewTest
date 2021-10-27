package javaBasic.dynamicProxy;

/**
 * 使用jdk中的proxy类的动态代理，必须实现一个接口
 * @author gaoyouxin
 * @date 2021/4/2 - 10:19
 */
public class Actor implements IActor{

    @Override
    public void basicAct(float money) {
        System.out.println("拿到钱，开始基本表演：" + money);
    }

    @Override
    public void dangerAct(float money) {
        System.out.println("拿到钱，开始危险表演：" + money);
    }
}