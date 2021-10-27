package designpattern.factoryandstrategy;

/**
 * @Description: <br>
 * @Author: GAO YX <br>
 * @E-mail: ankhgyx@gmail.com <br>
 * @DATE: 2021/10/27 18:50 <br>
 * @Version: 1.0 <br>
 **/
public class XiaoMing implements People {
    @Override
    public void eat() {
        System.out.println("小明吃饭");
    }

    @Override
    public void run() {
        System.out.println("小明跑步");
    }

    @Override
    public void wear() {
        System.out.println("小明穿衣");
    }
}
