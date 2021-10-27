package javabasic.inheritance;

/**
 * @author gaoyouxin
 * @date 2021/4/4 - 0:01
 */
public class Employee {

    private static int id;
    private String name = "";
    private double salary;

    public Employee() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
