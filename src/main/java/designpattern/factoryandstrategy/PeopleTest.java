package designpattern.factoryandstrategy;

import org.junit.jupiter.api.Test;

/**
 * @Description: ����ģʽ�Ͳ���ģʽ�Ĳ����� <br>
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
        System.out.print("����ģʽ--------------");
        people.eat();
        System.out.print("����ģʽ--------------");
        people.run();
        System.out.print("����ģʽ--------------");
        people.eat();

        System.out.println("===========================");

        PeopleStrategy peopleStrategy = new PeopleStrategy("XiaoHong");
        System.out.print("����ģʽ--------------");
//        peopleStrategy.run();
        peopleStrategy.run11();
    }
}

/**
 ����ģʽ�����ص��ǽӿ�ʵ�����ʵ����������󷵻صĽ���ǽӿ�ʵ�����еķ���
           ���ܷ���ƴ�ӣ�ֻ��ע���Ľ��
 ����ģʽ����ʵ��������ģʽ��ʱ������Ѿ��������ˣ������ڲ���ģʽ������ƴ����д����
           ע�ع���
 �����С���ȳԷ����ܲ��ٳԷ�����Ҫ�ٲ�������д���֣�����ֻ��Ҫ�ٲ���ģʽ�ķ�����ֱ�Ӷ��弴��

 �����ʵ������ֱ��ƴ����Щ��������ô��û���һ���߼���Ҫ����һ��������һ���߼�������������������࣬����ά��

 ����ģʽ��΢�������people���еļ��������ͺ��񼸸��ӿڡ����Է������ּ�����ڽ�����֮�������������ﵽһ���µķ�����΢�������ּ
 Ҳ��Ϊ�˷�ֹ����Ķ�ε��ã����ʹ������϶ȣ����������һ��������֮��

 https://mp.weixin.qq.com/s/wCTrt3ftCDmja89eUeAIDw
 **/


