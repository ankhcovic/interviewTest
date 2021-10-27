package javaBasic.generics;

/**
 * 定义一个泛型类
 * 这个类的类型只有再创建的后才能确定
 * @author gaoyouxin
 * @date 2021/4/3 - 20:07
 */
public class Box<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}
