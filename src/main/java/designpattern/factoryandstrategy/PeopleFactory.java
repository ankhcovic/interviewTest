package designpattern.factoryandstrategy;

/**
 * @Description: 人的工厂类 <br>
 * @Author: GAO YX <br>
 * @E-mail: ankhgyx@gmail.com <br>
 * @DATE: 2021/10/27 18:52 <br>
 * @Version: 1.0 <br>
 **/
public class PeopleFactory {
    public People getPeople(String name) {
        if (name.equals("XiaoMing")) {
            return new XiaoMing();
        } else if (name.equals("XiaoHong")) {
            return new XiaoHong();
        }
        return null;
    }
}

