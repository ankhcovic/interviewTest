package exam.alibaba0415;

/**
 * @author gaoyouxin
 * @date 2021/4/15 - 15:10
 */
public interface IpList {
    /**
     * �ж�ָ����ipv4��ַ�Ƿ��ڵ�ǰ������
     *
     * @param ip
     *            ָ����ip��ֵַ(v4)
     * @return true: �������У� false: ����������
     */
    boolean isInList(String ip);
}
