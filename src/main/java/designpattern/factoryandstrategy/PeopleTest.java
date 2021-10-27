package designpattern.factoryandstrategy;

import org.junit.jupiter.api.Test;

/**
 * @Description: 工厂模式和策略模式的测试类 <br>
 * @Author: GAO YX <br>
 * @E-mail: ankhgyx@gmail.com <br>
 * @DATE: 2021/10/27 19:22 <br>
 * @Version: 1.0 <br>
 **/
public class PeopleTest {
    @Test
    public void testSign(){
        PeopleFactory peopleFactory = new PeopleFactory();
        People people = peopleFactory.getPeople("XiaoHong");
        System.out.print("工厂模式--------------");
        people.eat();
        System.out.print("工厂模式--------------");
        people.run();
        System.out.print("工厂模式--------------");
        people.eat();

        System.out.println("===========================");

        PeopleStrategy peopleStrategy = new PeopleStrategy("XiaoHong");
        System.out.print("策略模式--------------");
//        peopleStrategy.run();
        peopleStrategy.run11();
    }
}

/**
 工厂模式：返回的是接口实现类的实例化对象，最后返回的结果是接口实现类中的方法
           不管方法拼接，只关注最后的结果
 策略模式：在实例化策略模式的时候对象已经创建好了，可以在策略模式中随意拼接重写方法
           注重过程
 如果想小红先吃饭再跑步再吃饭，需要再测试类中写三种，但是只需要再策略模式的方法中直接定义即可

 如果在实现类中直接拼接这些方法，那么当没变更一次逻辑就要新增一个方法，一旦逻辑多起来，代码会变得冗余，难以维护

 策略模式和微服务很像，people类中的几个方法就好像几个接口。策略服务的宗旨就在于将方法之间连接起来，达到一个新的方法，微服务的宗旨
 也是为了防止服务的多次调用，降低代码的耦合度，因此两者有一定的相似之处

 https://mp.weixin.qq.com/s/wCTrt3ftCDmja89eUeAIDw
 **/


