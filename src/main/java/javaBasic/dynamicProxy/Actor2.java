package javaBasic.dynamicProxy;

/**
 * 没有实现任何接口
 * @author gaoyouxin
 * @date 2021/4/2 - 10:35
 */
public class Actor2 {
    public void basicAct(float money) {
        System.out.println("拿到钱，开始基本的表演：" + money);
    }

    public void dangerAct(float money) {
        System.out.println("拿到钱，开始危险的表演：" + money);
    }
}
