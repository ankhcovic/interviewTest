package javabasic.dynamicproxy;


/*import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;*/


/**
 * 使用CGLib的Enhancer类创建代理对象
 * @author gaoyouxin
 * @date 2021/4/2 - 10:30
 */
public class ClientByEnhancer {
    public static void main(String[] args) {
        final Actor2 actor = new Actor2();

        /*Actor cglibActor = (Actor) Enhancer.create(actor.getClass(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                        String name = method.getName();
                        Float money = (Float) args[0];
                        Object rtValue = null;
                        if ("basicAct".equals(name)) {
                            if (money > 2000) {
                                rtValue = method.invoke(actor, money / 2);
                            }
                        }
                        if ("dangerAct".equals(name)) {
                            if (money > 5000) {
                                rtValue = method.invoke(actor, money / 2);
                            }
                        }
                        return rtValue;
                    }
                });*/
    }
}


