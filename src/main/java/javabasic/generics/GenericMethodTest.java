package javabasic.generics;

/**
 * Generic泛型
 *      假定我们有这样一个需求：
 *      写一个排序方法，能够对整型数组、字符串数组甚至其他任何类型的数组进行排序，该如何实现？
 *      答案是可以使用 Java 泛型。
 *      使用 Java 泛型的概念，我们可以写一个泛型方法来对一个对象数组排序。
 *      然后，调用该泛型方法来对整型数组、浮点数数组、字符串数组等进行排序。
 *
 * 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），
 * 类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
 * @author gaoyouxin
 * @date 2021/4/3 - 19:39
 */
public class GenericMethodTest {
    // 泛型方法printArray
    public static <E> void printArray(E[] inputArray){
        // 输出数组元素
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整型数组元素为:");
        // 传递一个整型数组
        printArray(intArray);

        System.out.println("\n双精度型数组元素为:");
        // 传递一个双精度型数组
        printArray(doubleArray);

        System.out.println("\n字符型数组元素为:");
        // 传递一个字符型数组
        printArray(charArray);
    }
}




















