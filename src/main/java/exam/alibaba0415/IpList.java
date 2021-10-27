package exam.alibaba0415;

/**
 * @author gaoyouxin
 * @date 2021/4/15 - 15:10
 */
public interface IpList {
    /**
     * 判断指定的ipv4地址是否在当前名单中
     *
     * @param ip
     *            指定的ip地址值(v4)
     * @return true: 在名单中， false: 不在名单中
     */
    boolean isInList(String ip);
}
