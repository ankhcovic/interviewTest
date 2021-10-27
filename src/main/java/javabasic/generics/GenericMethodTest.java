package javabasic.generics;

/**
 * Generic����
 *      �ٶ�����������һ������
 *      дһ�����򷽷����ܹ����������顢�ַ����������������κ����͵�����������򣬸����ʵ�֣�
 *      ���ǿ���ʹ�� Java ���͡�
 *      ʹ�� Java ���͵ĸ�����ǿ���дһ�����ͷ�������һ��������������
 *      Ȼ�󣬵��ø÷��ͷ��������������顢���������顢�ַ�������Ƚ�������
 *
 * ���з��ͷ�����������һ�����Ͳ����������֣��ɼ����ŷָ�����
 * ���Ͳ������������ڷ�����������֮ǰ�������������е�<E>����
 * @author gaoyouxin
 * @date 2021/4/3 - 19:39
 */
public class GenericMethodTest {
    // ���ͷ���printArray
    public static <E> void printArray(E[] inputArray){
        // �������Ԫ��
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // ������ͬ�������飺 Integer, Double �� Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("��������Ԫ��Ϊ:");
        // ����һ����������
        printArray(intArray);

        System.out.println("\n˫����������Ԫ��Ϊ:");
        // ����һ��˫����������
        printArray(doubleArray);

        System.out.println("\n�ַ�������Ԫ��Ϊ:");
        // ����һ���ַ�������
        printArray(charArray);
    }
}




















