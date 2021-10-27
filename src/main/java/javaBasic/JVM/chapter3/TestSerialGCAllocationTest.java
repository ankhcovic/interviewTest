package javaBasic.JVM.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author gaoyouxin
 * @date 2021/4/21 - 14:18
 */
class TestSerialGCAllocationTest {

    @Test
    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    void testAllocation() {
    }

    @Test
    /**
     * VM参数：-XX:+UseSerialGC -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     * -XX:PretenureSizeThreshold=3145728
     */
    void testPretenureSizeThreshold() {
    }

    @Test
    void testTenuringThreshold() {
    }

    @Test
    void testTenuringThreshold2() {
    }

    @Test
    void testHandlePromotion() {
    }

    @Test
    void main() {
    }
}