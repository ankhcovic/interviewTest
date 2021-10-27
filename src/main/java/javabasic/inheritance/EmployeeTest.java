package javabasic.inheritance;

/**
 * @author gaoyouxin
 * @date 2021/4/4 - 0:35
 */
class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
//        Manager boss = new Manager();
        Employee[] staff = new Employee[3];

        Manager boss = (Manager) staff[1];


    }
}