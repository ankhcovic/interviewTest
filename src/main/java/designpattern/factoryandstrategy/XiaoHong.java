package designpattern.factoryandstrategy;

/**
 * @Description: <br>
 * @Author: GAO YX <br>
 * @E-mail: ankhgyx@gmail.com <br>
 * @DATE: 2021/10/27 18:52 <br>
 * @Version: 1.0 <br>
 **/
public class XiaoHong implements People {
    @Override
    public void eat() {
        System.out.println("Ð¡ºì´©ÒÂ");
    }

    @Override
    public void run() {
        System.out.println("Ð¡ºìÅÜ²½");
    }

    @Override
    public void wear() {
        System.out.println("Ð¡ºì´©ÒÂ");
    }
}
