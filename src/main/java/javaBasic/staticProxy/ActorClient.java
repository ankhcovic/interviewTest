package javaBasic.staticProxy;

/**
 *  因为静态代理是字节码一上来就创建好，并完成加载。是在编译器完成的，所以叫做静态代理
 *
 *  静态代理需要代理类和被代理类实现相同的接口。
 *  静态代理的缺点是冗余，因为一个代理类只能代理一个接口，
 *  因此如果需要代理多个接口时就会产生非常多的代理类，这样就会造成大量的资源消耗。
 *  另外也不利于维护，当接口增加方法，代理类和委托类都要进行修改，耦合性太大。
 * @author gaoyouxin
 * @date 2021/4/16 - 12:45
 */
public class ActorClient implements IActor{

    // 被代理对象作为一个成员变量并提供一个有参构造
    private Actor actor;

    public ActorClient(Actor actor) {
        this.actor = actor;
    }

    // 实现需要实现的方法，并且调用被代理类的方法对其增强
    // 产生一个问题，每个代理类只能代理一个被代理类
    // 当接口增加方法时，代理类和被代理类都需要修改，耦合很强
    @Override
    public void basicAct(float money) {
        if (money < 2000){
            System.out.println("价格太低，拒绝此次基本演出");
            return;
        }
        actor.basicAct(money / 2);
    }

    @Override
    public void dangerAct(float money) {
        if (money < 5000){
            System.out.println("价格太低，拒绝此次危险演出");
            return;
        }
        actor.dangerAct(money / 2);
    }

    public static void main(String[] args) {
        Actor actor = new Actor();
        ActorClient actorClient = new ActorClient(actor);
        // 直接找到演员
        System.out.println("直接找演员");
        actor.basicAct(2000);
        actor.dangerAct(5000);
        System.out.println("---------------------------");
        // 通过静态代理中间人找到演员
        System.out.println("通过中间人找演员");
        actorClient.basicAct(2000);
        actorClient.basicAct(5000);
    }
}
