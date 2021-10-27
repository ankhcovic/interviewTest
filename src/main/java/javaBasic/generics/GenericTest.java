package javaBasic.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ͨ���һ����ʹ��?�����������Ͳ�����
 * ���� List<?>���߼�����List<String>,List<Integer> ������List<��������ʵ��>�ĸ���
 * @author gaoyouxin
 * @date 2021/4/3 - 20:09
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

        // ��(//1)������ִ�����ΪgetUperNumber()�����еĲ����Ѿ��޶��˲�����������ΪNumber��
        // ���Է���ΪString�ǲ��������Χ֮�ڣ����Իᱨ��
        // getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3
    }

    /** ��ΪgetData()�����Ĳ�����List���͵ģ�
     *  ����name��age��number��������Ϊ���������ʵ�Σ������ͨ���������
     */
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    /**
     * ����ͨ�������ͨ������List�����壬
     * ��˶������ͨ�������ֵ����Number�����²���������
     * @param data
     */
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}
