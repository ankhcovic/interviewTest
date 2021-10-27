package javabasic.inheritance;

/**
 * @author gaoyouxin
 * @date 2021/4/4 - 0:05
 */
public class Manager extends Employee{
    private double bonus;

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
