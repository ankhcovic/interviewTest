package javaBasic.staticProxy;

/**
 *  ��Ϊ��̬�������ֽ���һ�����ʹ����ã�����ɼ��ء����ڱ�������ɵģ����Խ�����̬����
 *
 *  ��̬������Ҫ������ͱ�������ʵ����ͬ�Ľӿڡ�
 *  ��̬�����ȱ�������࣬��Ϊһ��������ֻ�ܴ���һ���ӿڣ�
 *  ��������Ҫ�������ӿ�ʱ�ͻ�����ǳ���Ĵ����࣬�����ͻ���ɴ�������Դ���ġ�
 *  ����Ҳ������ά�������ӿ����ӷ������������ί���඼Ҫ�����޸ģ������̫��
 * @author gaoyouxin
 * @date 2021/4/16 - 12:45
 */
public class ActorClient implements IActor{

    // �����������Ϊһ����Ա�������ṩһ���вι���
    private Actor actor;

    public ActorClient(Actor actor) {
        this.actor = actor;
    }

    // ʵ����Ҫʵ�ֵķ��������ҵ��ñ�������ķ���������ǿ
    // ����һ�����⣬ÿ��������ֻ�ܴ���һ����������
    // ���ӿ����ӷ���ʱ��������ͱ������඼��Ҫ�޸ģ���Ϻ�ǿ
    @Override
    public void basicAct(float money) {
        if (money < 2000){
            System.out.println("�۸�̫�ͣ��ܾ��˴λ����ݳ�");
            return;
        }
        actor.basicAct(money / 2);
    }

    @Override
    public void dangerAct(float money) {
        if (money < 5000){
            System.out.println("�۸�̫�ͣ��ܾ��˴�Σ���ݳ�");
            return;
        }
        actor.dangerAct(money / 2);
    }

    public static void main(String[] args) {
        Actor actor = new Actor();
        ActorClient actorClient = new ActorClient(actor);
        // ֱ���ҵ���Ա
        System.out.println("ֱ������Ա");
        actor.basicAct(2000);
        actor.dangerAct(5000);
        System.out.println("---------------------------");
        // ͨ����̬�����м����ҵ���Ա
        System.out.println("ͨ���м�������Ա");
        actorClient.basicAct(2000);
        actorClient.basicAct(5000);
    }
}
