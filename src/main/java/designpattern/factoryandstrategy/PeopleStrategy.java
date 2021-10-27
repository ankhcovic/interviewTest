package designpattern.factoryandstrategy;

/**
 * @Description: 人的策略类 <br>
 * @Author: GAO YX <br>
 * @E-mail: ankhgyx@gmail.com <br>
 * @DATE: 2021/10/27 19:18 <br>
 * @Version: 1.0 <br>
 **/
public class PeopleStrategy {

    private People people;

    public PeopleStrategy(People people) {
        this.people = people;
    }

    public PeopleStrategy(String name) {
        if (name.equals("XiaoMing")) {
            this.people = new XiaoMing();
        } else if (name.equals("XiaoHong")) {
            this.people = new XiaoHong();
        }
    }

    public void run() {
        people.run();
    }

    public void run11() {
        people.eat();
        people.run();
        people.eat();
    }
}
