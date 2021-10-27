package exam.alibaba0415;

/**
 * @author gaoyouxin
 * @date 2021/4/15 - 18:31
 */
import java.util.BitSet;

public class IpListImpl implements IpList{
    private static volatile BitSet low = new BitSet(Integer.MAX_VALUE);
    private static volatile BitSet high = new BitSet(Integer.MAX_VALUE);
    @Override
    public boolean isInList(String ip) {
        int ipInt = ipStrToInt(ip);
        return ipInt < 0 ? high.get(ipInt+Integer.MAX_VALUE+1) : low.get(ipInt);
    }

    // 将ip地址转化为int
    private static int ipStrToInt(String ip) {
        if (ip == null || ip.length() == 0) {
            System.out.println("Empty ip");
            return 0;
        }
        String[] arr = ip.split("\\.");
        if (arr == null || arr.length != 4) {
            System.out.println("Wrong ip");
        }
        if ("128.0.0.0".equals(ip)) {
            return Integer.MIN_VALUE;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(getByteBinaryStr(new Integer(arr[i])));
        }
        String intStr = sb.toString();
        if (intStr.charAt(0) == '1') {
            char[] chars = intStr.toCharArray();
            chars[0] = '0';
            intStr = new String(chars);
            return 0 - Integer.valueOf(intStr, 2).intValue();
        }
        return Integer.valueOf(intStr, 2).intValue();
    }

    // 固定8位，不足补零
    private static String getByteBinaryStr(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append((num & 1) == 1 ? 1 : 0);
            num = num >> 1;
        }
        return sb.reverse().toString();
    }
}
