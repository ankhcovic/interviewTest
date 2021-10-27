package exam.alibaba0415;

public class BitMapIpList implements IpList {

    private static volatile IpSet ipSet = null;

    public BitMapIpList() {
        ipSet = new IpSet();
        ipSet.set(ipToLong("192.168.0.1"));
    }

    @Override
    public boolean isInList(String ip) {
        return ipSet.get(ipToLong(ip));
    }

    /**
     * ���ַ�����ʽ��ip��ַת��Ϊ��������int����ָ��������Է���long
     * @param ip
     * @return
     */
    private long ipToLong(String ip) {
        long ret = 0;
        String[] ipStrArr = ip.split("\\.");
        for (int i = 0; i < 4; i++) {
            ret <<= 8;
            ret += Long.valueOf(ipStrArr[i]);
        }
        return ret;
    }

    // ����bitsetʵ��һ��ipset��ͬʱ���Խ������λ������
    private class IpSet {

        private long[] words;

        public IpSet() {
            words = new long[1 << 26];
        }

        public void set(long bitIndex) {
            int arrIndex = (int)(bitIndex >> 6);
            words[arrIndex] |= (1L << bitIndex);
        }

        public boolean get(long bitIndex) {
            int arrIndex = (int)(bitIndex >> 6);
            return (words[arrIndex] & (1L << bitIndex)) != 0;
        }
    }
}
